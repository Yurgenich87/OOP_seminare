package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

/**
 * Реализация поведения магазина
 */
public class Market implements iMarketBehaviour, iQueueBehaviour {
	private List<iActorBehaviour> queue;

	/**
	 * Конструктор класса, инициализирующий очередь
	 */
	public Market() {
		this.queue = new ArrayList<iActorBehaviour>();
	}

	/**
	 * Добавление клиента в очередь магазина
	 *
	 * @param client добавляемый клиент
	 */
	@Override
	public void acceptToMarket(iActorBehaviour client) {
		System.out.println(client.getActor().getName() + " клиент пришел в магазин ");
		takeInQueue(client);
	}

	/**
	 * Добавление клиента в очередь магазина
	 *
	 * @param client добавляемый клиент
	 */
	@Override
	public void takeInQueue(iActorBehaviour client) {
		this.queue.add(client);
		System.out.println(client.getActor().getName() + " клиент добавлен в очередь ");
	}

	/**
	 * Удаление клиентов из магазина
	 *
	 * @param clients список клиентов, которых необходимо удалить из магазина
	 */
	@Override
	public void releaseFromMarket(List<Actor> clients) {
		for (Actor client : clients) {
			System.out.println(client.getName() + " клиент ушел из магазина ");
			queue.remove(client);
		}
	}

	/**
	 * Обновление состояния магазина
	 */
	@Override
	public void update() {
		takeOrder();
		giveOrder();
		releaseFromQueue();
	}

	/**
	 * Выдача заказа клиенту, находящемуся первым в очереди
	 */
	@Override
	public void giveOrder() {
		for (iActorBehaviour client : queue) {
			if (client.isMakeOrder()) {
				client.setTakeOrder(true);
				System.out.println(client.getActor().getName() + " клиент получил свой заказ ");
			}
		}
	}

	/**
	 * Удаление клиентов из очереди, у которых заказ выполнен
	 */
	@Override
	public void releaseFromQueue() {
		List<Actor> releaseClients = new ArrayList<>();
		for (iActorBehaviour client : queue) {
			if (client.isTakeOrder()) {
				releaseClients.add(client.getActor());
				System.out.println(client.getActor().getName() + " клиент ушел из очереди ");
			}
		}
		releaseFromMarket(releaseClients);
	}

	/**
	 * Получение заказа клиентом, находящимся первым в очереди
	 */
	@Override
	public void takeOrder() {
		for (iActorBehaviour client : queue) {
			if (!client.isMakeOrder()) {
				client.setMakeOrder(true);
				System.out.println(client.getActor().getName() + " клиент сделал заказ ");
			}
		}
	}

	/**
	 * Возврат заказа
	 *
	 * @
	 */
	@Override
	public void returnOrder(Actor actor) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'returnOrder'");
	}

	@Override
	public boolean canReturnOrder(Actor actor) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'canReturnOrder'");
	}

}

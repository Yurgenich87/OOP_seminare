package Classes;

import Interfaces.iReturnOrder;

public class Client implements iReturnOrder {
	private String name;
	private int orderNum;

	/**
	 * Конструктор класса клиента
	 * 
	 * @param name     имя клиента
	 * @param orderNum номер заказа
	 */
	public Client(String name, int orderNum) {
		this.name = name;
		this.orderNum = orderNum;
	}

	/**
	 * Получение имени клиента
	 * 
	 * @return имя клиента
	 */
	public String getName() {
		return name;
	}

	/**
	 * Получение номера заказа
	 * 
	 * @return номер заказа
	 */
	public int getOrderNum() {
		return orderNum;
	}

	/**
	 * Реализация интерфейсного метода isReturnable для проверки возможности
	 * возврата заказа
	 * 
	 * @param canBeReturned флаг возможности возврата заказа
	 * @return результат проверки возможности возврата заказа
	 */
	@Override
	public boolean isReturnable(boolean canBeReturned) {
		return canBeReturned;
	}

	/**
	 * Реализация интерфейсного метода returnOrder для возврата заказа по ID
	 * 
	 * @param orderId ID заказа
	 * @return флаг успешности возврата заказа
	 */
	@Override
	public boolean returnOrder(int orderId) {
		// Код, который будет осуществлять возврат заказа по ID
		return true;
	}
}

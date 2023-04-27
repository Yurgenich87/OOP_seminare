import java.util.List;

import Classes.Client;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromotionalClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviour;

public class App {
	/**
	 * Этот метод является точкой входа в приложение.
	 * 
	 * @param args аргументы командной строки
	 * @throws Exception если происходит ошибка
	 */
	public static void main(String[] args) throws Exception {

		Market market = new Market();
		iActorBehaviour client1 = new OrdinaryClient("Boris");
		iActorBehaviour client2 = new SpecialClient("Fedor", 1101);
		iActorBehaviour client3 = new OrdinaryClient("Dasha");

		// Создание первой акции и добавление клиентов
		PromotionalClient promo1 = new PromotionalClient("Летние скидки");
		promo1.addPromoClient(client1);
		promo1.addPromoClient(client2);

		// Создание второй акции и добавление клиентов
		PromotionalClient promo2 = new PromotionalClient("Зимние скидки");
		promo2.addPromoClient(client3);

		market.acceptToMarket(client1);
		market.acceptToMarket(client2);
		market.acceptToMarket(client3);
		market.update();

		// Вывод списка клиентов в каждой акции
		System.out.println("Клиенты, участвующие в акции " + promo1.getPromoName() + ":");
		for (iActorBehaviour promoClient : promo1.getPromoClients()) {
			System.out.println(promoClient.getName());
		}

		System.out.println("Клиенты, участвующие в акции " + promo2.getPromoName() + ":");
		for (iActorBehaviour promoClient : promo2.getPromoClients()) {
			System.out.println(promoClient.getName());
		}

	}
}

// Использование интерфейса в классе клиента:

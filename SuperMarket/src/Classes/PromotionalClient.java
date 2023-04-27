package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;

public class PromotionalClient {
	private String promoName;
	private static int promoClientNum;
	private List<iActorBehaviour> promoClients = new ArrayList<>();

	/**
	 * 
	 * Конструктор класса, инициализирующий название промо-кампании.
	 * 
	 * @param promoName название промо-кампании
	 */
	public PromotionalClient(String promoName) {
		this.promoName = promoName;
		promoClientNum++;
	}

	/**
	 * 
	 * Метод для получения названия промо-кампании.
	 * 
	 * @return название промо-кампании
	 */
	public String getPromoName() {
		return promoName;
	}

	/**
	 * 
	 * Метод для получения количества созданных промо-клиентов.
	 * 
	 * @return количество созданных промо-клиентов
	 */
	public static int getPromoClientNum() {
		return promoClientNum;
	}

	/**
	 * 
	 * Метод для добавления клиента в список клиентов промо-кампании.
	 * 
	 * @param client1 клиент для добавления
	 */
	public void addPromoClient(iActorBehaviour client1) {
		promoClients.add(client1);
	}

	/**
	 * 
	 * Метод для получения списка клиентов промо-кампании.
	 * 
	 * @return список клиентов промо-кампании
	 */
	public List<iActorBehaviour> getPromoClients() {
		return promoClients;
	}
}

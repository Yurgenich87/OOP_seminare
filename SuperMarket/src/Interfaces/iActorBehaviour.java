package Interfaces;

import Classes.Actor;
import Classes.Client;

/**
 * Интерфейс, определяющий поведение клиента
 */
public interface iActorBehaviour {

	/**
	 * Устанавливает значение для возможности клиента делать заказы
	 * 
	 * @param makeOrder true, если может делать заказы, иначе false
	 */
	void setMakeOrder(boolean makeOrder);

	/**
	 * Устанавливает значение для возможности клиента забирать заказы
	 * 
	 * @param pickUpOrder true, если может забирать заказы, иначе false
	 */
	void setTakeOrder(boolean pickUpOrder);

	/**
	 * Проверяет, может ли клиент делать заказы
	 * 
	 * @return true, если может делать заказы, иначе false
	 */
	boolean isMakeOrder();

	/**
	 * Проверяет, может ли клиент забирать заказы
	 * 
	 * @return true, если может забирать заказы, иначе false
	 */
	boolean isTakeOrder();

	/**
	 * Возвращает объект класса клиента
	 * 
	 * @return объект класса клиента
	 */
	Actor getActor();

	/**
	 * Получить название клиента
	 * 
	 * @return название клиента
	 */
	String getName();
}

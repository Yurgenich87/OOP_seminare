package Interfaces;

import Classes.Actor;

/**
 * Интерфейс, определяющий поведение очереди на рынке
 */
public interface iQueueBehaviour {

	/**
	 * Возвращает заказ клиенту
	 * 
	 * @param actor объект, представляющий клиента
	 */
	void returnOrder(Actor actor);

	/**
	 * Добавляет клиента в очередь
	 * 
	 * @param actor объект, представляющий клиента
	 */
	void takeInQueue(iActorBehaviour actor);

	/**
	 * Удаляет клиентов из очереди
	 */
	void releaseFromQueue();

	/**
	 * Отдаёт заказ клиенту, находящемуся первым в очереди
	 */
	void takeOrder();

	/**
	 * Принимает заказ от клиента
	 */
	void giveOrder();

	/**
	 * Проверяет, может ли клиент вернуть заказ
	 * 
	 * @param actor объект, представляющий клиента
	 * @return true, если клиент может вернуть заказ, иначе false
	 */
	boolean canReturnOrder(Actor actor);
}

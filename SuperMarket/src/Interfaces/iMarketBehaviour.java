package Interfaces;

import java.util.List;

import Classes.Actor;

/**
 * Интерфейс, определяющий поведение рынка
 */
public interface iMarketBehaviour {

	/**
	 * Добавляет клиента на рынок
	 * 
	 * @param actor объект, представляющий клиента
	 */
	void acceptToMarket(iActorBehaviour actor);

	/**
	 * Удаляет клиентов из списка на рынке
	 * 
	 * @param actors список объектов, представляющих клиентов
	 */
	void releaseFromMarket(List<Actor> actors);

	/**
	 * Обновляет состояние рынка
	 */
	void update();
}

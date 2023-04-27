package Classes;

import Interfaces.iActorBehaviour;

public class TaxService implements iActorBehaviour {
	private String name;
	private boolean isTakeOrder;
	private boolean isMakeOrder;

	/**
	 * Конструктор класса "TaxService".
	 * Устанавливает имя клиента по умолчанию "Tax audit".
	 */
	public TaxService() {
		this.name = "Tax audit";
	}

	/**
	 * Возвращает название клиента типа "TaxService".
	 *
	 * @return название клиента
	 */
	public String getName() {
		return name;
	}

	/**
	 * Проверяет, может ли клиент типа "TaxService" делать заказы.
	 *
	 * @return true, если может делать заказы, иначе false
	 */
	@Override
	public boolean isMakeOrder() {
		return isMakeOrder;
	}

	/**
	 * Проверяет, может ли клиент типа "TaxService" забирать заказы.
	 *
	 * @return true, если может забирать заказы, иначе false
	 */
	@Override
	public boolean isTakeOrder() {
		return isTakeOrder;
	}

	/**
	 * Устанавливает значение для возможности клиента типа "TaxService" делать
	 * заказы.
	 *
	 * @param makeOrder true, если может делать заказы, иначе false
	 */
	@Override
	public void setMakeOrder(boolean makeOrder) {
		isMakeOrder = makeOrder;
	}

	/**
	 * Устанавливает значение для возможности клиента типа "TaxService" забирать
	 * заказы.
	 *
	 * @param pickUpOrder true, если может забирать заказы, иначе false
	 */
	@Override
	public void setTakeOrder(boolean pickUpOrder) {
		isTakeOrder = pickUpOrder;
	}

	/**
	 * Возвращает объект класса клиента типа "OrdinaryClient" с заданным именем.
	 *
	 * @return объект класса клиента типа "OrdinaryClient"
	 */
	@Override
	public Actor getActor() {
		return new OrdinaryClient(name);
	}

}

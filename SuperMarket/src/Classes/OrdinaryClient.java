package Classes;

public class OrdinaryClient extends Actor {

	/**
	 * Конструктор класса OrdinaryClient
	 * 
	 * @param name имя клиента
	 */
	public OrdinaryClient(String name) {
		super(name);
	}

	/**
	 * Возвращает имя клиента
	 * 
	 * @return имя клиента
	 */
	@Override
	public String getName() {
		return super.name;
	}

	/**
	 * Возвращает флаг о том, сделал ли клиент заказ
	 * 
	 * @return флаг о том, сделал ли клиент заказ
	 */
	@Override
	public boolean isMakeOrder() {
		return super.isMakeOrder;
	}

	/**
	 * Возвращает флаг о том, взял ли клиент заказ
	 * 
	 * @return флаг о том, взял ли клиент заказ
	 */
	@Override
	public boolean isTakeOrder() {
		return super.isTakeOrder;
	}

	/**
	 * Устанавливает флаг о том, сделал ли клиент заказ
	 * 
	 * @param makeOrder флаг о том, сделал ли клиент заказ
	 */
	@Override
	public void setMakeOrder(boolean makeOrder) {
		super.isMakeOrder = makeOrder;
	}

	/**
	 * Устанавливает флаг о том, взял ли клиент заказ
	 * 
	 * @param pickUpOrder флаг о том, взял ли клиент заказ
	 */
	@Override
	public void setTakeOrder(boolean pickUpOrder) {
		super.isTakeOrder = pickUpOrder;
	}

	/**
	 * Возвращает объект клиента
	 * 
	 * @return объект клиента
	 */
	@Override
	public Actor getActor() {
		return this;
	}

}

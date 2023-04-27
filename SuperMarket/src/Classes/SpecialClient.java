package Classes;

/**
 * Класс SpecialClient наследует класс Actor и представляет собой специального
 * клиента, который имеет уникальный идентификатор VIP.
 */
public class SpecialClient extends Actor {

	/** Уникальный идентификатор VIP */
	private int idVIP;

	/**
	 * 
	 * Конструктор класса SpecialClient.
	 * 
	 * @param name  имя специального клиента
	 * @param idVIP уникальный идентификатор VIP
	 */
	public SpecialClient(String name, int idVIP) {
		super(name);
		this.idVIP = idVIP;
	}

	/**
	 * 
	 * Метод для получения имени специального клиента.
	 * 
	 * @return имя специального клиента
	 */
	@Override
	public String getName() {
		return super.name;
	}

	/**
	 * 
	 * Метод для получения уникального идентификатора VIP.
	 * 
	 * @return уникальный идентификатор VIP
	 */
	public int getIdVIP() {
		return idVIP;
	}

	/**
	 * 
	 * Метод для проверки, делает ли специальный клиент заказ.
	 * 
	 * @return true, если специальный клиент делает заказ, false в противном случае
	 */
	@Override
	public boolean isMakeOrder() {
		return super.isMakeOrder;
	}

	/**
	 * 
	 * Метод для проверки, забирает ли специальный клиент заказ.
	 * 
	 * @return true, если специальный клиент забирает заказ, false в противном
	 *         случае
	 */
	@Override
	public boolean isTakeOrder() {
		return super.isTakeOrder;
	}

	/**
	 * 
	 * Метод для установки флага, делает ли специальный клиент заказ.
	 * 
	 * @param makeOrder true, если специальный клиент делает заказ, false в
	 *                  противном случае
	 */
	@Override
	public void setMakeOrder(boolean makeOrder) {
		super.isMakeOrder = makeOrder;
	}

	/**
	 * 
	 * Метод для установки флага, забирает ли специальный клиент заказ.
	 * 
	 * @param pickUpOrder true, если специальный клиент забирает заказ, false в
	 *                    противном случае
	 */
	@Override
	public void setTakeOrder(boolean pickUpOrder) {
		super.isTakeOrder = pickUpOrder;
	}

	/**
	 * 
	 * Метод для получения объекта класса Actor, представляющего специального
	 * клиента.
	 * 
	 * @return объект класса Actor, представляющего специального клиента
	 */
	@Override
	public Actor getActor() {
		return this;
	}
}
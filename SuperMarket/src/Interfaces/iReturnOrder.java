package Interfaces;

/**
 * Интерфейс, представляющий возможность возврата заказа
 */
public interface iReturnOrder {

	/**
	 * 
	 * Метод, позволяющий узнать, может ли товар быть возвращен
	 * 
	 * @param canBeReturned флаг, указывающий, может ли товар быть возвращен
	 * @return true, если товар может быть возвращен, иначе false
	 */
	public boolean isReturnable(boolean canBeReturned);

	/**
	 * 
	 * Метод, позволяющий вернуть товар по его ID
	 * 
	 * @param orderId ID заказа, который требуется вернуть
	 * @return true, если товар был успешно возвращен, иначе false
	 */
	public boolean returnOrder(int orderId);
}
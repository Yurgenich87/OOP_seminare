package Products;

public class HotDrink extends Product {
	private int volume;
	private int temperature;

	public HotDrink(String name, double price, int volume, int temperature) {
		super(name, price);
		this.volume = volume;
		this.temperature = temperature;
	}

	public int getTemperature() {
		return this.temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return String.format("name='%s', price=%.2f, volume=%d, temperature=%d", super.getName(), super.getPrice(),
				this.volume, this.temperature);
	}
}
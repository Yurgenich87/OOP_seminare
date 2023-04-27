import Products.Product;
import Products.BottleOfWater;
<<<<<<< HEAD
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("Cola",88.0);
        item1.setPrice(98.0);

        VendingMachine itemMachin = new VendingMachine(300);
        itemMachin.addProduct(item1);
        itemMachin.addProduct(new Product("Чипсы", 60.0));
        itemMachin.addProduct(new Product("Масло", 50.0));
        itemMachin.addProduct(new Product("Хлеб", 40.0));
        itemMachin.addProduct(new Product("Снек", 20.0));
        itemMachin.addProduct(new BottleOfWater("Cola", 88.0, 500 ));
        itemMachin.addProduct(new BottleOfWater("Water", 188.0, 1500 ));

        for(Product prod: itemMachin.getProdAll())
        {
            System.out.println(prod.toString());
        }
       
    }
=======
import Products.HotDrink;
import VendingMachines.VendingMachine;

public class App {
	public static void main(String[] args) throws Exception {

		Product item1 = new Product("Cola", 88.0);
		item1.setPrice(98.0);

		VendingMachine itemMachin = new VendingMachine(300);
		itemMachin.addProduct(item1);
		itemMachin.addProduct(new Product("Чипсы", 60.0));
		itemMachin.addProduct(new Product("Масло", 50.0));
		itemMachin.addProduct(new Product("Хлеб", 40.0));
		itemMachin.addProduct(new Product("Снек", 20.0));
		itemMachin.addProduct(new BottleOfWater("Cola", 88.0, 500));
		itemMachin.addProduct(new BottleOfWater("Water", 188.0, 1500));
		itemMachin.addProduct(new HotDrink("cofe", 78, 250, 60));
		itemMachin.addProduct(new HotDrink("espresso", 90, 250, 60));
		itemMachin.addProduct(new HotDrink("hot_chocolate", 144, 250, 60));
		itemMachin.addProduct(new HotDrink("cocoa", 110, 250, 70));

		for (Product prod : itemMachin.getProdAll()) {
			System.out.println(prod.toString());
		}

	}
>>>>>>> 47690ed19bb480adb45231360c6eb045fb45d679
}

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class GClab12part2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		List<Car> carMenu = new ArrayList<>();
		List<Car> carsBought = new ArrayList<>();
		int userSelection = 0;
		String userCont = "y";
		String userBuy = "y";

		carMenu.add(new Car("Ford", "Explorer", 2019, 32365.00));
		carMenu.add(new Car("BMW", "X7", 2019, 73900.00));
		carMenu.add(new Car("Jeep", "Cherokee", 2019, 24795.00));
		carMenu.add(new Usedcar("Volkswagen", "Bus", 1963, 78900.00, 27864.56));
		carMenu.add(new Usedcar("AMC", "Gremlin", 1971, 2500.00, 89792.69));
		carMenu.add(new Usedcar("Pontiac", "GTO", 1967, 55000.00, 34188.91));

		while (userCont.equalsIgnoreCase("y")) { 
			System.out.println("Current inventory:");

			for (int i = 0; i < carMenu.size(); i++) { 
				System.out.print((i + 1) + ": ");
				System.out.println(carMenu.get(i));
			}
			System.out.println(carMenu.size() + 1 + ": Quit");

			userSelection = Validator.getInt(scnr, "Which car would you like?", 1, carMenu.size() + 1); 
			
			
			if (userSelection > carMenu.size()) { 
				System.out.println("You have purchased:");
				double total = 0.0;
				for (Car boughtCar : carsBought) { 
					System.out.println(boughtCar);
					total+=boughtCar.getPrice();
				}
				System.out.print("Your total amount due is $");
				System.out.print(total);  
				System.out.println("Have a great day!");
				userCont = "n";
			} else {
				System.out.println(carMenu.get(userSelection - 1)); 
				
				userBuy = Validator.getString(scnr, "Would you like to buy this car? (y/n)");
				if (userBuy.equalsIgnoreCase("y")) {
					carsBought.add(carMenu.get(userSelection - 1));
					carMenu.remove(userSelection - 1); 
					System.out.println("Have a great day!");
				}
			}
		}

		scnr.close();


	}
}

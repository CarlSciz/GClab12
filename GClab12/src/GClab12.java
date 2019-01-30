import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GClab12 {
	public static void main(String[] args) {
		int userCars = 0;
		List<Car> userCarList = new ArrayList<>();
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		userCars = Validator.getInt(scnr, "How many cars would you entering?");

		for (int i = 0; i < userCars; i++) { 
			userCarList.add(getCar());
		}
		System.out.println("Current inventory:");
		for (Car thisCar : userCarList) {
			System.out.println(thisCar);
		}

		scnr.close();
	}

	public static Car getCar() { 
		Scanner scnr = new Scanner(System.in);
		Car myCar = new Car();
		myCar.setMake(Validator.getString(scnr, "Please enter the make of the car:"));
		myCar.setModel(Validator.getString(scnr, "Please enter the model of the car:"));
		myCar.setYear(Validator.getInt(scnr, "Please enter the year of the car:", 1950, 2019)); 
		myCar.setPrice(Validator.getDouble(scnr, "Please enter the price of the car:", 1.00, 1000000000.00)); 
		return myCar;
	}

}

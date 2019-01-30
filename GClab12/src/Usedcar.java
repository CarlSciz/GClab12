
public class Usedcar extends Car {
	
	protected double mileage = 0.0;

	public Usedcar (String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	@Override
	public String toString() {

		return String.format( make,  model, year, "$", price, mileage, " miles (Used)");
	}

}

package hu.bme.mit.inf.cars;

public class SportsCar {
    private String numberPlate;
    private int yearOfManufacture;
    private double acceleration;
    
    public SportsCar(String numberPlate, int yearOfManufacture, double acceleration) {
		super();
		this.numberPlate = numberPlate;
		this.yearOfManufacture = yearOfManufacture;
		this.acceleration = acceleration;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public double getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}

	@Override
	public String toString() {
		return "Car [numberPlate=" + numberPlate + ", yearOfManufacture=" + yearOfManufacture + ", acceleration="
				+ acceleration + "]";
	}
	
    
}

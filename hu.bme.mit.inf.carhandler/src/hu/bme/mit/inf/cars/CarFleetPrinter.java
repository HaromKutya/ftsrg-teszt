package hu.bme.mit.inf.cars;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author vetro
 * @param args Arguments
 */

public class CarFleetPrinter {
	private List<SportsCar> cars = new LinkedList<>();
	
	public List<SportsCar> getCars() {
		return cars;
	}

	public void setCars(List<SportsCar> cars) {
		this.cars = cars;
	}

	private String manifest = "The car fleet consists of:\n";
	
	public CarFleetPrinter() {
		manifest = getCarManifest();
	}
	
	public static void main(String[] args) {
		CarFleetPrinter fleetPrinter = new CarFleetPrinter();
		fleetPrinter.print();
	}

	private void print() {
		System.out.println(manifest);
	}

	private String getCarManifest() {
		for (int i = 0; i < 10; i++)
			cars.add(generateCar());
		
		for (SportsCar car : cars) {
			if (car.getAcceleration() < 5)
				manifest += "- Car: " + car + "\n";
		}
		return manifest;
	}

	private SportsCar generateCar() {
		Random random = new Random();
		return new SportsCar(
					"MIT-" +
					(String.format("%03d", random.nextInt(1000))),
					2000 + random.nextInt(14),
					3.0 + random.nextDouble() * 4
				);
	}
}

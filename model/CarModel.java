package aiwa.model;

import java.util.ArrayList;
import java.util.Comparator;

import aiwa.database.CarTable;
import aiwa.entity.Car;
import aiwa.view.CarShopView;

public class CarModel {

	Car car = new Car();
	CarTable carTable = new CarTable();
	CarShopView carShopView = new CarShopView();

	public void showAllCars() {
		ArrayList<Car> cars = CarTable.getData();
		carShopView.showInfo(cars);
	}

	public Car findByCompany(String companyName) {

		ArrayList<Car> cars = CarTable.getData();
		ArrayList<Car> matchingCars = new ArrayList<>();

		for (Car car : cars) {
			if (car.getCompany().toLowerCase().contains(companyName.toLowerCase())) {
				matchingCars.add(car);
			}

		}
		if (matchingCars.isEmpty()) {
			System.out.println("No cars found for the company: \" " + companyName);

		} else {
			carShopView.showInfo(matchingCars);
		}
		return car;
	}

	public Car findByName(String carName) {

		ArrayList<Car> cars = CarTable.getData();
		ArrayList<Car> matchingCars = new ArrayList<>();

		for (Car car : cars) {
			if (car.getName().toLowerCase().contains(carName.toLowerCase())) {
				matchingCars.add(car);
			}
		}
		if (matchingCars.isEmpty()) {
			System.out.println("No cars found for the name: \" " + carName);

		} else {
			carShopView.showInfo(matchingCars);
		}

		return car;
	}

	public Car findByPrice(int min, int max) {

		ArrayList<Car> cars = CarTable.getData();
		ArrayList<Car> matchingCars = new ArrayList<>();

		for (Car car : cars) {
			if (car.getPrice() >= min && car.getPrice() <= max) {
				matchingCars.add(car);
			}
		}
		if (matchingCars.isEmpty()) {
			System.out.println("No cars found for the Price: \" " + min + "and" + max);

		} else {
			carShopView.showInfo(matchingCars);
		}

		return car;
	}

	public Car findByModel(int min, int max) {

		ArrayList<Car> cars = CarTable.getData();
		ArrayList<Car> matchingCars = new ArrayList<>();

		for (Car car : cars) {
			if (car.getYearmodel() >= min && car.getYearmodel() <= max) {
				matchingCars.add(car);
			}
		}
		if (matchingCars.isEmpty()) {
			System.out.println("No cars found for the model: \" " + min + "and" + max);

		} else {
			carShopView.showInfo(matchingCars);
		}

		return car;
	}

	public void listCarsByPrice() {
		ArrayList<Car> cars = CarTable.getData();

		// Sort cars by price
		cars.sort(Comparator.comparingInt(Car::getPrice));

		carShopView.showInfo(cars);
	}

	public void listCarsByModel() {
		ArrayList<Car> cars = CarTable.getData();

		// Sort cars by price
		cars.sort(Comparator.comparingInt(Car::getYearmodel));

		carShopView.showInfo(cars);
	}

}
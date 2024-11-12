package aiwa.view;

import java.util.ArrayList;
import java.util.Scanner;

import aiwa.entity.Car;

public class CarShopView {
	Car car = new Car();
	Scanner scanner = new Scanner(System.in);

	public void mainMenu() {
		System.out.println("===========================================");
		System.out.println("|🚗🚓🚕🚙 Welcome to Our Car Shop 🚒🚑🚎🛻 |");
		System.out.println("===========================================");
		System.out.println("| Option |          Description            |");
		System.out.println("===========================================");
		System.out.println("|   1    | 🚘 Show All Cars                |");
		System.out.println("|   2    | 🔍 Search by Name               |");
		System.out.println("|   3    | 🏢 Search by Company            |");
		System.out.println("|   4    | 🚙 Search by Model              |");
		System.out.println("|   5    | 💲 Search by Price              |");
		System.out.println("|   6    | 💲 Listby Price                 |");
		System.out.println("|   7    | 💲 Listby Model                 |");
		System.out.println("|   8    | ❌ Exit                         |");
		System.out.println("===========================================");
		System.out.println("|✨Please enter the number of your choice✨|");
		System.out.println("===========================================");
		System.out.print(">>>>  ");
	}

	public void showInfo(ArrayList<Car> cars) {
		// Print welcome message once
		System.out.println("=============================================");
		System.out.println("| 🚗  🚗 Welcome to The Car ShowRoom 🚗  🚗 |");
		System.out.println("=============================================");

		for (Car car : cars) {
			System.out.println("=============================================");
			System.out.println("|                  Details                  |");
			System.out.println("=============================================");
			System.out.printf("| Car Name:    %-28s |\n", car.getName());
			System.out.printf("| Company:     %-28s |\n", car.getCompany());
			System.out.printf("| Price:       $%-27s |\n", car.getPrice());
			System.out.printf("| Year Model:  %-28s |\n", car.getYearmodel());
			System.out.println("=============================================");
		}

	}

}
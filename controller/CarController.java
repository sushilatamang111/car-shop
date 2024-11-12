package aiwa.controller;

import java.util.Scanner;

import aiwa.model.CarModel;
import aiwa.view.CarShopView;

public class CarController {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		CarModel carModel = new CarModel();
		CarShopView carShopView = new CarShopView();

		System.out.println(
				"                                                                                                    ");
		System.out.println(
				"                                           .-+*****#######*******+-..                                ");
		System.out.println(
				"                                        .:+##*:.        ...==*@%%%%%#=.                              ");
		System.out.println(
				"                                      .-##=:=-.           .+: :#%%%%%%%*:.                          ");
		System.out.println(
				"                        ..........:::*%#=::==:............:=::=#%%%%%%%%@#***+===--::::.            ");
		System.out.println(
				"           .:=*####%%%%%%%@@@@@@@@%%##%%%%%%%%@@@@@@@@@@@@%#%%%%%%%%%%%%%%%%%%%%%%%%%%%%*.          ");
		System.out.println(
				"          .*::::::--=+=--:::::::::::.:::::::::::::::::::::::-----------------------=====++          ");
		System.out.println(
				"           *.  .-##+++++=:+:                                 .%. .+#%%%###=:.          .%%-         ");
		System.out.println(
				"         -#%%#*-#*+:.....:+-.                           .....*+ .#%+..:--..-*..        :@*.         ");
		System.out.println(
				"          .:#-.=#=.=%#%%#..==                      ....::::::: .:%=.-###%%* .+       .-=.           ");
		System.out.println(
				"            .::-+:-#%%%%%* :####################################%%:.+%%%%%@:.#++++++-::.            ");
		System.out.println(
				"               .--.*@+#%@-.:*----------::::::::::::::::::::::::::=-.-#%*%%+.:+                      ");
		System.out.println(
				"                .==.::-:. -+.                                    .==..:::..=+.                      ");
		System.out.println(
				"                 ..-*###*::                                       ..:-*#*=:.                        ");
		System.out.println(
				"                                                                                                    ");
		System.out.println(
				"               ..-+***+-..            ..:::..         .::--==++=-:...        ..:=****=:.            ");
		System.out.println(
				"             :****+++***+**+.         .*=+=+-         :+-:=---=+=*=+*+:.    :*+=++-=++***=          ");
		System.out.println(
				"           .**++*#*#**##***+.        .****=++:        :+++*###*#***+-=*-.  -*-=+*=:=**+++.          ");
		System.out.println(
				"          .*#+**-..    ..+..        .**=**+=*+:       :+++*:.   ..:+*++=.  +*+*+.    ....           ");
		System.out.println(
				"          ==***.                    =***+.=+-+=.      :+*=*:.     .=++*=.  -*+=**=..                ");
		System.out.println(
				"         .**#*-                    -+=+*..:+++*-.     :=:=*:.....=*=-=+:.  .:#**=-=*+*#-            ");
		System.out.println(
				"         .+*:+=                   :+-**:   :++**..    :++**=:=-.*+-:+*:      ..=#*****++#+          ");
		System.out.println(
				"          =**+*.                 .*++=+=++++***++.    :+===+###*-=+=.              ..*#=-+-         ");
		System.out.println(
				"          .*****=.      -#+     .++++#*#*#####*+*=    :++=+:.  .#**++.      =*:      .*-=+-         ");
		System.out.println(
				"           .+**#*********=#*-   =*+**.       .+++*-   :+=-+:.  ..**++*:   :#--++##**#*=***.         ");
		System.out.println(
				"             .+****+++*+**=.  .-**++.         :*+*#:  :+++*:.    .++++*-.  .:*++++++*=+*-.          ");
		System.out.println(
				"               ..:=*+-:..     ......           .....  .......     .......     ....::...              ");

		while (true)

		{
			carShopView.mainMenu();

			int choice = -1;
			if (scanner.hasNextInt()) {
				choice = scanner.nextInt();
				scanner.nextLine(); // Consume the newline character
			} else {
				scanner.nextLine(); // Consume the invalid input
				System.out.println("Invalid input. Please enter a number.");
				continue;
			}

			switch (choice) {
			case 1:
				carModel.showAllCars();
				System.out.println("");
				System.out.println("=============================================");
				System.out.println("| 🚗✨  Above are all available  🚗✨       |");
				System.out.println("|  ✨🚗    cars in our showroom! ✨🚗       |");
				System.out.println("=============================================");
				System.out.println("");

				break;
			case 2:
				System.out.println("");
				System.out.println("=============================================");
				System.out.println("|🚗✨ Please enter the name of the car you  |");
				System.out.println("|       want to search for:                 |");
				System.out.println("=============================================");
				System.out.print(">> ");
				String carChoice = scanner.nextLine();
				carModel.findByName(carChoice);
				System.out.println("");
				System.out.println("=============================================");
				System.out.println("|🚗✨Above are all available cars in our🚗✨|");
				System.out.println("|✨🚗showroom by the name >>>> " + carChoice + "✨🚗|");
				System.out.println("=============================================");
				System.out.println("");
				break;
			case 3:
				System.out.println("");
				System.out.println("=============================================");
				System.out.println("|🚗✨ Please enter the name of the compnay  |");
				System.out.println("|      you  want to search for:             |");
				System.out.println("=============================================");
				System.out.print(">> ");
				String companyChoice = scanner.nextLine();
				carModel.findByCompany(companyChoice);
				System.out.println("");
				System.out.println("=============================================");
				System.out.println("|🚗✨Above are available cars in ourshowroom|");
				System.out.println("|✨🚗by the Companyname >>>> " + companyChoice + "✨🚗|");
				System.out.println("=============================================");
				System.out.println("");
				break;
			case 5:
				System.out.println("");
				System.out.println("============================================");
				System.out.println("|💵📊 Enter the price range to search cars:|");
				System.out.println("=============================================");

				System.out.print("| Minimum Price >>>> $");
				int min = scanner.nextInt();

				System.out.print("| Maximum Price >>>> $");
				int max = scanner.nextInt();

				System.out.println("=============================================");
				System.out.println("");

				carModel.findByPrice(min, max);
				System.out.println("");
				System.out.println("=============================================");
				System.out.println("|🚗✨Above are available cars in ourshowroom|");
				System.out.println("|✨of Price range >>>> $ " + min + "and" + max + "✨🚗|");
				System.out.println("=============================================");
				System.out.println("");

				break;
			case 4:
				System.out.println("");
				System.out.println("============================================");
				System.out.println("| 📅🔍 Enter the Car Year Model Range       |");
				System.out.println("============================================");
				System.out.print("| Minimum Year Model >>>> ");
				int minYearModel = scanner.nextInt();
				System.out.print("| Maximum Year Model >>>>  ");
				int maxYearModel = scanner.nextInt();
				scanner.nextLine(); // Consume the newline character
				System.out.println("============================================");
				carModel.findByModel(minYearModel, maxYearModel);
				System.out.println("");
				System.out.println("=============================================");
				System.out.println("|🚗✨Above are available cars in ourshowroom|");
				System.out.println("|✨of Price range >>>> $ " + minYearModel + "and" + maxYearModel + "✨🚗|");
				System.out.println("=============================================");
				System.out.println("");
				break;
			case 6:
				System.out.println("");
				System.out.println("============================================");
				System.out.println("| 📈 Listing All Cars by Price              |");
				System.out.println("============================================");
				carModel.listCarsByPrice();
				break;
			case 7:
				System.out.println("");
				System.out.println("============================================");
				System.out.println("| 📈 Listing All Cars by Model Year         |");
				System.out.println("============================================");
				carModel.listCarsByModel();
				break;
			case 8:
				System.out.println("");
				System.out.println("============================================");
				System.out.println("| 🛑 Exiting the Program                    |");
				System.out.println("| Have a Great Day!                        |");
				System.out.println("============================================");
				scanner.close();
				return;
			default:
				System.out.println("");
				System.out.println("============================================");
				System.out.println("| ❌ Invalid choice. Please try again.      |");
				System.out.println("============================================");

			}
		}
	}
}

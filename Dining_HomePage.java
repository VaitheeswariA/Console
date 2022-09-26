package dining_food_order;

import java.util.*;

public class Dining_HomePage extends Customer{

	public void home_page(Customer user_detail) {
		Scanner sc = new Scanner(System.in);
		boolean lets_start = true;

		while (lets_start) {
			System.out.println("\nProvide your choice to have fun with us!!!... ");
			System.out.println("**************************************************************************");
			System.out.println("1.View Food Menu \n2.Dining and Order food \n3.Order transaction details \n4.Customer Support \n5.Exit");
			int your_choice = sc.nextInt();
			Food mainmenu = new Food();
			mainmenu.restockingMenu();
			
			switch (your_choice) {
			case 1: {
				System.out.println("\nHurray!!!!...Here is our variety of foods...");
				mainmenu.menu_details(mainmenu);
			}
				break;
			case 2: {
				System.out.println("\nWe are accepting your orders...");
				System.out.println("Select table to dine in(1,2,3,4,5):");
				int Selected_table=sc.nextInt();
				System.out.println("Selected table booked");
				user_detail.setTable(Selected_table);
				boolean order_food = true;
				while (order_food) {System.out.println();
					System.out.println("\nChoose any category to explore dishes....");
					System.out.println("1.Veg \n2.Non Veg \n3.Rice \n4.Bread \n5.Drinking Beverages \n6.Deserts \n7.Shakes \n8.Main Menu");
					int selected_category=sc.nextInt();
					mainmenu.showdishes(selected_category);
					sc.nextLine();
					System.out.println("Choose dish:");
					String selected_dish = sc.nextLine();
					System.out.println("Required quantity");
					int quantity = sc.nextInt();
					double individual_price=Food.sub_menu.get(selected_category).get(selected_dish).doubleValue();
					user_detail.bill_amount+=individual_price * quantity;
					user_detail.ordered_items.put(selected_dish, quantity);
					user_detail.food_price.put(selected_dish, individual_price);
					System.out.println("\nDo you want to add any items to order?(1.yes or 2.no)");
					int start_order = sc.nextInt();
					if (start_order == 2)
						order_food=false;
				}
				System.out.println("\nProcessing payment details....");
				user_detail.bill_calculation(user_detail.bill_amount,user_detail);
				System.out.println("\nPayment is successfull...your order will be served soooooon:)");

			}
				break;

			case 3: {
				System.out.println("\nYour last transaction details...");
				user_detail.order_details(user_detail);
			}
				break;

			case 4: {
				System.out.println("\nWelcome Sir/Madam...How can we help you? choose the following support");
			}
				break;

			case 5: {
				lets_start = false;
				System.out.println("\nThankyou for your visit...Visit again:)");
			}
				break;

			}
		}
	}
}

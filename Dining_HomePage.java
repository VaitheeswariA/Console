package dining_food_order;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

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
				boolean choose_table=true;
				while(choose_table)
				{
					System.out.println("Select table to dine in(1,2,3,4,5):");
					int selected_table=sc.nextInt();
					if(user_detail.check_table_availability(selected_table))
					{
						user_detail.booked_tables.add(selected_table);
						user_detail.setTable(selected_table);
						System.out.println("your choice of table is available and booked...");
						choose_table=false;
					}
					else
						choose_table=true;
				}
				boolean order_food = true;
				while (order_food) {System.out.println();
					System.out.println("\nChoose any category to explore dishes....");
					System.out.println("1.VEG \n2.NON VEG \n3.RICE \n4.BREAD \n5.DRINKING BEVERAGES \n6.DESERTS \n7.SHAKES \n8.MAIN MENU");
					int selected_category=sc.nextInt();
					mainmenu.showdishes(selected_category);
					sc.nextLine();
					System.out.println("Choose dish:");
					int choose_dish=sc.nextInt();
					String selected_dish = sc.nextLine();
					System.out.println("Required quantity");
					int quantity = sc.nextInt();
					user_detail.billing(selected_category, choose_dish, quantity, user_detail);
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
				System.out.println("\nWelcome Sir/Madam...How can we help you? choose the following support \n1.Order related queries \n2.Menu related queries \n3.Payment related queries \n4.exit");
				int query_choice=sc.nextInt();
				boolean need_support=true;
				while(need_support)
				{
					switch(query_choice)
					{
					case 1:
					{
						System.out.println("Please provide your query");
						String order_query=sc.nextLine();
						need_support=false;
					}
					break;
					
					case 2:
					{
						System.out.println("Please provide your query");
						String menu_query=sc.nextLine();
						need_support=false;
					}
					break;
					
					case 3:
					{
						System.out.println("Please provide your query");
						String payment_query=sc.nextLine();
						need_support=false;
					}
					break;
					case 4:
					{
						need_support=false;
					}
					break;
					
					default:
						System.out.println("Sorry sir/madam,we are rectifying more user queries....We will add your query in future ,will provide support...");
						System.out.println("Thank you for UNDERSTANDING :)");
					}
					
				}
				System.out.println("Thank you Sir/Madam....Our executive will get back to you soon");
			}
				break;

			case 5: {
				lets_start = false;
				System.out.println("\nThankyou for your visit...Visit again:)");
			}
				break;

			default:
				System.out.println("We are not providing any service like you have provided...Try any of our mentioned service");
			}
			
			
		}
	}
	
	public boolean validate_mobile_number(String mobile_number)
	{
		Pattern mobile_number_pattern=Pattern.compile("0?[6-9][0-9]{9}");
		Matcher mobile_no_matcher=mobile_number_pattern.matcher(mobile_number);
		if(mobile_no_matcher.find())
			return true;
		return false;
	}
}

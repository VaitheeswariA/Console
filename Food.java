package dining_food_order;

import java.util.*;

class Food {
	//Map<String, ArrayList<String>> menu = new LinkedHashMap<>();
	public static Map<Integer, LinkedHashMap<String, Double>> sub_menu = new LinkedHashMap<>();
	public static LinkedHashMap<String, Double> veg = new LinkedHashMap<>();
	public static LinkedHashMap<String, Double> non_veg = new LinkedHashMap<>();
	public static LinkedHashMap<String, Double> rice = new LinkedHashMap<>();
	public static LinkedHashMap<String, Double> bread = new LinkedHashMap<>();
	public static LinkedHashMap<String, Double> drinking_beverages = new LinkedHashMap<>();
	public static LinkedHashMap<String, Double> desert = new LinkedHashMap<>();
	public static LinkedHashMap<String, Double> shakes = new LinkedHashMap<>();

	public void restockingMenu() {

		// Veg menu list
		veg.put("Gobi 65", 140.00);
		veg.put("Mushroom pepper fry", 150.00);
		veg.put("Paneer butter masala", 170.70);
		veg.put("Aloo Gobi masala", 120.20);
		veg.put("Chenna Masala", 110.00);
		veg.put("Dal Fry", 120.25);
		veg.put("Veg Kurma", 115.50);
		veg.put("Bhindhi Masala", 80.50);
		veg.put("Veg Manchurian gravy", 125.50);
		veg.put("Mushroom gravy", 110.00);

		// Non_veg menu list
		non_veg.put("Chicken 65", 120.50);
		non_veg.put("Fish Fingers", 130.50);
		non_veg.put("Mutton chops", 250.70);
		non_veg.put("Mutton cola", 30.00);
		non_veg.put("Chicken Chettinad masala", 150.00);
		non_veg.put("Chicken pepper dry", 135.00);
		non_veg.put("Mutton gravy", 250.00);
		non_veg.put("Fish Masala", 200.00);
		non_veg.put("Prawn gravy", 150.00);
		non_veg.put("Butter Chicken masala", 150.00);
		
		
		//rice menu details
		rice.put("White basmati rice", 100.00);
		rice.put("Ghee rice", 115.70);
		rice.put("pulao", 110.00);
		rice.put("Veg Briyani", 125.00);
		rice.put("Chenna Briyani", 130.00);
		rice.put("Prawn Briyani", 230.00);
		rice.put("Chicken Briyani", 210.00);
		rice.put("Mutton Briyani", 250.00);
		rice.put("Fish Briyani", 230.00);
		rice.put("Hydrabadhi Chicken briyani", 250.75);
	
		//bread menu details
		bread.put("Naan", 20.00);
		bread.put("Roti", 25.00);
		bread.put("Chapathi", 15.00);
		bread.put("Garlic naan", 23.00);
		bread.put("Parotta", 17.00);
		bread.put("cyleon parotta", 18.00);
		bread.put("Chilli parotta", 110.00);
		bread.put("Chicken kothu parotta", 130.00);
		bread.put("Butter Naan", 22.00);
		bread.put("kuboos", 15.00);

		//drinking beverages menu details
		drinking_beverages.put("Mint Mojito", 70.00);
		drinking_beverages.put("Lemon Soda", 60.00);
		drinking_beverages.put("Danger Soda", 170.00);
		drinking_beverages.put("Coke", 40.00);
		drinking_beverages.put("paneer soda", 40.00);
		
		
		//desert menu list
		desert.put("Gulab jamun", 40.00);
		desert.put("Brownie", 50.00);
		desert.put("Sizzling Brownie", 130.00);
		desert.put("Carrot halwa", 70.00);
		desert.put("Bread halwa", 50.00);
		
		//shakes menu details
		shakes.put("Strawberry", 110.00);
		shakes.put("Mango", 120.00);
		shakes.put("Vennila", 100.00);
		shakes.put("Chocolate", 120.00);
		shakes.put("ButterFruit", 140.00);
		
		// Category details
		sub_menu.put(1, veg);
		sub_menu.put(2, non_veg);
		sub_menu.put(3, rice);
		sub_menu.put(4, bread);
		sub_menu.put(5, drinking_beverages);
		sub_menu.put(6, desert);
		sub_menu.put(7, shakes);

		//menu.put("Shakes", new ArrayList<String>(Arrays.asList("Strawberry", "Mango", "Vennila", "Chocolate")));

	}

	public void menu_details(Food mainmenu) {
		Scanner sc1 = new Scanner(System.in);
		boolean expand_menu = true;
		while (expand_menu) {
			System.out.println();
			System.out.println("Choose any category to explore dishes....");
			System.out.println(
					"1.Veg \n2.Non Veg \n3.Rice \n4.Bread \n5.Drinking Beverages \n6.Deserts \n7.Shakes \n8.Main Menu");
			int category = sc1.nextInt();
			expand_menu = (category == 8) ? false : true;
			mainmenu.showdishes(category);
		}
	}

	public void showdishes(int category) {
		int dish_index=0;
		System.out.println();
		switch (category) {
		case 1: {
			System.out.println("--------Available varieties of dishes in veg Category-----------");
			System.out.printf("%-5s %-25s %-5s","S.No","Dish Name","Price Per Quantity");
			System.out.println();
			System.out.println("----------------------------------------------------------------");
			System.out.println();
			for (Map.Entry<String, Double> dish : veg.entrySet()) {
				System.out.printf("%-5s %-25s %-5s",++dish_index,dish.getKey(),dish.getValue());
				System.out.println();
				
			}
		}
			break;

		case 2: {
			System.out.println("-------Available varieties of dishes in Non veg Category-------");
			System.out.printf("%-5s %-25s %-5s","S.No","Dish Name","Price Per Quantity");
			System.out.println();
			System.out.println("----------------------------------------------------------------");
			System.out.println();
			for (Map.Entry<String, Double> dish : non_veg.entrySet()) {
				System.out.printf("%-5s %-25s %-5s",++dish_index,dish.getKey(),dish.getValue());
				System.out.println();
			}
		}
			break;

		case 3: {
			System.out.println("--------Available varieties of dishes in rice Category------------");
			System.out.printf("%-5s %-25s %-5s","S.No","Dish Name","Price Per Quantity");
			System.out.println();
			System.out.println("----------------------------------------------------------------");
			System.out.println();
			for (Map.Entry<String, Double> dish : rice.entrySet()) {
				System.out.printf("%-5s %-25s %-5s",++dish_index,dish.getKey(),dish.getValue());
				System.out.println();
			}
		}
			break;

		case 4: {
			System.out.println("--------Available varieties of dishes in bread Category-----------");
			System.out.printf("%-5s %-25s %-5s","S.No","Dish Name","Price Per Quantity");
			System.out.println();
			System.out.println("----------------------------------------------------------------");
			System.out.println();
			for (Map.Entry<String, Double> dish : bread.entrySet()) {
				System.out.printf("%-5s %-25s %-5s",++dish_index,dish.getKey(),dish.getValue());
				System.out.println();
			}
		}
			break;

		case 5: {
			System.out.println("-------Available varieties of dishes in drinking beverages Category-------");
			System.out.printf("%-5s %-25s %-5s","S.No","Dish Name","Price Per Quantity");
			System.out.println();
			System.out.println("------------------------------------------------------------------------");
			System.out.println();
			for (Map.Entry<String, Double> dish : drinking_beverages.entrySet()) {
				System.out.printf("%-5s %-25s %-5s",++dish_index,dish.getKey(),dish.getValue());
				System.out.println();
			}
		}
			break;

		case 6: {
			System.out.println("-------Available varieties of dishes in desert Category-----------");
			System.out.printf("%-5s %-25s %-5s","S.No","Dish Name","Price Per Quantity");
			System.out.println();
			System.out.println("----------------------------------------------------------------");
			System.out.println();
			for (Map.Entry<String, Double> dish : desert.entrySet()) {
				System.out.printf("%-5s %-25s %-5s",++dish_index,dish.getKey(),dish.getValue());
				System.out.println();
			}
		}
			break;

		case 7: {
			System.out.println("-------Available varieties of dishes in shakes Category-----------");
			System.out.printf("%-5s %-25s %-5s","S.No","Dish Name","Price Per Quantity");
			System.out.println();
			System.out.println("----------------------------------------------------------------");
			System.out.println();
			for (Map.Entry<String, Double> dish : shakes.entrySet()) {
				System.out.printf("%-5s %-25s %-5s",++dish_index,dish.getKey(),dish.getValue());
				System.out.println();
			}
		}
			break;

		case 8:
			return;

		default:
			System.out.println("We are not providing this category of varieties....Please try any of our mentiond services");
			System.out.println("Thank you for UNDERSTANDING:)");
		}
	}
}

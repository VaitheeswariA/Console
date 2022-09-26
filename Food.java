package dining_food_order;

import java.util.*;

class Food {
	Map<String, ArrayList<String>> menu = new LinkedHashMap<>();
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

		// Category details
		sub_menu.put(1, veg);
		sub_menu.put(2, non_veg);
		sub_menu.put(3, rice);
		sub_menu.put(4, bread);
		sub_menu.put(5, drinking_beverages);
		sub_menu.put(6, desert);
		sub_menu.put(7, shakes);

		menu.put("Rice", new ArrayList<String>(
				Arrays.asList("White basmati rice", "Ghee rice", "pulao", "Chicken Briyani", "Mutton Briyani")));
		menu.put("Bread", new ArrayList<String>(Arrays.asList("Naan", "Roti", "Chapathi", "Garlic naan", "Parotta")));
		menu.put("Drinking beverages",
				new ArrayList<String>(Arrays.asList("Mint Mojito", "Lemon Soda", "Danger Soda", "Coke")));
		menu.put("Deserts", new ArrayList<String>(
				Arrays.asList("Gulab jamun", "Brownie", "Sizzling Brownie", "Carrot halwa", "Bread halwa")));
		menu.put("Shakes", new ArrayList<String>(Arrays.asList("Strawberry", "Mango", "Vennila", "Chocolate")));

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
		switch (category) {
		case 1: {
			System.out.print("********Available varieties of dishes in veg Category***********");
			for (Map.Entry<String, Double> dish : veg.entrySet()) {
				System.out.println(dish.getKey() + "------------------------------------" + dish.getValue());
			}
		}
			break;

		case 2: {
			System.out.print("********Available varieties of dishes in Non veg Category***********");
			for (Map.Entry<String, Double> dish : non_veg.entrySet()) {
				System.out.println(dish.getKey() + "------------------------------------" + dish.getValue());
			}
		}
			break;

		case 3: {
			System.out.print("********Available varieties of dishes in rice Category***********");
			for (Map.Entry<String, Double> dish : rice.entrySet()) {
				System.out.println(dish.getKey() + "------------------------------------" + dish.getValue());
			}
		}
			break;

		case 4: {
			System.out.print("********Available varieties of dishes in bread Category***********");
			for (Map.Entry<String, Double> dish : bread.entrySet()) {
				System.out.println(dish.getKey() + "------------------------------------" + dish.getValue());
			}
		}
			break;

		case 5: {
			System.out.print("********Available varieties of dishes in drinking beverages Category***********");
			for (Map.Entry<String, Double> dish : drinking_beverages.entrySet()) {
				System.out.println(dish.getKey() + "------------------------------------" + dish.getValue());
			}
		}
			break;

		case 6: {
			System.out.print("********Available varieties of dishes in desert Category***********");
			for (Map.Entry<String, Double> dish : desert.entrySet()) {
				System.out.println(dish.getKey() + "------------------------------------" + dish.getValue());
			}
		}
			break;

		case 7: {
			System.out.print("********Available varieties of dishes in shakes Category***********");
			for (Map.Entry<String, Double> dish : shakes.entrySet()) {
				System.out.println(dish.getKey() + "------------------------------------" + dish.getValue());
			}
		}
			break;

		case 8:
			return;

		default:
			System.out.println("Invalid category");
		}
	}
}

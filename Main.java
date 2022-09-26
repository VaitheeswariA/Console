package dining_food_order;

import java.util.*;

public class Main extends Dining_HomePage {
	public static void main(String[] args) {
		Main dining = new Main();
		dining.begin();
	}

	public void begin() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Welcome to our Authentic Indian Cuisine Restaurant,\n ");
		boolean start = true;
		while (start) {
			System.out.println("Choose any option to explore our services");
			System.out.println("1.Login \n2.About \n3.Exit");
			int choose = sc1.nextInt();
			switch (choose) {
			case 1: {
				Dining_HomePage dine = new Dining_HomePage();
				Customer user_detail=new Customer();
				System.out.println("Customer Name:");
				user_detail.setName(sc1.next()) ;
				System.out.println("Mobile Number:");
				user_detail.setMobile(sc1.next());
				dine.home_page(user_detail);
			}
				break;
			case 2: {
				System.out.println(
						"Our Authentic Indian Cuisine Restaurant has been providing best quality food since 1990....");
			}
				break;

			case 3: {
				start = false;
			}
				break;

			default: {
				System.out.println("Invalid choice....");
			}
			}
		}

	}
}

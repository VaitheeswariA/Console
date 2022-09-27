package dining_food_order;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

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
				String name=sc1.next();
				user_detail.setName(name) ;
				boolean isValid_contact=false;
				while(!isValid_contact)
				{
					System.out.println("Mobile Number:");
					String mobile_no=sc1.next();
					isValid_contact=dine.validate_mobile_number(mobile_no);
					if(isValid_contact)
						{
						user_detail.setMobile(mobile_no);
						}
					else
						System.out.println("Invalid mobile number...enter valid mobile number");
				}
				dine.home_page(user_detail);
			}
				break;
			case 2: {
				System.out.println("Our Authentic Indian Cuisine Restaurant has been providing best quality food since 1990....");
				System.out.println("We are providing Vegiterian and Non Vegiterian Indian cuisines to make provide people healthier food");
				System.out.println("\n***************************************************************");
				System.out.printf("%-10s %-10s %-10s"," ","Our Contact details"," ");
				System.out.println("\n****************************************************************");
				System.out.println("Authentic Indian Cuisine Restaurant");
				System.out.println("GST Road,Potheri");
				System.out.println("Contact Number: 9876543210");
				System.out.println("Contact mail id:authentic_indian_cuisine@zohomail.com");
				System.out.println("\n****************************************************************\n");
			}
				break;

			case 3: {
				start = false;
			}
				break;

			default: {
				System.out.println("We are not providing this service....Please try any of our mentioned services");
				System.out.println("Thank you for UNDERSTANDING");
			}
			}
		}

	}
}

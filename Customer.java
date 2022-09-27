package dining_food_order;

import java.util.*;

public class Customer {
	Map<String, Integer> ordered_items = new LinkedHashMap<>();
	Map<String,Double> food_price=new LinkedHashMap<>();
	List<Integer> booked_tables=new ArrayList<>();
	Double bill_amount = 0.00;
	static int bill_id=1001;
	private String customer_Name;
	private String customer_Mobile;
	private int selected_table_no;

	public void setName(String name) {
		this.customer_Name = name;
	}

	public void setMobile(String mobile) {
		this.customer_Mobile = mobile;
	}

	public void setTable(int table_no)
	{
		this.selected_table_no=table_no;
	}
	public String getName()
	{
		return customer_Name;
	}
	
	public String getMobile() {
		return customer_Mobile;
	}
	public int getTable()
	{
		return selected_table_no;
	}
	
	public boolean check_table_availability(int required_table_no)
	{
		if(booked_tables.contains(required_table_no))
		{
			System.out.println("This table is already booked...Kindly choose other tables");
			return false;
		}
			
		return true;
	}
	
	
	public void billing(int selected_category,int choose_dish,int quantity,Customer user_detail)
	{
		LinkedHashMap<String,Double> selected_sub_menu=Food.sub_menu.get(selected_category);
		int current_index=0;
		double individual_price=0.00;
		String selected_dish="";
		for(Map.Entry<String, Double> select_dish:selected_sub_menu.entrySet())
		{
			if(++current_index==choose_dish)
			{
				individual_price=select_dish.getValue().doubleValue();
				selected_dish=select_dish.getKey();
			}
		}
		user_detail.bill_amount+=individual_price * quantity;
		user_detail.ordered_items.put(selected_dish, quantity);
		user_detail.food_price.put(selected_dish, individual_price);
	}
	
	
	
	
	public void bill_calculation(double bill_amount,Customer user_detail) {
		double gst_percentage = 0.05;
		bill_amount = bill_amount + (bill_amount * gst_percentage);
		user_detail.order_details(user_detail);
		user_detail.bill_id=bill_id++;
	}
	
	public void order_details(Customer cust)
	{
		if(cust.ordered_items!=null)
		{
			System.out.println("Customer Name:"+cust.getName());
			System.out.println("Customer contact number:"+cust.getMobile());
			System.out.println("Table number:"+cust.getTable());
			System.out.println("Bill Number:"+cust.bill_id);
			System.out.println("\n------------------------------Ordered food details---------------------------------------------");
			System.out.printf("%-35s %-25s %-5s","ordered Item","ordered Quantity","Price per quantity");
			System.out.println("\n-----------------------------------------------------------------------------------------------");
			for(Map.Entry<String,Integer> ordered_food:cust.ordered_items.entrySet())
			{
				System.out.printf("%-35s %-25s %-5s",ordered_food.getKey(),ordered_food.getValue(),cust.food_price.get(ordered_food.getKey()));
				System.out.println();
			}
			System.out.println("\n-----------------------------------------------------------------------------------------------");
			System.out.printf("%60s %5s","Gst =","5%");
			System.out.println();
			System.out.println("\n-----------------------------------------------------------------------------------------------");
			System.out.printf("%60s %5s","Total bill amount =" ,bill_amount);
			System.out.println();
		}
		else
		{
			System.out.println("You are not yet ordered any food");
		}
		
	}
}

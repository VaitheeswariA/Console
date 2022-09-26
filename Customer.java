package dining_food_order;

import java.util.*;

public class Customer {
	Map<String, Integer> ordered_items = new LinkedHashMap<>();
	Map<String,Double> food_price=new LinkedHashMap<>();
	Double bill_amount = 0.00;
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
	public void bill_calculation(double bill_amount,Customer user_detail) {
		double gst_percentage = 0.05;
		bill_amount = bill_amount + (bill_amount * gst_percentage);
	}
	
	public void order_details(Customer cust)
	{
		System.out.println("Customer Name:"+cust.getName());
		System.out.println("Customer contact number:"+cust.getMobile());
		System.out.println("Table number:"+cust.getTable());
		System.out.println("\n****************************Ordered food details********************************************");
		System.out.println("ordered Item                     ordered Quantity                              Price per quantity");
		System.out.println("***********************************************************************************************");
		for(Map.Entry<String,Integer> ordered_food:cust.ordered_items.entrySet())
		{
			System.out.println(ordered_food.getKey()+"                        "+ordered_food.getValue()+"                        "+cust.food_price.get(ordered_food.getKey()));
		}
		System.out.println("Total bill amount =" + bill_amount);
	}
}

import java.util.*;

public class profit{
 public static void main(String[] args){
  //program to calculate profit and loss 
  double cost_price =129 ;
  double selling_price = 191;
  double profit = selling_price - cost_price;
  double profit_percentage = profit/cost_price*100; // formula to calculate profit percentage
  System.out.println("The Cost Price is INR " + cost_price + " The Selling Price is INR " + selling_price +"\n" + "The Profit is INR " + profit + " and the Profit Percentage is " + profit_percentage);
  }
  }
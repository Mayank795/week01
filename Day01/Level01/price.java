import java.util.*;

public class price{
 public static void main(String[] args){
  //program to find the discounted price
  int  fee = 125000;
  int discountPercent = 10;
  int discount = (fee*discountPercent)/100;
  int discountPrice = fee - discount;
  
  System.out.println("The discount amount in INR " + discount + " and final discounted fee is INR " + discountPrice);
  }
  }
import java.util.*;

public class pens{
 public static void main(String[] args){
  //program to divide pens eqully
  int  pens = 14;
  int student = 3;
  int pen_divided = pens/student;
  int pen_remaining = pens%student;
  
  System.out.println("The Pen Per Student is " + pen_divided + " and the remaining pen not distributed is " + pen_remaining);
  }
  }
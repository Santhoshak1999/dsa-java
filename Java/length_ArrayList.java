/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
		//length is the predefined varible
		int[] a = {1,2,3,4,5,6,7,8}; //the array size is 7+1=8  index+1;
		System.out.println("size of a = " + a.length + "     \"use length varible to find array size\"");
		//if you are trying to fetch data from .length() method
		
		//System.out.println(a.length()); 

      /*  Main.java:16: error: cannot find symbol
	    	System.out.println(a.length());*/
	    
	    
	    //length predined method
	    String str = "Santhosha K davangere";
	    System.out.println("The size of str is = " + str.length() + "       \"use length() method to find the string size\"");
	    
	    //size() predined for arrayList
	    // Arraylist in java is same like puthon list 
	    ArrayList<String> strArrList = new ArrayList<String>();
	    strArrList.add("santhosha");
	    strArrList.add("K");
	    strArrList.add("DVG");
	    strArrList.add("1210"); //if you are trying to add integer it will give an error becouse the we initialize String ArrayList and java contain onlu 1 data type of ArrayList
	    
	    
	    System.out.println(strArrList);
	  //  System.out.println(strArrList[0]); if you are trying access like this it will give error
	    
	    
	    
	    //To access an element in the ArrayList, use the get() method and refer to the index number:
	    System.out.println(strArrList.get(0));
	    System.out.println(strArrList.size());
	    
	}
}

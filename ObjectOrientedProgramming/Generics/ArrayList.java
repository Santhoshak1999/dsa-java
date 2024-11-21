package ObjectOrientedProgramming.Generics;

public class ArrayList {
 //Array and Array list are same but in ArrayList dynamically store the values insted its size is fixed
    //In c Programming if you dont know the size you just inicialise an empty array like 
    //exm : int arr[];
    //You can allowcation the values how many you want
    //unlike java there is no option to do like that 
    //so we use ArrayList 
    

    public static void main(String[] args){
    	
        //      syntax
        //    	Java, primitives (e.g., int, double, boolean) are not used directly 
        //    	in generic types, such as ArrayList, because Java generics work only 
        //    	with objects (reference types).        
                ArrayList<Integer> arrlist = new ArrayList<Integer>(10);
        //    			type								initial capacity 
                System.out.println("array list size " + arrlist.size());
                
                //add data to arraylist
                arrlist.add(12);
                arrlist.add(233423);
                arrlist.add(3434);
                arrlist.add(343434);
                arrlist.add(343434);
                arrlist.add(343434);
                arrlist.add(434343434);
                arrlist.add(1434234);
                arrlist.add(344);
                arrlist.add(145);
                arrlist.add(1235);
                arrlist.add(76567);
                arrlist.add(234567);
                arrlist.add(56464);
                arrlist.add(15666);
                arrlist.add(1567687);
                arrlist.add(17654);
        //        lets observed here you are inicialised the capcity to 10
        //        but you are inserting more that 10 values here
        //        thats the feature of arraylist so 
        //        you can add as many you want
                
                System.out.println(arrlist );
                
}

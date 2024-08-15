public class Non_static {
    /*

    Non-Static Method (Instance Method)

    Belongs to an Object: A non-static method is associated with an instance (object) of the class. It can access the instance's data (variables).

    Call with an Object: You need to create an object of the class to call a non-static method.

    Example: If a method needs to work with the data stored in a specific object, you make it non-static.
    
    */

    public static void main(String[] args){
        System.out.println(employee.labour);
        
        //create object to access non static variables
        employee e; //reference variable of employee
        e  = new employee(); 
        /*
            Employee e;: Declares a reference variable e of type Employee.
            new Employee();: Creates a new Employee object in memory.
            e = new Employee();: The reference variable e now holds the address of the newly created Employee object.
         */

        System.out.println(e.name);//null
        System.out.println(e.id);//0
        employee.labourcost();




    }

}

class employee{
    String name; //non static variables can't access direclty using class name
    int id;
    //a static variable
    static int labour = 200;//you can access this variable using class name

    static void work(){
        // System.out.println(name +  "working now");//couse an error becouse 
        //the you can not access the non static variable in the non static methods

        //lets try to print a static variable

    }
    static void labourcost(){
        System.out.println("All the labour will get " + 200 + "rupees for one day");
    }
}
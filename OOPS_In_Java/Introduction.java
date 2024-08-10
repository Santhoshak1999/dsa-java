public class Introduction{
    public static void main(String args[]){

        //stores 5 roll numbers
        int[] numbers = new int[5];
        
        //stores 5 names ->string array
        String[] names = new String[5];

        //new let assume i want to store the rollno, names and marks
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        
        //but in this we are storing rollno, name, and marks in different variables
        //but i need to store all the value
        //to do this we need opps and object oriented programmings comes into the picture

        //Classes
        //You can create your own data types using classes
        // object is the physical property of a class
        Student santhosh;
        santhosh = new Student(); // Student() calling a by default constructor
        //lets print the property value before initiallising
        System.out.println(santhosh.name);
        System.out.println(santhosh.name);
        System.out.println(santhosh.marks);
        //so it is confirm that the values of the instance variable is null / 0;
        santhosh.printall();
        
        
        santhosh.name = "santhosha";
        santhosh.rollno = 24;
        santhosh.marks = 73.12f;




    }
}
    //create a student class
    class Student{
        // class is a group of funtions and methods
        String name;
        int rollno;
        float marks;
        void printall(){
            System.out.println(name);
            System.out.println(rollno);
            System.out.println(marks);
        }

        //create constructor to assign value for the properties while creating an object
        //Constructor does't have a return type
        Student(){
            this.marks = 12.5f;
            this.rollno = 12345;
            this.name = "Santhosha K";
        }

    }

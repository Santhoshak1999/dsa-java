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
        Student student1;
        student1 = new Student(); // Student() calling a by default constructor
        //variable(class properties) inside the object is called instant variables
        //use dot(.) opertaor or separator to access the instant variables
        //lets print the instant variable value before initiallising
        System.out.println(student1.name);
        System.out.println(student1.name);
        System.out.println(student1.marks);
        //so it is confirm that the values of the instance variable is null / 0;
        student1.printall();
        
        
        student1.name = "santhosha";
        student1.rollno = 24;
        student1.marks = 73.12f;

        student1.printall();

        
        //calling copu constructor
        Student student2 = new Student(student1);

        student2.printall();



        // change values using refernce variables
        Student one = new Student();
        one.name = "sk1313";
        Student two = one;
        //change the value  of name using reference variable
        two.name = "name changed";
        System.out.println(one.name);
        System.out.println(two.name);



    }
}
    //create a student class
    class Student{
        // class is a group of funtions or methods with its properties.
        String name;
        int rollno;  //these variable called as properties of a class
        float marks;
        void printall(){
            System.out.println(this.name);
            System.out.println(rollno);
            System.out.println(marks);
        }

    //create constructor to assign value for the properties while creating an object
    //Constructor does't have a return type
        // Student(){
        //     this.marks = 12.5f;//"this" reffernce to the object name
        //     this.rollno = 12345;
        //     this.name = "Santhosha K";
        // }

        Student(int rollno, String name, float marks){
            this.rollno = rollno;
            this.name= name;
            this.marks = marks;
        }

        Student(){
            //constructor chain
            //this is how you call a constructor from another constructor
            //internally: new Student(12, "sach", 70.0f);
            this(12, "sach", 70.0f);//this calls the aboce constuructor, 
        }

        //copy constructor -  It takes an object of the same class as a parameter
        //                    and copies the values of its fields into the new object
        Student(Student other){
            this.rollno = other.rollno;
            this.name = other.name;
            this.marks = other.marks;

        }
        //types of constructor
       /*
        Default constructor - No argument constructor automatically provided
        No-argument constructor - similar to default constructor created explicitly
        Parameterised Constructor - constructor with specific parameteris
        Private constructor - study it later
        Copy constructor - Constructor copy another same object(same class object as parameter)
        Constructor Overloading(ಮಿತಿಮೀರಿ) - Multiple constructor with different parameters
        */

    }

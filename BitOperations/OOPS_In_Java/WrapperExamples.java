import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class WrapperExamples {
    public static void main(String[] args) {
        //premitive data type
        int a = 10;
        int b = 30;
        Integer num = 24;
        swap(a, b); //not swap bcz a and b are premitive data type, these variables onlu pass by value not referece
        System.out.println(a + " " + b);

        
        Integer i = 50;
        Integer j = 40;
        swap(i, j);
        System.out.println(i + " " + j);//it will not swap because wrapper classes are final, so these are immutable(once the value initialized we can not be change)

        // Final Variables:
        // When a variable is declared as final, its value cannot be changed once initialized. It's essentially a constant.
        // A final variable must be initialized when declared or within a constructor if it's an instance variable.
        final int DISCOUNT = 2; //can modify and always initialse while declaring it;
        // DISCOUNT = 3;
        System.out.println(DISCOUNT);



        A exm = new A("finalname", "non-finalname");
        exm.print();
        exm.NAME = "santhosha";//annot assign a value to final variable NAME
    
        //when a non primitive is final, you can not reassign it.
        final A a1 = new A("fn", "sn"); 

        //finalise method called when the refenrence of the object is goes to garbage collection
        A obj;
        System.out.println("The garbage collector in Java does not immediately remove an object as soon as it becomes eligible for garbage collection. Instead, the timing of garbage collection is determined by the Java Virtual Machine (JVM), ");
        for(int K=0;i<1000000;i++){
            obj = new A();
        }
    
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        b = a;
        a = temp;
    }
    
}
class A{
    final int NUM = 10;
    String NAME;
    String name2;
    A(String name, String name2){
        this.NAME = name;
        this.name2 = name2;
    }
    A(){
        System.out.println("Object is created");
    }
    void print(){
        System.out.println("NUM is = " + NUM +
        "\nNAME = " + NAME + "\nname = " + name2);
    }
    

// The finalize()
// method is a special method in Java that is called by the garbage collector 
// before an object is removed from memory (i.e., before it is garbage collected
    
    protected void finalize() throws Throwable
    {
        System.out.println("object is destroyed");
    }
}
package StaticExample;

//this is a demo to show initialisation of static variable
public class StaticBlock {
    static int a = 5;
    static int b;

    //will only run once, when first obj is create i.e when the class is loaded for first time
    //You use a static block to execute code that should run once when the class is loaded,
    //especially for initializing static variables or performing other class-level setup tasks.
    static {
        System.out.println("Im in static block");
        System.out.println("run on first object so you can't run again if you created one more object ");
        b= a * 4;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.b);
        StaticBlock obj1 = new StaticBlock();//static block will run for the first time
        System.out.println(StaticBlock.a +" " + StaticBlock.b);

        StaticBlock.b +=1;
        StaticBlock obj2 = new StaticBlock();//now the static will not run bcz this is the second object
        System.out.println(StaticBlock.a +" " + StaticBlock.b);


    }

}

package StaticExample;

public class Notes {
    static int staticnum = 20;
    int nonstaticnum1 = 30;



    //this method is belongs with an object - non static
    public static void StaticVariables() {
        System.out.println("static variables");
        System.out.println("----------------");
        System.out.println("A static variable is a special kind of variable " +
                "that belongs to the class itself, not to any individual " +
                "object created from that class.");

    }
    public static void StaticMethods(){
        System.out.println("You can also create the static methods");
        System.out.println("---------------------------------------\n" +
                "A static method belongs to the class itself, not to" +
                " any particular instance of the class.\nThis means you " +
                "can call a static method using the class name without " +
                "creating an instance of the class.");
        System.out.println();
        System.out.println("You can only access a static variables inside a static method " +
                "\nbcz they operate at the class level and do not have access to instance-specific data.");
    }

}

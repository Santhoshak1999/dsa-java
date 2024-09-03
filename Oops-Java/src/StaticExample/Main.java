package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human santhosh = new Human("santhosha", 24, "Male", 12000, false); //population = 1;
        Human kunal = new Human("kunal", 22, "Male", 10000, false);//population = 2;
        Human pooja = new Human("pooja", 23, "Feale", 15000, false);//population = 3;

        System.out.println(Human.Population);
        System.out.println(Human.Population);
        System.out.println(Human.Population); //static variables are not dependent on Objects

        Main.fun();//static method so directlu call using the class name

        Main m = new Main();
        m.fun2();

        Notes.StaticVariables();
        System.out.println();
        Notes.StaticMethods();
    }

    //this is belongs to class its self not individual objects
    static void fun() {
        //greeting();;//you cant use this method bcz it requires an instance
        //this is belongs to individual o bject(instance). not class itself.

        //you can not access non static method with reference
        Main m = new Main();
        m.greeting();//
    }

    void fun2(){
        greeting();//here reference is not required bcz we know that fun2 will call only if we create a instance of it
        //so it is confirmed that non static method can call direclty in other non static methods
    }
    void greeting(){
        System.out.println("Welcome to java");

    }
}

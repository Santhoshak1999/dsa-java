public class IntroTwo {
    public static void main(String[] args) {
        A obj = new A("santhos");
        System.out.println(obj);
        obj.Greeting();
    }
}


class A{
    final int DISCOUNT = 10;
    String name = "Santhosha K";

    A(String name){
        this.name = name;
    }
    void Greeting(){
        System.out.println("Packages in Java organize code and prevent naming conflicts, \nwhile also controlling access to classes and interfaces.");
    }
}
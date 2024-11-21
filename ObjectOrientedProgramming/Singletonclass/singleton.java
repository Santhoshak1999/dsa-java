package Singletonclass;

public class singleton {
    //    Private static variable to hold the single instance of the class
    //
    private singleton(){
        System.out.println("A Singleton is a design pattern in Java that ensures a class has only one instance" +
                "\n and provides a global point of access to that instance");

    }
    //singleton is used to restrict to create only one object for one class.
    private static singleton instance;
    public static singleton getInstance(){
        if(instance == null){
            instance = new singleton();
        }
        return instance;
    }
}

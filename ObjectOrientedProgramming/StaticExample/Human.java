package StaticExample;

public class Human {
    String name;
    int age;
    String gender;
    double Salary;
    boolean married;
    static long Population; //common all humans not for individual people

    public Human(String name, int age, String gender, double salary, boolean married) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.Salary = salary;
        this.married = married;
        Human.Population +=1; //dont use this keyword for static variables bcz static variable belongs to class iteself not any individual objects
    }




}

public class Static_block {
    public static void main(String[] args){
        Employee e = new Employee();

    }
}
class Employee{
    static {
        System.out.println("This is the static block \n This block will run when object is created\n and without calling");
    }
}

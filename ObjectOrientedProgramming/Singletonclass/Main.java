package Singletonclass;

public class Main {
    public static void main(String[] args) {
        singleton s1 = singleton.getInstance();
        singleton s2 = singleton.getInstance();
        singleton s3 = singleton.getInstance();//all three object refering to same reference object
        System.out.println(s1 == s1);
//        System.out.println(s1 == singleton.instance);
    }
}

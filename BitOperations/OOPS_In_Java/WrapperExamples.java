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

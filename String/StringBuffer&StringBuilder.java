// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
//StringBuilder is a class in Java used for creating mutable sequences of characters
        
        //StringBuffer in java is used for mutable string manipulation, providing appending inserting and deleting operations.
        
        StringBuffer sb = new StringBuffer();
        //String Buffer is like a continer for holding words or sentences in java. its like having a bod that can store text. The default capacity of 16 means that when you created a new buffer
        
        //StringBuffer in Java, the number 16 refers to the initial capacity of the StringBuffer object. This means that when you create a new StringBuffer without specifying a capacity, it will be initialized with a capacity to hold approximately 16 characters
        System.out.println("capacity of string befor stroing array:" + sb.capacity()); //the output will be 16 by default if we are not specified anything.
        sb.append("Santhosha K and santhosha is from davangere");
        System.out.println("Lenght of the string buffer: " + sb.length());
        System.out.println("capacity of string after stroing array:" + sb.capacity());
        
       // String str = sb; In this case we are storing stringbuffer to string variable so give an error
        
        // we need to typecast it to string
        String str = sb.toString();
        System.out.println(str);
        
        //delete the character inside the array
        sb.deleteCharAt(4); //h will be deleted in from the String Buffer
        System.out.println(sb);
        
        //insert the character
        sb.insert(sb.length(), " java is a best coding language");
        System.out.println("After inserting data at last index: \n"+ sb);
        
        //we can set the minimum capacity to StringBuffer
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        System.out.println(sb.length()); //it will give lenth of array
        
        //StringBuilder and string buffer in java serve similar purposes, as they both provide mutable sequence of characters.
    }
}

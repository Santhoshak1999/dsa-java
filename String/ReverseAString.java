public class ReverseAString {
    
    public static String ReverseString(String str){
        String result = "";
        for(int i=str.length()-1;i>=0;i--){
            result = result + str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "Reverse This String";
        String rstr = ReverseString(str);
        System.out.println(rstr);
    }

    
}

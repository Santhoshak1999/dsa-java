public class Statics {
    static int snumber= 22;
    int number = 12;

    static void getmessage(){
        System.out.println("This is static method");
    }
    void nsmessage(){
        System.out.println("This is the non static method");
    }

    public static void main(String args[]){
        //directly access static method wherever requier in the same class 
        getmessage();
        System.out.println(snumber + " is a static variable");
        
        //System.out.println(number + " is a non - static variable");//couse an error
      
      
        // instance = ಯಾವುದೇ ವಸ್ತುವಿನ ನಿರ್ದಿಷ್ಟ ಸಾಕ್ಷಾತ್ಕಾರ
        //lets try with non static methods
        
        //nsmessage();//This couse an error 
        Statics stac = new Statics();
        System.out.println(stac.number);




    }
}

import java.util.Scanner;
public class reverseBit {
    // you need treat n as an unsigned value
    //to understand this u have to learn the bitwise operators
    public static int reverseBits(int n) {
        int result = 0;
        for(int i=0;i<32;i++){
            int bit = (n >> i) & 1;
            result = result | (bit << 31 - i); //opertes in bit level
        }
        return result;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Value to reverse In Binary: ");
        int num = in.nextInt();
        int result = reverseBits(num);
        System.out.println("Value after reverse in binary: " + result);
    }
}
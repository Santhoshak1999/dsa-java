package DataTypes;

public class CharDT {
    public static void main(String[] args) {
        //The chat data type is used to store a single charater. The charater surrounded by single quotes, like 'A', 'c'
        // char grade = "A";// unlike C programming Java will not convert the single charater inside with double quoted 
       
        char grade = 'B';
        System.out.println("Your Grade : " + grade);

        //Alternativlely, you can use the ascii code to store the charater elements
        for(int i=65;i<=90;i++){
            // grade = i; This will not work here becouse we have to typecast int to char
            grade = (char) i;
            System.out.print(grade + " ");
            System.out.println((int) grade);
        }
    }

    
}

class Solution {
    public int romanToInt(String s) {   
        //str.charAt(i); -- this is the builtin method to get charater from an array in java     
        int rom, num=0; 
        for(int i=0;i<s.length()-1;i++){
            rom = getRomanNumber(s.charAt(i));
            if(rom>=getRomanNumber(s.charAt(i+1))){
                num+=rom;
            }else{
                num-=rom;
            }
        }
        return num+=getRomanNumber(s.charAt(s.length()-1));
    }

    //create a method which returns the the value of reman integer
    public int getRomanNumber(char s){
        //there is no need of break statement becouse every case is returning 
        switch (s){
//In Java, use double quotation for string and single quote for character. When you use double quotes, you're specifying string literals instead of character literals.
            case 'I':return 1;
            case 'X':return 10;
            case 'V':return 5;
            case 'L': return 50;
            case 'C':return 100;
            case 'D': return 500;
            case 'M':return 1000;
            default: return 0;
        }
    }
}
/* 


    This code will not work becouse in the case we are fetching the details of string so also in return type 2 so char can not replace with string


 public int getRomanNumber(char s){
        //there is no need of break statement becouse every case is returning 
        switch (s){
            case 'I':return 1;
            case 'II':return 2;-------- |
            case 'III':return 3;        |   these three lines are not required here
            case 'IV':return 4;---------|
            case 'V':return 10;         
            case 'L': return 50;        
            case 'C':return 100;        
            case 'D': return 500;
            case 'M':return 1000;
            default: return 0;
        }
    }*/

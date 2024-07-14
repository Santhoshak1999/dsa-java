import java.util.HashSet;
class Main{
    public static void main(String[] args){
        HashSet<String> cars =  new HashSet<String>();
        /*
 * A hashset is a collection of items where every item is unique
 * and it is found in the java.utils packege
 * 
 * 
 */

        cars.add("BMW");
        cars.add("Mercudies Benz");
        cars.add("Huandy");
        cars.add("Inova");
        cars.add("Ferari");
        System.out.println(cars);
    
        for(String car : cars){
            System.out.println(car);
        }
    
    }

}
public class Main {
  public static void main(String[] args) {
		String[] cars = {"volvo", "suzuki", "bmw", "audi"};
        System.out.println(cars);//it will give you the address of cars 
        for(int i=0;i<cars.length;i++){
        	System.out.println(cars[i]);
        }
        //to access element at perticular value
        System.out.println(cars[0]);//0 is the index number of volvo
        //if you want to modify the perticular array index
        cars[0] = "modify";
        for(int i=0;i<cars.length;i++){
        	System.out.println(cars[i]);
        }
  }
}

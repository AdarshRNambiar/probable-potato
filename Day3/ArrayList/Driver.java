import java.util.ArrayList;

public class Driver{
    public static void display(Fruit[] fruits){
        for(int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }

    }

    public static void main(String[] args){
        Fruit Watermelon = new Fruit("Round","Green","Watermelon");
        System.out.println();


        Fruit[] fruits =new Fruit[3];
        fruits[0] = new Fruit("Long","yellow","Banana");
        fruits[1] = Watermelon;
        fruits[2] =new Fruit("Round","red","Apple");
    
        Driver driver =new Driver();
        driver.display(fruits);
    
        ArrayList<Fruit> fruitList =new ArrayList<>();
        fruitList.add(Watermelon);
        fruitList.add(new Fruit("Long","yellow","Banana"));
        fruitList.add(new Fruit("Round","red","Apple"));

        System.out.println(fruitList);

        fruitList.remove(2);
        System.out.println(fruitList);


        /*ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(10);*/

    }
}
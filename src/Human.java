import java.util.ArrayList;

public class Human{

    public Car giveCar(){
        return new Car();
    }
    public static void main(String[] args) throws InterruptedException {
        /*Human[] humans = new Human[10];
        for (int i = 0; i < 10; i++){

            humans[i]  = new Human();
            System.out.println(humans[i]);
            Thread.sleep(1000);
        }*/

        ArrayList<Human> humanArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            humanArrayList.add(new Human());
        }

        for (Human a: humanArrayList){
            System.out.println(a);
        }
    }
}

public class Human {

    public void giveCar(){

    }
    public static void main(String[] args) {
        Human[] humans = new Human[10];
        for (int i = 0; i < 10; i++){
             humans[i]  = new Human();
            System.out.println(humans[i]);
        }


    }
}

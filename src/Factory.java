public class Factory {

    public Work work;
    public Human human = new Human();
    public Assemblage assemblage = new Assemblage();
    public Paint paint = new Paint();

    public Factory() {
        Car car = new Car();
    }

    public void painting(){
        paint.working();
    }

    public void assembling(){
        assemblage.working();
    }

    public void giveCar(){
        human.giveCar();
    }



}

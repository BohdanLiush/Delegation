public class Factory {
    private Work work;

    public Factory(Work work) {
        this.work = work;
    }

    Human human = new Human();
    Car car = new Car();

    public Assemblage assemblage = new Assemblage();
    public Paint paint = new Paint();

    public Factory(Assemblage assemblage, Paint paint) {
        this.assemblage = assemblage;
        this.paint = paint;
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

    public void newCar(){
        new Factory(assemblage,paint);
    }

}

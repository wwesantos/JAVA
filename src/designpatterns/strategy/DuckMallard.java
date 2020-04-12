package designpatterns.strategy;

public class DuckMallard extends Duck{
    public DuckMallard(){
        //Adding behavior during instantiation
        quackBehavior = new QuackQuack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("DuckMallard");
    }
}
package designpatterns.strategy;

public class DuckRobot extends Duck{
    public DuckRobot(){
        //Adding behavior during instantiation
        quackBehavior = new QuackQuack();
        flyBehavior = new FlyWithRocket();
    }

    public void display(){
        System.out.println("DuckRobot");
    }
}
package designpatterns.strategy;

public class DuckRubber extends Duck{
    public DuckRubber(){
        //Adding behavior during instantiation
        quackBehavior = new QuackQuack();
        flyBehavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("DuckRubber");
    }
}
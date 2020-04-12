package designpatterns.strategy;

public class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly(){
        flyBehavior.fly();
    }
    
    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks swim");
    }

    public void display(){
         System.out.println("Duck");
    }

    //Overriding behavior in runtime 
    public void setFlyBehavior(FlyBehavior fb){
        this.flyBehavior = fb;
    }

    //Overriding behavior in runtime 
    public void setQuackBehavior(QuackBehavior fb){
        this.quackBehavior = fb;
    }
}
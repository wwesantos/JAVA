package designpatterns.strategy;

public class QuackMute implements QuackBehavior{
    public void quack(){
        System.out.println("NoQuack");
    }
}
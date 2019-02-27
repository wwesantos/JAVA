import java.util.List;
import java.util.ArrayList;
public class TestDuck{
    public static void main(String...args){
        List<Duck> duckList = new ArrayList<Duck>();
        duckList.add(new DuckMallard());
        duckList.add(new DuckRobot());
        duckList.add(new DuckRubber());
        for(Duck each: duckList) handleDuck(each);

        System.out.println("changeBehaviorInRuntime");
        System.out.println();
        changeFlyBehaviorInRuntime(duckList.get(1),new FlyWithWings());
        changeQuackBehaviorInRuntime(duckList.get(2),new QuackMute());
        for(Duck each: duckList) handleDuck(each);
    }

    private static void handleDuck(Duck duck){
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.swim();
        System.out.println();
    }

    private static void changeQuackBehaviorInRuntime(Duck duck, QuackBehavior b){
        duck.setQuackBehavior(b);
    }

    private static void changeFlyBehaviorInRuntime(Duck duck, FlyBehavior b){
        duck.setFlyBehavior(b);
    }
}
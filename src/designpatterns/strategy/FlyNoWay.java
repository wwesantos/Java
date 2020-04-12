package designpatterns.strategy;

public class FlyNoWay implements FlyBehavior{
    public void fly(){
        System.out.println("FlyNoWay");
    }
}
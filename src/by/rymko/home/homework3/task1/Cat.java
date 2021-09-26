package by.rymko.home.homework3.task1;

public class Cat extends Animal {
   @Override
    void run(double distance) {
        if (distance > 200) {
            System.out.println("Cat cannot run. Limit 200. Input distance " +distance);
        } else {
            System.out.println("Cat can run");
        }
    }
    @Override
    void jump(double distance) {
        if (distance > 2) {
            System.out.println("Cat cannot jump. Limit 2. Input distance " +distance);
        } else {
            System.out.println("Cat can jump");
        }
    }
    @Override
    void swim(double distance) {
        if (distance > 0) {
            System.out.println("Cat cannot swim. ");
        }
    }
}

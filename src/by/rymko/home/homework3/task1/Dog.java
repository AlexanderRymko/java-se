package by.rymko.home.homework3.task1;

public class Dog extends Animal {
    @Override
    void run(double distance) {
        if (distance > 500) {
            System.out.println("Dog cannot run. Limit 500. Input distance " + distance);
        } else {
            System.out.println("Dog can run");
        }
    }

    @Override
    void jump(double distance) {
        if (distance > 0.5) {
            System.out.println("Dog cannot jump. Limit 0.5. Input distance " + distance);
        } else {
            System.out.println("Dog can jump");
        }

    }

    @Override
    void swim(double distance) {
        if (distance > 10) {
            System.out.println("Dog cannot swim. Limit 10. Input distance " + distance);
        } else {
            System.out.println("Dog can swim");
        }

    }
}

package by.rymko.home.homework3.task1;

public class AnimalRunner {
    public static void main(String[] args) {
        int runningDistance=300;
        double jumpDistance=1.5;
        int swimDistance=15;
        Dog sharic = new Dog();
        sharic.run(runningDistance);
        sharic.jump(jumpDistance);
        sharic.swim(swimDistance);
        Cat murzik = new Cat();
        murzik.run(runningDistance);
        murzik.jump(jumpDistance);
        murzik.swim(swimDistance);
    }
}

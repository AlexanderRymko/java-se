package by.rymko.home.homework3.task1;

public class CourseRunner {
    public static void main(String[] args) {
        System.out.println("Hello! The competitions is beginning");
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Team team1 = new Team("First team", dog1,dog2,cat1,cat2);

        Course course1 = new Course("jumping");
        course1.start(team1,100);
        System.out.println();

        Course course2 = new Course("swimming");
        course2.start(team1,5);
        System.out.println();

        Course course3 = new Course("walking");
        course3.start(team1,1000);
        System.out.println();

        Course course4 = new Course("running");
        course4.start(team1,100);
        System.out.println();
    }
}

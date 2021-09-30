package by.rymko.home.classwork27;

public class Kangaroo extends Animal {

    public Kangaroo() {
    }


    public Kangaroo(String name) {
        super("Kangaroo",name);
    }

    private final Integer MAX_RUN_DISTANCE = 1200;
    private final double MAX_JUMP_HEIGHT = 2.5;
    private final Integer MAX_SWIM_DISTANCE = 3;

    @Override
    public boolean run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
//            System.out.println(String.format("%s %s run distance ", this.getName(), this.getType()));
            return true;
        } else {
//            System.out.println(String.format("%s %s don't run distance ", this.getName(), this.getType()));
            return false;
        }

    }

    @Override
    public boolean jump(double height) {
        if (height <= MAX_JUMP_HEIGHT) {
//            System.out.println(String.format("%s %s jump distance ", this.getName(), this.getType()));
            return true;
        } else {
//            System.out.println(String.format("%s %s don't jump distance ", this.getName(), this.getType()));
            return false;
        }
    }

    @Override
    public boolean swim(int distance) {

        if (distance <= MAX_SWIM_DISTANCE) {
//            System.out.println(String.format("%s %s swim distance ", this.getName(), this.getType()));
            return true;
        } else {
//            System.out.println(String.format("%s %s don't swim distance ", this.getName(), this.getType()));
            return false;
        }
    }
}

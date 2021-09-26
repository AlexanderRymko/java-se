package by.rymko.home.homework3.task1;

public class Course {
    private String type;

    public Course(String type) {
        this.type = type;
    }

    public void start(Team team, double distance) {
        System.out.println("Team name is: " + team.getName());
        switch (type) {
            case ("running"):
                for (int i = 0; i < team.getMembers().length; i++) {
                    team.getMembers()[i].run(distance);
                }
                break;
            case ("jumping"):
                for (int i = 0; i < team.getMembers().length; i++) {
                    team.getMembers()[i].jump(distance);
                }
                break;
            case ("swimming"):
                for (int i = 0; i < team.getMembers().length; i++) {
                    team.getMembers()[i].swim(distance);
                }
                break;
            default:
                System.out.println("Unknown type");
                break;
        }
    }

}

package by.rymko.home.homework2;

public class Worker {
    private String name;        // поле ФИО
    private String position;
    private String mail;
    private String phoneNumber;
    private int salary;
    private int age;
// конструктор
    public Worker(String name, String position, String mail, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
// Метод - геттер
    public String getName() {
        return name;
    }
    // Метод - сеттер
    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
// Метод toString
    public String toString() {
        return String.format("Возраст сотрудника: %s. Имя сотрудника: %s", age, name);
    }
}


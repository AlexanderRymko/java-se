package by.rymko.home.classwork27;

public abstract class Animal {
    public Animal() {

    }

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    private String name;
    private String type;


    public abstract boolean run(int distance);

    public abstract boolean jump(double height);

    public abstract boolean swim(int distance);

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


////Практика

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
// В качестве параметра каждому методу передается величина, означающая или длину
// препятствия (для бега и плавания), или высоту (для прыжков).

//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
// прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат
// в консоль. (Например, dog1.run(150); -> результат: run: true)
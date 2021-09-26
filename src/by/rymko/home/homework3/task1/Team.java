package by.rymko.home.homework3.task1;

public class Team {
    private String name;
    private Animal[] members = new Animal[4];

    public String getName() {
        return name;
    }

    public Animal[] getMembers() {
        return members;
    }

    public Team(String name, Animal member1, Animal member2, Animal member3, Animal member4) {
        this.name = name;
        this.members[0] = member1;
        this.members[1] = member2;
        this.members[2] = member3;
        this.members[3] = member4;
    }
}



//2. Добавить класс Team, который будет содержать: название команды, массив из 4-х участников
// (т.е. в конструкторе можно сразу всех участников указывать), метод для вывода информации о членах команды
// прошедших дистанцию, метод вывода информации обо всех членах команды.
//3. Добавить класс Course (полоса препятствий), в котором будут находиться: массив препятствий, метод
// который будет просить команду пройти всю полосу;
//
//То есть в итоге должно быть:
//
//public static void main(String[] args) {
//Course c = new Course(...); // Создаем полосу препятствий
//Team team = new Team(...); // Создаем команду
//c.doIt(team); // Просим команду пройти полосу
//team.showResults(); // Показываем результаты
//}
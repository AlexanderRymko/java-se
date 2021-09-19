package by.rymko.home.homework2;

public class WorkerRunner {
    public static void main(String[] args) {
        System.out.println("Информация о сотрудниках: ");

//        Worker worker1 = new Worker();
//        worker1.setAge(10);
//        System.out.println(worker1.getAge());

        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Zhenua Ivanov", "engineer", "zhenua@mail.ru", "2020326", 5000, 28);
        workers[1] = new Worker("Alex Ivanov", "worker", "Ivanov@mail.ru", "2022236", 3000, 43);
        workers[2] = new Worker("Nastia Petrova", "HR manager", "Petrova_nastia@mail.ru", "100500", 4000, 29);
        workers[3] = new Worker("Nik Markov", "Shef engeener", "Markov@mail.ru", "2251558", 7500, 49);
        workers[4] = new Worker("Oleg Sergeev", "engineer", "Sergeev@mail.ru", "2236589", 6000, 63);

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() > 40) {
                System.out.println(workers[i].toString());
            }

        }
    }
}


package by.rymko.home;

public class Task2 {
    public static void main(String[] args) {
        //   Примитивные типы данных в языке Java
        // Целые числа
        byte a=12;  // Допустимый диапазон от -128 до 127. Длина в битах 8
        short s=514; // Длина в битах 16
        int i=56825;   // Длина в битах 32
        long l=123456789;  // Длина в битах 64
        // Числа с плавающей точкой
        float f= 1.25F; // Диапазон от 1.4e-045 до 3.4e+038
        double d=3.25; // Диапазон от 4.9e-324 до 1.8e+308
        // Символы
        char ch1 = 88; // Переменной ch1 присвоен символ X
        char ch2 = 'Y';  // Переменной ch1 присвоен символ Y
        // Логические
        boolean bool; // Переменная может принимать значение true или false
        // Строки
        String str = "Hello. World!";
        System.out.println(str);
        // Преобразование типов переменных
        int e = 1;
        long n = 99;
        e = (int) n; // Явное приведение переменной n к e
        System.out.println(e);
    }
}



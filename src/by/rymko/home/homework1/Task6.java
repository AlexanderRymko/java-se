package by.rymko.home.homework1;

public class Task6 {
    public static void main(String[] args) {
        int array1[] = {1, 4, 1, 1, 2, 1};
        boolean result=getAnswer(array1);
        System.out.println(result);
    }
    public static boolean getAnswer(int[] array) {
        if (array.length < 2) return false;
        int pointer;
        for (pointer = 0; pointer < array.length - 1; pointer++) {
            int leftSum = 0;
            for (int j = 0; j <= pointer; j++) {
                leftSum += array[j];
            }
            int rightSum = 0;
            for (int j = pointer + 1; j < array.length; j++) {
                rightSum += array[j];
            }
            if (leftSum == rightSum) {
                System.out.println(leftSum + " = " + rightSum + " , index #" + pointer);
                return true;
            }
        }
        return false;
    }
}
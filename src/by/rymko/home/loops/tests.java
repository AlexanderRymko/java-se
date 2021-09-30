package by.rymko.home.loops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tests {


    public static void main(String[] args) {
        String emailAdress[] = {"AlexanderRymko@mail.ru", "Znenya@gmail.com", "№isha1993@gmail.com"};
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

        for (int i = 0; i < emailAdress.length; i++) {
            Matcher matcher = pattern.matcher(emailAdress[i]);
            if (matcher.find()) {
                System.out.println("Адрес электронной почты " + emailAdress[i] + " введен верно");
            } else
                System.out.println("Адрес электронной почты " + emailAdress[i] + " введен не верно");

        }
    }
}


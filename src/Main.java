// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        int first = 100000;
        byte second = 100;
        short third = 10;
        long fourth = 999999;
        float fifth = 5.6F;
        double sixth = 5.6242354364;
        System.out.println("Значение переменной first с типом int равно " + first);
        System.out.println("Значение переменной second с типом byte равно " + second);
        System.out.println("Значение переменной third с типом short равно " + third);
        System.out.println("Значение переменной fourth с типом long равно " + fourth);
        System.out.println("Значение переменной fifth с типом float равно " + fifth);
        System.out.println("Значение переменной sixth с типом double равно " + sixth + "\n");

        //Задача 2
        float firctNumber = 27.12f;
        long secondNumber = 987678965549L;
        short thridNumber = 2786;
        short fourNumber = 569;
        short fiveNumber = -159;
        short sixNumber = 27897;
        byte sevenNumber = 67;

        //Задача 3
        byte firstClass = 23;
        byte secondClass = 27;
        byte thridlass = 30;
        short pappers = 480;
        int itogo = pappers / (firstClass + secondClass + thridlass);
        System.out.println("На каждого ученика рассчитано " + itogo + " листов бумаги.");

        //Задача 4
        int efficiency = 16 / 2;
        int twentyMinutes = efficiency * 20;
        int mpd = 24 * 60;
        int day = efficiency * mpd;
        int threeDays = efficiency * mpd * 3;
        int oneMonth = efficiency * mpd * 30;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + oneMonth + " штук бутылок");

        //Задача 5
        int allColours = 120;
        int white = 2;
        int brown = 4;
        int oneClass = white + brown;
        int classesAll = allColours / oneClass;
        int whiteClasses = classesAll * white;
        int brownClasses = classesAll * brown;
        System.out.println("В школе, где " + classesAll + " классов, нужно " + whiteClasses + " банок белой краски и " + brownClasses + " банок коричневой краски».");

        //Задача 6
        short bananas = 5 * 80;
        short milk = 200 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int itogoGramm = bananas + milk + iceCream + eggs;
        float itogoKillogramm = (float)(itogoGramm) / 1000;
        System.out.println("Грамм " + itogoGramm);
        System.out.println("КилоГрамм " + itogoKillogramm);

        //Задача 7
        int weightS = 7 * 1000; // В граммах
        //250 гр
        float weight250 = (float) weightS / 250;
        System.out.println("250 гр в день " + weight250);

        //500 гр
        float weight500 = (float) weightS / 500;
        System.out.println("500 гр в день " + weight500);

        float middleDay = (weight250 + weight500) / 2;
        System.out.println("Теряет в среднем в день " + middleDay);

        float daysWeek = middleDay * 7;
        System.out.println("Итого за 7 дней примерно: " + daysWeek);


    }
}
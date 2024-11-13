public class Main {
    public static void main(String[] args) {

        //Task1
        System.out.println("Задача 1");
        System.out.println();
        int stash = 0;
        short cash = 15000;
        short month = 0;
        while (stash < 2459000) {
            stash += cash;
            month++;
        }
        System.out.println("Месяц "+month+", сумма накоплений равна "+stash+" рублей.");
        System.out.println();

        //Task2
        System.out.println("Задача 2");
        System.out.println();
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();

        //Task3
        System.out.println("Задача 3");
        System.out.println();
        int population = 12000000;
        byte birthRate = 17;
        byte deathRate = 8;
        i = 0;
        while (i < 10) {
            i++;
            population+=((birthRate-deathRate)*population)/1000;
            System.out.println("Год "+i+",  численность населения составляет "+population+".");
        }
        System.out.println();

        //Task 4
        System.out.println("Задача 4");
        System.out.println();
        int goal = 12000000;
        stash = 15000;
        month = 0;
        while (stash < goal) {
            month++;
            stash+=stash*0.07;
            System.out.println("Месяц "+month+", сумма накоплений равна "+stash+" рублей.");
        }
        System.out.println();

        //Task 5
        System.out.println("Задача 5");
        System.out.println();
        goal = 12000000;
        stash = 15000;
        month = 0;
        while (stash < goal) {
            month++;
            stash+=stash*0.07;
            if (month % 6 == 0) {
            System.out.println("Месяц "+month+", сумма накоплений равна "+stash+" рублей.");
            }
        }
        System.out.println();

        //Task 6
        System.out.println("Задача 6");
        System.out.println();
        month = 0;
        stash = 15000;
        byte years = 9;
        while (month < years * 12) {
            month++;
            stash+=stash*0.07;
            if (month % 6 == 0) {
                System.out.println("Месяц "+month+", сумма накоплений равна "+stash+" рублей.");
            }
        }
            System.out.println();

        //Task 7
        System.out.println("Задача 7");
        System.out.println();
        int friday = 4;
        while (friday<=31) {
            System.out.println("Сегодня пятница "+friday+"-е, число. Необходимо подготовить отчет.");
            friday+=7;
        }
        System.out.println();

        //Task 8
        System.out.println("Задача 8");
        System.out.println();
        int currYear = 2024;
        i=0;
        while (i < currYear+100) {
            if ((currYear - 200) <= i && i % 79 == 0) {
                System.out.println(i);
            }
            i+=79;
        }
        System.out.println();



    }
}
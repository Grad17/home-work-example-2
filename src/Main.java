public class Main {
    public static void main(String[] args) {

        //task1

        int clientOS = 1;
        if (clientOS > 0) {
            //     System.out.println("Установите версию приложения Android по ссылке.");
        } else {
            //           System.out.println("Установите версию приложения iOS по ссылке.");
        }

        //task2
        // 0 — iOS, 1 — Android.
        //Если телефон >= 2015 по нынешний год, то приложение будет работать корректно.
        //Если телефон < 2015 года, то клиенту нужно установить облегченную версию приложения.

        int clientOS1 = 0;
        int clientDeviseYear = 2007;

        if (clientOS1 == 1 && clientDeviseYear >= 2015) {
            System.out.println("Установите версию приложения Android по ссылке.");
        } else if (clientOS1 == 1 && clientDeviseYear < 2015) {
            System.out.println("Установите облегчнную версию для Android по ссылке.");
        }
        if (clientOS1 == 0 && clientDeviseYear >= 2015) {
            System.out.println("Установите версию приложения iOS по ссылке.");
        } else if (clientOS1 == 0 && clientDeviseYear < 2015) {
            System.out.println("Установите облегчнную версию для iOS по ссылке.");
        }

// task3

        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else
            System.out.println(year + " год является не високосным.");


//task4

        int deliveryDistance = 95;

        boolean deliveryPeriod1 = deliveryDistance > 0 && deliveryDistance <= 20;
        boolean deliveryPeriod2 = deliveryDistance > 20 && deliveryDistance <= 60;
        boolean deliveryPeriod3 = deliveryDistance > 60 && deliveryDistance <= 100;

        if (deliveryPeriod1) {
            int deliveryPeriod = 1;
            System.out.println("Потребуется дней " + deliveryPeriod);
        }
        if (deliveryPeriod2) {
            int deliveryPeriod = 2;
            System.out.println("Потребуется дней " + deliveryPeriod);
        }
        if (deliveryPeriod3) {
            int deliveryPeriod = 3;
            System.out.println("Потребуется дней " + deliveryPeriod);
        }
//task 5

        int monthNumber = 9;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " это месяц зимы.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " это месяц весны.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " это месяц лета.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " это месяц осени.");
                break;
        }


    }
}
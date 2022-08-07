public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }
        public static void task1 () {

            int clientOS = 0;
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        }
        public static void task2 () {

        int clientOS = 1;
        int yearOfIssue = 2015;
        int clientDeviceYear = 2021;
        if (clientDeviceYear<yearOfIssue) {
            System.out.print("Установите облегченную версию приложения для");
        } else {
            System.out.print("Установите версию приложения для");
        }
        if (clientOS == 1) {
            System.out.println(" Android по ссылке");
        } else {
            System.out.println(" IOS по ссылке");
        }

    }
        public static void task3 () {

        int year = 2016;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("год является високосным");
        } else {
            System.out.println("год не является високосным");
        }
        }
        public static void task4 () {

        int deliveryDistance = 95;
        int deliveryDays = 1;
        int start = 20;
        int interval = 40;
        if (deliveryDistance<=start) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance-start)/(double) interval);
        }
            System.out.println("Потребуется дней: " + deliveryDays);

        }
     public static void task5 () {

        int monthNumber = 21;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
     }
    }




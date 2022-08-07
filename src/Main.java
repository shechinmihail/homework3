public class Main {
    public static void main(String[] args) {
        task6();
        task7();


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

     public static void task6 () {

         int age = 19;
         int salary = 58_000;
         double limit;

         if (age < 23) {
             limit = salary * 2;
         } else {
             limit = salary * 3;
         }
         if (salary >= 50_000) {
             limit *= 1.2;
         } else if (salary >= 80_000) {
             limit *= 1.5;
         }
         System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей.");
     }

     public static void task7 () {

         int age = 25;
         int salary = 60_000;
         int wantedSum = 330_000;
         int maxMonthlyPayment = salary / 2;
         int creditTerm = 12;
         float interestRate = 10;
         if (age < 23) {
             interestRate++;
         } else if (age < 30) {
             interestRate += 0.5;
         }
         if (salary > 80_000) {
             interestRate -= 0.7;
         }
         float creditSum = wantedSum * (1 + (interestRate / 100));
         float payment = creditSum / creditTerm;
         System.out.println("Ваш максимальный платеж: " + maxMonthlyPayment + ". Платеж по кредиту: " + payment);
         if (payment > maxMonthlyPayment) {
             System.out.println("Отказано.");
         } else {
             System.out.println("Одобрено.");
         }
     }
       }







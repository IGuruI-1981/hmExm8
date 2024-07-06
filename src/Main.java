public class Main {
    public static void calculateYear(int Year) {
        if ( Year % 4 == 0 && Year % 100 != 0) {
            System.out.println("Год " + Year + " високосный");
        } else if (Year % 4 == 0 && Year % 100 == 0 && Year % 400 == 0 ) {
            System.out.println("Год " + Year + " високосный");
        } else {
            System.out.println("Год " + Year + " не високосный");
        }
    }
    public static void yearOS(int clientOS, int clientDeviceYear){
        if ( clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }
    public static int day(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance < 20) {
            day = day;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            day =day + 1;

        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            day =day + 2;

        } else {
            day = 0;
        }
        return day;
    }

    public static void main(String[] args) {
        System.out.println("Hello SkyPRO!");

        //Задача 1..
        int Year = 2000;
        calculateYear(Year);

        //Задача 2..

        int clientOS = 1;                  // Выбор ОС: 0- iOS, 1- Android
        int clientDeviceYear = 2007;
        yearOS(clientOS, clientDeviceYear);


        //Задача 3..
        int deliveryDistance = 95;
        //day(deliveryDistance);
        int deliveryDay = day(deliveryDistance);
        if (deliveryDay == 0){
            System.out.println("Доставка не осуществляется");
        } else {
            System.out.println("Потребуется дней: " + deliveryDay);
        }


    }
}
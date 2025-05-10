public class Main {
    public static void main(String[] args) {
        System.out.println("Operator conditional.");

        System.out.println("Задача.1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println("Задача2.");
        clientOS = 1;
        int clientDeviceYear = 2005;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для android по ссылке.");
        } else {
            System.out.println("Установите обычную версию приложения для android по ссылке.");
        }
        System.out.println("Задача 3.");
        int year = 1800;
        if (year > 1584 && ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0)) {
            System.out.println(year + " год, является високосным.");
        } else {
            System.out.println(year + " год, не является високосным.");
        }
        System.out.println("Задача 4.");
        int deliveryDistance = 9;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + 3);
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("Задача 5.");
        int monthNumber = 8;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + "-й месяц принадлежит к зимнему сезону.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к весеннему сезону.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к летнему сезону.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к осеннему сезону");
            default:
                System.out.println("Такого месяца не существует.");
        }

    }
}
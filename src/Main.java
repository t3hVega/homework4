import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        System.out.println("ДЗ выполнено");
    }
    public static void task1() {
        System.out.println("Задача 1:");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        System.out.println("Задача 2:");
        int temperature = 6;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }   else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
    }
    public static void task3() {
        System.out.println("Задача 3:");
        int speed = 61;
        if (speed <= 60) {
            System.out.println("Если скорость равна " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость равна " + speed + ", то придется заплатить штраф");
        }
    }
    public static void task4() {
        System.out.println("Задача 4:");
        int age = 4;
        if (age >= 24) {
            System.out.println("Человеку " + age + " лет, ему нужно работать" );
        } else {
            if (age >= 2 && age <= 6) {
                System.out.println("Человеку " + age + " лет, ему нужно ходить в детский сад" );
            }
            if (age >= 7 && age <= 18) {
                System.out.println("Человеку " + age + " лет, ему нужно ходить в школу");
            }
            if (age > 18 && age < 24) {
                System.out.println("Человеку " + age + " лет, ему нужно ходить в ВУЗ" );
            }
        }
    }
    public static void task5() {
        System.out.println("Задача 5:");
        int age = 14;
        if (age >= 5 && age < 14) {
            System.out.println("Ребенку " + age + " лет, он может кататься на аттракционе в сопровождении взрослого");
        } else {
            if (age < 5) {
                System.out.println("Ребенку " + age + " лет, он не может кататься на аттракционе");
            }
            if (age >= 14) {
                System.out.println("Ребенку " + age + " лет, он может кататься на аттракционе один");
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6:");
        int cartCapacity = 102;
        int cartSeats = 60;
        int placesTaken = 102;
        boolean seatAvailable = (placesTaken < 60);
        if (seatAvailable) {
            System.out.println("Есть свободное сиденье");
        } else {
            if (placesTaken < 102) {
                System.out.println("Есть стоячее место");
            } else {
                System.out.println("Вагон забит");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7:");
        int one = 200;
        int two = 240;
        int three = 72;
        if (one > two && one > three) {
            System.out.println("Первое число наибольшее");
        }  else {
            if (one > two && one < three) {
                System.out.println("Третье число наибольшее");
            } else {
                if (two > three) {
                    System.out.println("Второе число наибольшее");
                }
            }
        }

    }
}
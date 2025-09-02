import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задача 2");
        int t = 8;
        if (t <= 5) {
            System.out.println("На улице холодно, нужно одеть шапку");
        } else {
            System.out.println("На улице " + t + " градусов. Сегодня тепло, можно идти без шапки");
        }
        System.out.println("Задача 3");
        int s = 80;
        if (s > 60) {
            System.out.println("Если скорость " + s + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + s + ", то можно ездить спокойно");
        }
        System.out.println("Задача 4");
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age4 = scanner4.nextInt();
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен " + age4 + " лет, то ему нужно ходить в детский сад.");
        }
        if (age4 >= 7 && age4 <= 17) {
            System.out.println("Если возраст человека равен " + age4 + " лет, то ему нужно ходить в школу.");
        }
        if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + " лет, то ему нужно ходить в университет.");
        }
        if (age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + " лет, то ему пора ходить на работу.");
        }
        System.out.println("Задача 5");
        Scanner scanner5 = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age5 = scanner5.nextInt();
        if (age5 < 5) {
            System.out.println("Если возраст ребенка равен " + age5 + ", то он не может кататься на аттракционе.");
        }
        if (age5 >= 5 && age5 < 14) {
            System.out.println("Если возраст ребенка равен " + age5 + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (age5 >= 14) {
            System.out.println("Если возраст ребенка равен " + age5 + ", то он может кататься без сопровождения взрослого.");
        }
        System.out.println("Задача 6");
        int a = 102;
        int b = 60;
        int c = 20;
        if (c <= a) {
            System.out.println("В вагоне есть место");
        } else {
            System.out.println("В вагоне нет места");
        }
        if (c <= b) {
            System.out.println("В вагоне есть сидячее место");
        } else if ((c > b && c <= a)) {
            System.out.println("В вагоне есть только стоячее место");
        }
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if ((one > two) && (one > three))
        System.out.println(one);
        else {
        if ((two > one) && (two > three))
            System.out.println(two);
        else {
            System.out.println(three);
            }
        }

    }
}


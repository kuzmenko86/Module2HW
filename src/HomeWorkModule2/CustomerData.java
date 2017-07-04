package HomeWorkModule2;

import java.util.Scanner;

public class CustomerData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя");
        String name = sc.nextLine();

        System.out.println("Введите город");
        String city = sc.nextLine();

        int age;
        //sc.nextLine();//java bug

        while (true) {
            try {
                System.out.println("Введите возраст");
                age = sc.nextInt();
                sc.nextLine();//java bug
                break;
            } catch (Exception e) {
                System.out.println("Упс, это не число!!! может все таки - ");
                sc.nextLine();//java bug
            }
        }

        System.out.println("Введите hobby");
        String hobby = sc.nextLine();


        System.out.println(" ***** Вариант 1 (табличный): ");
        System.out.println("Имя: " + name);
        System.out.println("Город: " + city);
        System.out.println("Возраст: " + age);
        System.out.println("Хобби: " + hobby);
        System.out.println("===================: ");
        System.out.println();

        System.out.println("***** Вариант 2 (текстовый):");
        System.out.println("Человек по имени " + name + " живет в городе " + city);
        System.out.println("Этому человеку " + age + " лет и любит он заниматься " + hobby);
        System.out.println("===================: ");
        System.out.println();

        System.out.println(" ***** Вариант 3 (иной): ");
        System.out.println(name + " - Имя");
        System.out.println(city + " - Город");
        System.out.println(age + " - Возраст");
        System.out.println(hobby + " - Хобби");
        System.out.println("======== E N D =========== ");
        System.out.println();

    }
}

import java.util.Scanner;

public class CustomerData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя");
        String name = sc.nextLine();

        System.out.println("Введите город");
        String city = sc.nextLine();

        System.out.println("Введите возраст");
        int age = sc.nextInt();
        sc.nextLine();//java bug

        System.out.println("Введите hobby");
        String hobby = sc.nextLine();


        System.out.println(" ***** Вариант 1 (табличный): ");
        System.out.println("Имя: " + name);
        System.out.println("Город: " + city);
        System.out.println("Возраст: " + age);
        System.out.println("Хобби: " + hobby);
        System.out.println("===================: " + name);

        System.out.println("***** Вариант 2 (текстовый):" + name);
        System.out.println("Человек по имени " + name + " живет в городе " + city);
        System.out.println("Этому человеку " + age + " лет и любит он заниматься " + hobby);
        System.out.println("===================: ");


        System.out.println(" ***** Вариант 3 (иной): ");
        System.out.println(name + " - Имя");
        System.out.println(city + " - Город");
        System.out.println(age + " - Возраст");
        System.out.println(hobby + " - Хобби");
        System.out.println("======== E N D =========== ");

    }
}

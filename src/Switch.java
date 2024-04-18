import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();

        switch (age) {
            case 10 :
                System.out.println("Ты учишься в школе");
                break;
            case 18 :
                System.out.println("Ты закончил школу");
                break;
            default :
                System.out.println("Ни одно условие не было выполнено!");
        }

//        if (age == 10) {
//            System.out.println("Ты учишься в школе");
//        } else if (age == 18) {
//            System.out.println("Ты закончил школу");
//        }
    }
}

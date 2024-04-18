public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println(i);

            if (i == 15) {
                break;
            }

            i++;
        }
        System.out.println("Вы вышли из цикла!");

        System.out.println("Нечетные числа: ");
        for (int j = 0; j <= 15; j++) {
            if (j % 2 == 0) {
                continue;
            }
            System.out.print(j + " ");
        }
    }
}

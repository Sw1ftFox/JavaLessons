public class ArraysOfStrings {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "привет";
        strings[1] = "пока";
        strings[2] = "джава";

        System.out.println(strings[0]);
        System.out.println(strings[2]);

        for (int i = 0; i < strings.length; i++){
            System.out.print(strings[i] + " ");
        }
        System.out.println();

        for (String str: strings){//foreach
            System.out.print(str + " ");
        }
        System.out.println();

        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int item: numbers1){
            sum += item;
        }
        System.out.println(sum);
    }
}

public class Arrays {
    public static void main(String[] args) {
        int number  = 10;//примитивный тип данных  [10]
        //char character = 'a';//примитивный тип данных
        //String s = "Hello";
        //String s1 = new String("Hello");//аналог первого способа
        int[] numbers = new int[5];// numbers --> [массив] Ссылочный тип
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
            System.out.print(numbers[i] + " ");
        }
        int[] numbers1 = {1, 2, 3};//заранее готовый массив

    }
}

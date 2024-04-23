public class FormattedOutPut {
    public static void main(String[] args) {
        System.out.print("Hi ");
        System.out.println("Hello");
        System.out.printf("This is a string %s, number %d and float %f", "NICE", 12, 12.4);
        //%s вставляем строку, указанную после "," в место нахождения этого символа
        //%d вставляем число в место нахождения этого символа
        System.out.println();

        System.out.printf("String %10d \n", 532);
        //выделяем 10 ячеек под число
        //\n - символ, чтобы printf стал перебрасывать курсор на следующую строку подобно println

        System.out.printf("String %-10d \n", 532);
        //выделяет ячейки не слева, а справа от числа

        System.out.printf("String %.2f", 45.325);
        //задает количество чисел после ","
    }
}

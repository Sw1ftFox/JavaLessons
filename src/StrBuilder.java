public class StrBuilder {
    public static void main(String[] args) {
//        String x = "Hello";
//        x = x.toUpperCase();
//        System.out.println(x);

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(123).append(456);
        System.out.println(sb.toString());
    }
}

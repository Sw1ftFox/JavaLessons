public class Constructors {
    public static void main(String[] args) {
        //В классе мы сами задаем значения ключам
        //В конструкторах все задано изначально
        Man man1 = new Man("Bob", 40);
        Man.description = "Nice";
        man1.getAllFields();
        Man.description = "Bad";
        Man.getDescription();
        man1.getAllFields();

    }
}
class Man {
    private String name;
    private int age;
    //ключевым словом static обозначаются переменные класса
    public static String description;

    public Man(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getDescription() {
        System.out.println(description);
    }

    public void getAllFields() {
        System.out.println(name + ", " + age + ", " + description);
    }
}
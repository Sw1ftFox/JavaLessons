public class ClassesAndObjects {
    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.name = "Роман";
//        person1.setName("Денис");
//        System.out.println(person1.name);
//        person1.age = 50;
//        person1.sayHi();
//
//        Person person2 = new Person();
//        person2.name = "Владимир";
//        person2.age = 20;
//        System.out.println(person2.calculateYearsToRetirement());

        Person person1 = new Person();
        person1.setName("Вова");
        person1.setAge(34);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());
        person1.speak();
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if ( userName.isEmpty() ) {
            System.out.println("Ты ввел пустое имя!");
        } else {
            name = userName;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge <= 0) {
            System.out.println("Возраст должен быть положительным!");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak(){
        System.out.println("Меня зовут " + name + " и мне " + age + " лет");
    }
    void sayHi(){
        System.out.println("Привет");
    }
}

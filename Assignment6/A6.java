public class A6 {
    public static void main(String[] args) {
        Person per1 = new Person("Tom",22);
        Person per2 = new Person("Dave",12);
        Person per3 = new Person("Bob",45);
        Person per4 = new Person("Joe",36);

        per1.printIntroduction();
        per2.printIntroduction();
        per3.printIntroduction();
        per4.printIntroduction();
    }
}


class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printIntroduction(){
        System.out.println("Hi, my name is " +
                name + " and I am " + age + " years old.");
    }
}
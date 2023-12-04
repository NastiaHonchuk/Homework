public class Student {

    /*  Task 1
        Создать класс Student c полями (переменными) имя и возраст.
        Создать несколько обьектов этого класса. Вывести их на печать
     */

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public static class Main1 {  // зачем мне идея предлагает, чтобы клас Main был 'static'? Какую это играет роль?
        public static void main(String[] args) {

            Student person1 = new Student("Jane", 20);
            Student person2 = new Student("George", 25);
            Student person3 = new Student("Mike", 18);
            Student person4 = new Student("Lisa", 21);

            System.out.println("Student's name: " + person1.name + ", age: " + person1.age);
            System.out.println("Student's name: " + person2.name + ", age: " + person2.age);
            System.out.println("Student's name: " + person3.name + ", age: " + person3.age);
            System.out.println("Student's name: " + person4.name + ", age: " + person4.age);
        }
    }
}

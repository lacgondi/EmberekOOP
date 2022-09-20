package hu.petrik.EmberekOOP;

public class Main {
    public static void main(String[] args) {
        Ember e1 = new Ember("Kiss Jóska", "2020.12.02", "Budapest");
        Ember e2 = new Ember("Kovács Balázs", "1990.03.02", "New York");
        Ember e3 = new Ember("Kiss László", "1989.04.04", "Paris");

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e3.birthYear());
        System.out.println(e3.birthMonth());
        System.out.println(e3.birthDay());
        System.out.println(e1.currentAge());
    }
}

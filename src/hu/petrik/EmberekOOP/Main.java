package hu.petrik.EmberekOOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
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

        Emberek obj = new Emberek(new Ember[]{e1,e2,e3});
        System.out.println(obj);

        File file = new File("emberek.txt");

        try {
            Emberek fromFile = new Emberek(file);
        }catch (FileNotFoundException e){
            System.out.printf("Hiba miatt nem található az %s fájl\n", file);
        }catch (IOException e){
            System.out.println("Ismeretlen hiba történt a fájl beolvasása során");
        }

    }
}

package hu.petrik.EmberekOOP;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;
import java.util.Locale;

public class Ember {
    private String name;
    private String birthDate;
    private String birthPlace;

    public Ember(String name, String birthDate, String birthPlace) {
        this.name = name;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
    }

    @Override
    public String toString() {
        return "Név: " + name +
                ", Születési dátum: " + birthDate +
                ", Születési hely: " + birthPlace;
    }

    public int birthYear() {
        int year = Integer.parseInt(birthDate.substring(0, 4));
        return year;
    }

    public int birthMonth() {
        int month = Integer.parseInt(birthDate.substring(5, 7));
        return month;
    }

    public int birthDay() {
        int day = Integer.parseInt(birthDate.substring(8, 10));
        return day;
    }

    public int currentAge() {
        int age;
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime birth = LocalDate.of(birthYear(), birthMonth(), birthDay()).atStartOfDay();
        Duration dur = Duration.between(now, birth);
        age =(int) Math.abs(dur.toDays()/365);
        return age;
    }
}

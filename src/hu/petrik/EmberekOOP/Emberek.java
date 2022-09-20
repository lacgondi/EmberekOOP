package hu.petrik.EmberekOOP;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Emberek {
    private List<Ember> emberekList= new ArrayList<>();

    public Emberek(Ember emberObj) {
        emberekList.add(emberObj);
    }

    public Emberek(Ember[] emberArr){
        for (int i = 0; i < emberArr.length; i++) {
            emberekList.add(emberArr[i]);
        }
    }

    public Emberek (File file) throws IOException {
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            String[] temp =sc.nextLine().split(";");
            Ember tempEmb = new Ember(temp[0],temp[1],temp[2]);
            emberekList.add(tempEmb);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < emberekList.size(); i++) {
            sb.append(emberekList.get(i).toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}

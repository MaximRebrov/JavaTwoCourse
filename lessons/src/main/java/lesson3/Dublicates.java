package lesson3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Dublicates {
    private int dubl;
    private String d;
    private String d1;

    Dublicates(List word, Set dublicates) {
        Iterator<String> iterator = word.iterator();
        for (int i = 0; i < word.size(); i++) {
            d = (String) word.get(i);
            dubl = 0;
            for (int j = i; j < word.size(); j++) {
                if (i == j) continue;
                d1 = (String) word.get(j);
                if (d.equals(d1)) {
                    dublicates.add(d1);
                    word.remove(j);
                    dubl++;
                    System.out.println("Слово " + d1 + " повторилось " + dubl + " раз!");
                }
            }
        }
        System.out.println(word);
//        System.out.println("Дубликаты: " + dublicates);
    }
}
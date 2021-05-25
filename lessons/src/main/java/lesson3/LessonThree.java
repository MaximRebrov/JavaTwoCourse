package lesson3;

import java.util.*;

public class LessonThree {
    public static void main(String[] args) {

        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        List<String> word = new ArrayList<String>();
        word.add("work");
        word.add("wolk");
        word.add("job");
        word.add("hand");
        word.add("job");
        word.add("table");
        word.add("cat");
        word.add("note");
        word.add("black");
        word.add("work");
        word.add("one");
        word.add("banana");
        word.add("job");
        word.add("green");
        word.add("joke");
        word.add("hand");

        Set<String> dublicates = new HashSet<String>();
        new Dublicates(word, dublicates);
        System.out.println("-------------------------------");

        PhoneDirectory phoneDirectory = new PhoneDirectory();

        map.put("Smith", new ArrayList<String>());
        map.get("Smith").add(" +15(500)4343433");
        map.put("Li", new ArrayList<String>());
        map.get("Li").add(" +14(815)9065566");
        map.get("Li").add(" +14(815)9065578");
        phoneDirectory.setMap(map);

        System.out.println(phoneDirectory.getMap().get("Li"));
        System.out.println(phoneDirectory.getMap().get("Smith"));

    }
}

package lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {
    private Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

    public Map<String, ArrayList<String>> getMap() {
        return test();
    }

    public void setMap(Map<String, ArrayList<String>> map) {
        this.map = map;
    }

    private Map<String, ArrayList<String>> test()  {

        map.put("Vasckes", new ArrayList<String>());
        map.get("Vasckes").add(" +14(385)1547896");
        map.put("Billigun", new ArrayList<String>());
        map.get("Billigun").add(" +14(824)3639718");
        map.put("Pakowsky", new ArrayList<String>());
        map.get("Pakowsky").add(" +14(815)8648519");
        map.put("Benks", new ArrayList<String>());
        map.get("Benks").add(" +14(314)9996633");
        map.get("Li").add(" +17(112)7751813");
        map.put("Popov", new ArrayList<String>());
        map.get("Popov").add(" +14(887)1002233");
        map.put("Rikht", new ArrayList<String>());
        map.get("Rikht").add(" +24(778)8001012");
        map.put("Kolesnichenko", new ArrayList<String>());
        map.get("Kolesnichenko").add(" +14(815)9065544");

        return map;
    }
}

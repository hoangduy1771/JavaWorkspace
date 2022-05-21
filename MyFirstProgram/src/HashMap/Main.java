package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> countries = new HashMap<>();
        countries.put("Vietnam", "Ha Noi");
        countries.put("Iceland", "Reykjavik");
        countries.put("Japan", "Tokyo");
        countries.put("Sweden", "Stockholm");

//        System.out.println(countries.get("Vietnam"));
//        countries.remove("Sweden");
//        System.out.println(countries);

//        countries.clear();
//        System.out.println(countries);

//        System.out.println(countries.size());

//        countries.replace("Vietnam", "Ho Chi Minh");
//        System.out.println(countries);

//        System.out.println(countries.containsKey("Vietnam"));
//        System.out.println(countries.containsValue("Reykjavik"));

//        return key
//        System.out.println(countries.keySet());
        System.out.println(countries.entrySet());

//        for (String i : countries.keySet()) {
//            System.out.println(i + " : " + countries.get(i) + ";\n");
//        }


    }
}






















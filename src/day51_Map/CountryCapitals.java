package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class CountryCapitals {

    public static void main(String[] args) {

        Map<String, String> countryCapital = new HashMap<>();

        countryCapital.put("Turkey","Ankara");
        countryCapital.put("France","Paris");
        countryCapital.put("Italy","Roma");
        countryCapital.put("Germany","Berlin");
        countryCapital.put("UK","London");


        for (Map.Entry<String, String> entry : countryCapital.entrySet()){

            System.out.println(entry.getValue());

        }



    }

}

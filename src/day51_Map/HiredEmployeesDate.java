package day51_Map;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class HiredEmployeesDate {

    public static void main(String[] args) {

        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2018, 9, 5));
        map.put("Antony", LocalDate.of(2012, 7, 29));
        map.put("Jimmy", LocalDate.of(2014, 4, 1));
        map.put("James", LocalDate.of(2016, 11, 2));
        map.put("Josh", LocalDate.of(2020, 5, 15));
        map.put("Cory", LocalDate.of(2015, 6, 19));
        map.put("Anderson", LocalDate.of(2013, 8, 24));
        map.put("Steven", LocalDate.of(2017, 10, 2));


        ArrayList<String> before2015 = new ArrayList<>();
        ArrayList<String> date05152020 = new ArrayList<>();
        ArrayList<String> after2014 = new ArrayList<>();

        for (Map.Entry<String, LocalDate> entry : map.entrySet()){

            if (entry.getValue().isBefore(LocalDate.of(2015, 1, 1))){

                before2015.add(entry.getKey());

            }

            if (entry.getValue().isAfter(LocalDate.of(2014, 1, 1))){

                after2014.add(entry.getKey());

            }

            if (entry.getValue().isEqual(LocalDate.of(2020,5,15))){

                date05152020.add(entry.getKey());

            }

        }


        System.out.println("before2015 = " + before2015);
        System.out.println("after2014 = " + after2014);
        System.out.println("date05152020 = " + date05152020);

    }

}

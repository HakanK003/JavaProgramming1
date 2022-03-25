package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class ScoreMapStudents {

    public static void main(String[] args) {

        Map<String , Integer> studentsScores = new HashMap<>();
        studentsScores.put("AAA", 85);
        studentsScores.put("BBB", 80);
        studentsScores.put("CCC", 75);
        studentsScores.put("DDD", 90);
        studentsScores.put("EEE", 70);


        for (Map.Entry<String, Integer> entry : studentsScores.entrySet()){

            if (entry.getValue()<80){
                System.out.println(entry.getKey());
            }

        }

    }

}

/*
 create a map that can contain student name and student' score
            put 5 of your friends names and their scores
            print out the names of the students who made less than 80
 */
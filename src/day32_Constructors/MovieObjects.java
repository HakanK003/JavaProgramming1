package day32_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {

    public static void main(String[] args) {

        Movie movie1 = new Movie("Journey to SDET", "USA", "Adventure, Comedy, Thriller", "10/25/2021", "Kuzzat A", new ArrayList<>(Arrays.asList("Muhtar", "Asiya", "Adam", "Hakan")));
        System.out.println(movie1);

    }
}

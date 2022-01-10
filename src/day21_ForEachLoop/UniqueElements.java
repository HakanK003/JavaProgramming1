package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cihad", "Cydeo"};

        for (String each : words) {

            int count = 0;

            for (String elements : words) {

                if (elements.equals(each)){count++;}

            }
            if (count==1){
                System.out.println(each);
            }
        }

    }
}

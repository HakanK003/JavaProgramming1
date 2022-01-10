package day22_MultiDimensionalArrays;

public class ShoppingListMultiD {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        String result="";

        for (String[] each1D : items) {
            for (String each : each1D) {
                result+=each+"\t";
            }
            result+="\n";
        }

        System.out.println(result);

        System.out.println("-----------------------------------------------------");

        String result2 ="";

        for (String[] each1D : items) {
            for (int i =each1D.length-1; i>=0;i--){
                result2+=each1D[i]+"\t";
            }
            result2+="\n";
        }

        System.out.println(result2);

        System.out.println("------------------------------------------------------");

        String result3 ="";

        for (int i = items.length-1; i >=0 ; i--) {
            for (int j =0; j <items[i].length; j++) {
                result3+=items[i][j]+"\t";
            }
            result3+="\n";
        }
        System.out.println(result3);

    }
}

/*
 Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */
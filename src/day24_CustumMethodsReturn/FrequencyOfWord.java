package day24_CustumMethodsReturn;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = " Hello ,java JAva python wooden spoon,javaJAVA";

        System.out.println("Frequency of \"java\" = "+frequencyOfWord(str,"java"));



    }

    public static int frequencyOfWord(String sentence, String word){

        int count =0;
        for (int i = 0; i <sentence.length()-(word.length()-1); i++) {
            if (sentence.substring(i,i+word.length()).equalsIgnoreCase(word)){count++;}
        }
        return count;
    }
}

/*
create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */
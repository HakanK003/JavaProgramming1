package day21_ForEachLoop;


public class JavaPythonFrequency {

    public static void main(String[] args) {

        String[] sentences = {"java javascript python c# c++ rust ruby python swift",
                              "java is a multi-platform language",
                              "What's the difference between java javascript and python ?",
                              "python is an interpreted, high-level, general-purpose programming language."};

        int countTotalJava=0;
        int countTotalPython=0;

        int count=1;

        for (String eachSentence : sentences) {

            String[] words  =eachSentence.split(" ");

            int eachSentenceJava=0;
            int eachSentencePython=0;

            for (String eachWord : words) {

                if (eachWord.equalsIgnoreCase("java")){countTotalJava++;  eachSentenceJava++;}
                if (eachWord.equalsIgnoreCase("python")){countTotalPython++; eachSentencePython++;}

            }

            System.out.println(count + ". sentence contains " + eachSentenceJava + " java and " + eachSentencePython + " python");

            count++;

        }

        System.out.println("\nTotal number of java = "+ countTotalJava + "\nTotal number of python = "+ countTotalPython);



    }
}

/*
 Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
 */
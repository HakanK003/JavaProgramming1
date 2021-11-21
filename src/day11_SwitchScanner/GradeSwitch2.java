package day11_SwitchScanner;

public class GradeSwitch2 {

    public static void main(String[] args) {

        char grade = 'A';
        String result;

        switch (grade){

            case 'A':       //or logic in switch
            case 'B':
            case 'C':
            case 'D':
            // case 'A': case 'B': case 'C': case 'D':  one line version
                result="Passed";
                break;
            case 'F':
                result="Failed";
                break;
            default:
                result="Invalid";

        }

        System.out.println(result);



    }
}

/*
if the grade is A or B or C or D ===> Passed
otherwise ===> Failed
 */
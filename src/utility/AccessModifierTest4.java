package utility;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifierTest4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        //System.out.println(ProtectedAccessModifier.name1);  //default isn't visible
        System.out.println(ProtectedAccessModifier.name2);  //protected is visible if it's inherited
        System.out.println(name2);
        System.out.println(AccessModifierTest4.name2);
    }

}

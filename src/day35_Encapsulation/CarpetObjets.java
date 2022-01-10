package day35_Encapsulation;

public class CarpetObjets {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(10,10,20,true);
        Carpet carpet2 = new Carpet(-10,10,20,true);
        Carpet carpet3 = new Carpet(10,10,20,false);

        System.out.println(carpet1);
        System.out.println(carpet2);
        System.out.println(carpet3);

    }

}

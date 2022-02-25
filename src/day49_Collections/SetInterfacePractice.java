package day49_Collections;


import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        //Set<Integer> set1 = new ArrayList<Integer>(); error they don't have an Is A relationship

        List<Integer> list = new ArrayList<>();

        list.addAll( Arrays.asList(10, 200, 300, 40, 90) );


        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(null, null, null));

        System.out.println(" arraylist = " + list);

        System.out.println(list.get(4));


        Set<Integer> hashSet = new HashSet<>();
        //fastest
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("hashSet = " + hashSet);
        //System.out.println(hashSet.get(4)); // there are no index numbers
        

        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("linkedHashSet = " + linkedHashSet);
        
        Set<Integer> treeSet = new TreeSet<>();
        //slowest

        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //treeSet.addAll(Arrays.asList(null, null, null));

        System.out.println("treeSet = " + treeSet);

        // String str = null;
        // System.out.println(str.charAt(0));

    }

}

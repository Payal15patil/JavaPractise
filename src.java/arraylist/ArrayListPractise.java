package arraylist;

import java.util.ArrayList;

public class ArrayListPractise {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Payal");
        list.add("Pinkal");
        list.add("Vatsal");
        list.add("Jay");
        list.add("Yogesh");
        System.out.println(list);
        list.remove("Jay");
        System.out.println(list);
        System.out.println(list.get(2));

        for(String name:list){
            System.out.println(name);
        }

    }
}

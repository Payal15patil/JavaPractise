package arraylist;

public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<String> set = new java.util.HashSet<String>();
        set.add("payal");
        set.add("sidhdhi");
        set.add("om");
        set.add("mayuri");
        set.add("urmil");
        set.add("om");
        System.out.println(set);
        System.out.println(set.remove("mayuri"));
        System.out.println(set.size());
        System.out.println(set.contains("sidhdhi"));
        System.out.println(set.contains("yogesh"));


    }
}

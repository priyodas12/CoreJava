package basic;

public class TreeMap {
    public static void main(String[] args) {
        java.util.TreeMap<String,Integer> tm=new java.util.TreeMap<>();

        tm.ceilingEntry("abcd");
        tm.ceilingKey("232");
        tm.floorEntry("wewew");
        tm.floorKey("skk");

        tm.put("lleie",88372);
        tm.put("dfie",63072);
        tm.put("owye",20072);
        tm.put("ogjie",45372);


        tm.entrySet().stream().forEach(System.out::println);
    }
}

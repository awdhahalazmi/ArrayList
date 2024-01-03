import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        List<String> favpalylist = new ArrayList<>();

        favpalylist.add("heather");
        favpalylist.add("stay");
        favpalylist.add("back to me");
        favpalylist.add("shokran abdulmajed");
        favpalylist.add("ala elthekra majed almohandes");
        favpalylist.add("ehki bhamsak abdulmajed");
        favpalylist.remove(2);
        for (int i = 0; i < favpalylist.size(); i++) {
            System.out.println(favpalylist.get(i));
        }

    }

}
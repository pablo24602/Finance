import java.util.ArrayList;
import java.util.*;


public class isEqual {

    public static boolean unique(String jo) {
        ArrayList<Character> j = new ArrayList<Character>();
        for (char oo : jo.toCharArray()) {
            if (j.contains(oo)) {
                return false;
            }
            j.add(oo);
        }
        return true;
    }

    public static void main(String[] args) {
        boolean going = true;
        int a = 0;
        while (going) {
            Scanner so = new Scanner(System.in);
            System.out.print("Which String? ");
            if (unique(so.next())) {
                System.out.println("Unique!");
            } else {
                System.out.println("Not Unique!");
            }
            if (a > 100) {
                going = false;
            }
            a++;
        }
    }
}

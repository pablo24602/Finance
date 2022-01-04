import java.util.ArrayList;
import java.util.*;

public class checkPerm {
    public boolean checkPerm(String jo, String s)
    {
        ArrayList<Character> first = new ArrayList<Character>();
        ArrayList<Character> second = new ArrayList<Character>();
        for (char d: jo.toCharArray())
        {
            first.add(d);
        }
        for (char a: s.toCharArray())
        {
            second.add(a);
        }
        Collections.sort(first);
        Collections.sort(second);
        if (first.size()!=second.size())
        {
            return false;
        }
        for (int a = 0; a<first.size(); a++)
        {
            if (first.get(a)!=second.get(a))
            {
                return false;
            }
        }
        return true;

    }
}

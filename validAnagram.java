import java.util.HashMap;
import java.util.Map;

public class validAnagram {
    public boolean isAnagram(String s, String t) 
    {
        
        Map <Character, Integer> storeS = new HashMap<>();
        for(char ch: s.toCharArray())
        {
            storeS.put(ch, storeS.getOrDefault(ch, 0) + 1);
        }
        for(char x: t.toCharArray())
        {
            storeS.put( x, storeS.getOrDefault(x, 0) - 1);
        }
        for(int val : storeS.values())
        {
            if(val != 0)
            {
                return false;
            }
        }
        return true;
    }
}

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public boolean containsDuplicatee(int[] nums) 
    {
        Set<Integer> uniqueS = new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            if(uniqueS.contains(nums[i]))
                return true;
            uniqueS.add(nums[i]);
        }
        return false;
    }
}

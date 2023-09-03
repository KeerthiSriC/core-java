import java.util.Set;
import java.util.HashSet;

public class SetDemo 
{
    public static void main(String[] args) 
    {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(3);
        set1.add(8);
        set1.add(9);
        set1.add(8);
        set1.add(7);
        set1.add(1);

        System.out.println(set1);
        
    }
    
}

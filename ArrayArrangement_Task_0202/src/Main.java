
import java.util.Arrays;

public class Main 
{
    public static void main(String[] args)
    {
        String[] Animals  = {"dog", "pigeon", "cat", "caterpillar", "mouse"};
        System.out.println(Arrays.toString(Animals));

        for (int i = 0; i < Animals.length; i++) 
        {
            for (int j = i + 1; j < Animals.length; j++) 
            {
                if (Animals[i].length() < Animals[j].length()) 
                {
                    String x = Animals[i];
                    Animals[i] = Animals[j];
                    Animals[j] = x;
                }
            }
        }

        System.out.println(Arrays.toString(Animals));
    }
}

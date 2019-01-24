
public class BaseTwoFormatter 
{
    public String format (int num)
    {
            String reverse = "";
            if (num == 0)
                    return "" + num;
            
            while (num > 0)
            {
                 reverse += num%2;
                 num = num/2;
            }
           
            String binary = "";
            for (int i = reverse.length()-1; i>= 0; i--)
                    binary+=reverse.charAt(i);
            return binary;

    }
}

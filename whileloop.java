//This program shows different while loop examples in java - 

public class whileloop {
    public static void main(String args[])
    {
        //Example 1 - 
        int i = 1;
        while(i<=5)
        {
            System.out.println("HELLO WORLD!");
            i++;
        }

        //Example 2 -
        int x = 1,sum = 0;
        while(x<=10)
        {
            sum = sum + x;
            x++;
        }
        System.out.println("Sum = "+sum);

        //Example 3 -
        int a = 3;
        while(a>=0)
        {
            System.out.print(a+" ");
            a--;
        }

        //Example 4 -
        int n = 1;
        int multiplier = 10;
        while(multiplier>0)
        {
            System.out.print(multiplier * n+ " ");
            multiplier--;
        }
    }
}
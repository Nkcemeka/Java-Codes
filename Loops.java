//On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.

public class Loops
{
    public static void main(String[] args) 
    {
        // Counter for first loop
        int count1 = 0;
        int diff = 0; // to check loop
        for (int i=1; i<=10; i++)
        {
            diff = 10-i;
            //infinite loop checker
            if (diff>9)
            {
                System.out.println("Loop 1 is infinite");
                break;
            }
            count1++;
        }
        if (diff>9){
            System.out.println("Loop 1 is infinite");
        }else{
            System.out.println("Loop 1 executes " + count1 + " times");
        }

        // Counter for second loop
        int count2 = 0;
        int diff2 = 0;
        for (int i=1; i<10; i++)
        {
            diff2 = 9-i;
            //infinite loop checker
            if (diff2>8)
            {
                System.out.println("Loop 2 is infinite");
                break;
            }
            count2++;
    
        }
        if (diff2>8){
            System.out.println("Loop 2 is infinite");
        }else{
            System.out.println("Loop 2 executes " + count2 + " times");
        }

        // Counter for third loop
        int count3 = 0;
        int diff3 = 0;
        for (int i=10; i>0; i--)
        {
            diff3 = 10-i;
            //infinite loop checker
            if (diff3>10)
            {
                System.out.println("Loop 3 is infinite");
                break;
            }
            count3++;
        }
        if (diff3>10){
            System.out.println("Loop 3 is infinite");
        }else{
            System.out.println("Loop 3 executes " + count3 + " times");
        }

        // Counter for fourth loop
        int count4 = 0;
        int diff4 = 0;
        for (int i=-10; i<=10; i++)
        {
            diff4 = 10 - i;
            //infinite loop checker
            if (diff4>20)
            {
                System.out.println("Loop 4 is infinite");
                break;
            }
            count4++;
        }
        if (diff4>20){
            System.out.println("Loop 4 is infinite");
        }else{
            System.out.println("Loop 4 executes " + count4 + " times");
        }

        // Counter for fifth loop
        int count5 = 0;
        int diff5=0;
        for (int i=10; i>=0; i++)
        {
            diff5 = i - 0;
            //infinite loop checker
            if (diff5 > 10)
            {
                break;
            }
            count5++;
        }

        if (diff5 > 10){
            System.out.println("Loop 5 is infinite");
        }else{
            System.out.println("Loop 5 executes " + count5 + " times");
        }
        

        // Counter for sixth loop
        int count6 = 0;
        int diff6=0;
        for (int i=-10; i<=10; i=i+2)
        {
            diff6 = 10 - i;
            //infinite loop checker
            if (diff6>20)
            {
                break;
            }
            count6++;
        }
        
        if (diff6 > 20){
            System.out.println("Loop 6 is infinite");
        }else{
            System.out.println("Loop 6 executes " + count6 + " times");
        }

        // Counter for seventh loop
        int count7 = 0;
        int diff7 = 0;
        for (int i=-10; i<=10; i=i+3)
        {
            diff7 = 10-i;
            //infinite loop checker
            if (diff7>20)
            {
                break;
            }
            count7++;
        }
        if (diff7>20){
            System.out.println("Loop 7 is infinite");
        }else{
            System.out.println("Loop 7 executes " + count7 + " times");
        }
    }
}

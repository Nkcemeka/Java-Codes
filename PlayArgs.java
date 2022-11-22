//On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.


public class PlayArgs {
    public static void main(String args[]) 
    {
        int i;
        System.out.println("PlayArgs got passed in " + args.length + " command-line arguments.");
        System.out.println();

        // Loop through the args and print each one
        // Question: why does it print i+1?? It prints i+1 because the index i starts from 0; hence, the 
        // first argument has to be one higher than the value of i

        for (i=0; i<args.length; i++)
        {
            System.out.println("Arg " + (i + 1) + " is: " + args[i]);
        }
    }
}

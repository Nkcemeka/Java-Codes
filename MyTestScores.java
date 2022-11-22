//On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.


public class MyTestScores {
    public static void main(String args[]) 
    {
        TestScore tests[] = new TestScore[5]; // declare and allocate the slots in the array
        int used = 0;
        int i = 0;
        String scoreLabel;

        tests[0] = new TestScore(19, 20);
        tests[1] = new TestScore(20, 20);
        tests[2] = new TestScore(23, 25);

        used = 3;

        System.out.println("The size of our array is " + tests.length +
            ". We are using " + used + " elements.");


        for (i = 0; i < used; i++)
        {
            scoreLabel = "Score " + (i + 1);
            System.out.println(scoreLabel + " is " + tests[i]);
            System.out.println("    Letter grade: " + tests[i].getLetterGrade());
        }
    }
}

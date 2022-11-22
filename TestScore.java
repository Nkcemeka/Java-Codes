//On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.


public class TestScore
{
    private double points;
    private double maxPoints;

    public TestScore()
    {
        points = 0;
        maxPoints = 20;
    }
    public TestScore(double score, double maxScore)
    {
        points = score;
        maxPoints = maxScore;
    }

    public double getPercentage() { return((double) points/maxPoints); }

    public String getLetterGrade()
    {
        double percent = getPercentage() * 100;

        if (percent >= 90)
            return "A";
        if (percent >= 80)
            return "B";
        if (percent >= 70)
            return "C";
        if (percent >= 60)
            return "D";
        return "F";
    }

    public void setPoints(int score, int maxScore)
    {
        points = score;
        maxPoints = maxScore;
    }

    public void setPoints(int score) { points = score; }
    public void setMaxPoints(int maxScore) { maxPoints = maxScore; }

    public double getPoints(){
        return points;
    }

    public double getMaxPoints(){
        return maxPoints;
    }
    public String toString()
    {
        return("Score: " + points + " out of " + maxPoints);
    }
}

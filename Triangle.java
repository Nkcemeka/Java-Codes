import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.

public class Triangle 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");

        int input = Integer.parseInt(reader.readLine());

        while (input < 0){
            System.out.println("Error! Input a number above or equal to zero.");
            System.out.print("Enter a number: ");
            input = Integer.parseInt(reader.readLine());
        }

        printTriangle(input);
    }

    public static void printStarLine(int noOfStars)
    {
        String star = ""; // initializing an empty star
        for (int i=1; i <= noOfStars; i++){
            star = "*"+star;
        }
        System.out.println(star);
    }

    public static void printTriangle(int height)
    {
        // NOTE: parameter height reflects the height of the triangle
        for (int i=1; i<=height; i++){
            printStarLine(i);
        }

        // print the reverse side of the triangle
        for (int i=height-1; i>0; i--){
            printStarLine(i);
        }
    }
}

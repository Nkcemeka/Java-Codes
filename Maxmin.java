import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.ls



public class Maxmin {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the first integer: ");
        int first = Integer.parseInt(reader.readLine());

        System.out.print("Enter the second integer: ");
        int second = Integer.parseInt(reader.readLine());

        System.out.print("Enter the third integer: ");
        int third = Integer.parseInt(reader.readLine());

        System.out.print("Enter the fourth integer: ");
        int fourth = Integer.parseInt(reader.readLine());

        System.out.print("Enter the fifth integer: ");
        int fifth = Integer.parseInt(reader.readLine());

        int smallest = first;

        if (second < smallest){
            smallest = second;
        }

        if (third < smallest){
            smallest = third;
        }

        if (fourth < smallest){
            smallest = fourth;
        }

        if (fifth < smallest){
            smallest = fifth;
        }


        int largest = first;

        if (second > largest){
            largest = second;
        }

        if (third >  largest){
            largest = third;
        }

        if (fourth > largest){
            largest = fourth;
        }

        if (fifth > largest){
            largest = fifth;
        }

        System.out.println("The largest integer is: "+ largest);
        System.out.println("The smallest integer is: "+ smallest);
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.

public class FtoCent {
    
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the Fahrenheit temperature: ");

        double fahrenheit = Double.parseDouble(reader.readLine());

        double celsius = 5*(fahrenheit-32)/9;

        System.out.printf("The celsius value for %f°F is: %f°C \n", fahrenheit, celsius );
    }
}

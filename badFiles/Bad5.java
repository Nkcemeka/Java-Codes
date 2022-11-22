import java.io.*;

//On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.

public class Bad5
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        String firstName = null;
        String lastName = "";

        if (firstName == null)
        {
            System.out.println("firstName is null");
        }

        System.out.print("Enter your first name: ");
        firstName = keyboard.readLine();

        System.out.print("Enter your last name: ");
        lastName = keyboard.readLine();

        if (firstName.equals(lastName))
        {
            System.out.println("Your first name matches your last name; how unusual!");
        }

        if (firstName == " ")
        {
            System.out.println("Name not entered");
        }

        if (firstName.equalsIgnoreCase("cathy"))
        {
            System.out.println("You entered Cathy!");
        }

        if ("Bishop".equalsIgnoreCase(lastName))
        {
            System.out.println("My last name is Bishop too!");
        }
    }
}

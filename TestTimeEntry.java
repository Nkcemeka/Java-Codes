public class TestTimeEntry {
    public static void main(String[] args) {

        // Testing TimeEntry object using default constructor
        TimeEntry timeEntry = new TimeEntry();
        System.out.println(timeEntry);

        // Testing TimeEntry object using constructor with arguments
        System.out.println("");
        double numHours = 20.0;
        String Notes = "I worked 20 hours at the trade fair";
        TimeEntry timeEntry2 = new TimeEntry(numHours, Notes);
        System.out.println(timeEntry2);

        // Testing of setter for hours worked
        System.out.println("");
        timeEntry.setHoursWorked(48.0);
        System.out.println(timeEntry);

        // Testing of setter for comments
        System.out.println("");
        timeEntry.setComments("Factory overtime");
        System.out.println(timeEntry);

        // Testing of getter for hours worked
        System.out.println("");
        double wrkHours = timeEntry.getHoursWorked();
        System.out.println(wrkHours);

        // Testing of getter for comments
        System.out.println("");
        String workComments = timeEntry.getComments();
        System.out.println(workComments);
    }
}

import java.util.Date;

public class TimeEntry {
    private Date timestamp;
    private double hoursWorked;
    private String comments;

    // Create Default Constructor
    public TimeEntry(){
        timestamp = new Date();
        hoursWorked = 0.0;
        comments = "Initial Time entry";
    }

    // Create another constructor with two arguments
    public TimeEntry(double numHours, String Notes){
        timestamp = new Date();
        hoursWorked = numHours;
        comments = Notes;
    }

    
    // Setter for timestamp
    public void setTimestamp(Date timeStmp){
        timestamp = timeStmp;
    }

    // Getter for timestamp
    public Date getTimestamp(){
        return timestamp;
    }

    // Setter for hoursWorked
    public void setHoursWorked(double hrsWorked){
        hoursWorked = hrsWorked;
    }

    // Getter for hoursWorked
    public double getHoursWorked(){
        return hoursWorked;
    }

    // Setter for comments
    public void setComments(String comment){
        comments = comment;
    }

    // Getter for comments
    public String getComments(){
        return comments;
    }

    // toString() method for printing objects
    public String toString(){
        return "Timestamp: " + timestamp + "\n" + "Hours Worked: " + 
        hoursWorked + "\n" + "Comments: " + comments;
    }
}

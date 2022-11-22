public class Time {
    
    public static void main(String[] args) {
        // file: Time.java
        int hour = 19;
        int minute = 47;
        int second = 56;

        double sec_mid = (hour*3600) + (minute*60) + second;
        double sec_remain = (24*3600) - sec_mid;

        double per_pass = 100 - ((sec_remain/sec_mid) * 100);
        System.out.println("The percentage of the day passed is " + per_pass + "%");
    }
}

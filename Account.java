public class Account {
    
    
    private String name; // instance variable
    private double balance; // instance variable

    // Account constructor that receives two paramters
    public Account(String name, double balance){
        this.name = name;

        if (balance>0.0){
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }

    public double getBalance(){
        return balance;
    }

    // method to set the name in the object
    public void setName(String name){
        this.name = name; // store the name
    }

    // method to retrieve the name from the object
    public String getName(){
        return name; // return value of name to caller
    }
}

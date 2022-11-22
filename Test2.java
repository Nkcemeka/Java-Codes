public class Test2 {
    
    public static void main(String[] args) {

        // Length of a string
        String fruit = "banana";
        System.out.println(fruit.length());

        // Substring of a string first two letters
        System.out.println(fruit.substring(0,2));

        // Substring of the last two letters
        int length = fruit.length();
        int startIndex = length-2;
        System.out.println(fruit.substring(startIndex)); // Computes the substring of the last two letters

        // indexOf method gets the index of a character
        int index = fruit.indexOf('n');
        System.out.println(index);

        // Replace a character with another
        String replaced = fruit.replace("a","Q");
        System.out.println(replaced);

        // lowercase
        System.out.println(fruit.toLowerCase());

        //uppercase
        System.out.println(fruit.toUpperCase());

        //concat method
        System.out.println(fruit.concat("Yeah man"));

        // Trimming
        String rubbish = " wxyZ";
        System.out.println(rubbish);
        System.out.println(rubbish.trim());

    }
}

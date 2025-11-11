// Program to demonstrate identifiers
package introductiontojavaday1;

public class identifier {

    public static void main(String[] args) {
        
        // Invalid Identifier Examples (commented out because they cause errors)
        // int for = 13; // error: 'for' is a keyword
        // int number 2 = 13; // error: spaces not allowed in identifier
        // int @number3 = 10; // error: cannot start with @
        
        // Valid Identifier Examples
        int $number = 20; // starts with $
        System.out.println("Value of $number: " + $number);
        
        String studentName = "Aniket"; // camelCase is recommended
        System.out.println("Value of studentName: " + studentName);
        
        int number_1 = 13; // underscore is allowed
        System.out.println("Value of number_1: " + number_1);
        
        int Number2 = 50; // uppercase letter allowed
        System.out.println("Value of Number2: " + Number2);
    }
}

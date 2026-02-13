import java.util.Scanner;

// TODO: Create class InvalidAgeException extends Exception
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){ // Create a constructor that accepts a message string and passes it to super(message)
        super(message);
    }
}

public class CustomException {
    
    // TODO: Create a static method validate(int age) that throws InvalidAgeException
    public static void validate(int age) throws InvalidAgeException {
        if (age<18){ 
            throw new InvalidAgeException("Not eligible to vote"); // Check if age < 18, throw new InvalidAgeException("Not eligible to vote")
        }
        else{
            System.out.println("Eligible to vote"); // Else print "Eligible to vote"
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        
        int age=sc.nextInt(); // TODO: Read age

        try{
            validate(age);
        }
        catch(InvalidAgeException e){
            System.out.println("Exception: "+ e.getMessage());
        }

        sc.close();

    }
        
        
}

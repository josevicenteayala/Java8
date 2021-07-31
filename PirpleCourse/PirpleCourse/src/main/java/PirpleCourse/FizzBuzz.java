/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PirpleCourse;

/**
 *
 * @author vin001
 */
public class FizzBuzz {
    
    public static void main(String[] args) {
        fizzBuzz();
    }

    public static void fizzBuzz() {
        for(int counter = 1; counter<=100; counter++) {
            boolean isMultipleOfThree = isMultipleOf(counter,3);
            boolean isMultipleOfFive = isMultipleOf(counter,5);
            boolean isPrime = isPrime(counter);
            if(isPrime){
                System.out.println(PRIME);
            } else if(isMultipleOfThree && isMultipleOfFive){
                System.out.println(FIZZ_BUZZ);
            } else if(isMultipleOfThree && !isMultipleOfFive){
                System.out.println(FIZZ);
            } else if(!isMultipleOfThree && isMultipleOfFive){
                System.out.println(BUZZ);
            } else {
                System.out.println(counter);
            }
            
        }
    }
    private static final String PRIME = "Prime";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ = "Fizz";
    private static final String FIZZ_BUZZ = "FizzBuzz";
    
    public static boolean isMultipleOf(int number, int multiple){
        final boolean isMultipleOf = number % multiple == 0;
        return isMultipleOf;
    }
    
    public static boolean isPrime(int number){
        if(number == 1){
            return false;
        }
        int counter = 1;
        boolean continueSearching = true;
        boolean isPrime = true;
        while(continueSearching && ++counter < number){
           if(isMultipleOf(number,counter)) {
               continueSearching = false;
               isPrime = false;
           }
        }
        return isPrime;
    }
}

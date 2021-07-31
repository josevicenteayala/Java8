
package pirple;

        
import PirpleCourse.FizzBuzz;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author vin001
 */
public class FizzBuzzTest {
    
    @Test
    public void isPrimeFrom1To100(){
        assertFalse(FizzBuzz.isPrime(1));
        assertTrue(FizzBuzz.isPrime(2));
        
        for(int counter = 1; counter<=100;counter++){
           switch(counter){
               case 1: assertFalse(FizzBuzz.isPrime(counter)); break;
               case 2: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 3: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 5: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 7: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 11: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 13: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 17: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 19: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 23: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 29: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 31: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 37: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 41: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 43: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 47: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 51: assertFalse(FizzBuzz.isPrime(counter)); break;
               case 53: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 57: assertFalse(FizzBuzz.isPrime(counter)); break;
               case 59: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 61: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 67: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 71: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 73: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 79: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 83: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 89: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 97: assertTrue(FizzBuzz.isPrime(counter)); break;
               case 98: assertFalse(FizzBuzz.isPrime(counter)); break;
               case 100: assertFalse(FizzBuzz.isPrime(counter)); break;
               
           } 
        }
    }
    
    @Test
    public void isPrime1(){
        assertFalse(FizzBuzz.isPrime(1));
    }
    
    @Test
    public void isPrime2(){
        assertTrue(FizzBuzz.isPrime(2));
    }   
    
    @Test
    public void isPrime3(){
        assertTrue(FizzBuzz.isPrime(3));
    }
    @Test
    public void isPrime51(){
        assertFalse(FizzBuzz.isPrime(51));
    }
            
    
}

/**
 *
 * 5. Programs on Logical AND,OR operator and Logical NOT
 */

 package saeed.operators;
 
public class Assign_Logical {
    public static void main(String[] args) {
        int a = 150;
        int b = 100;
        int c = 50;
        int second =0 ;
        // Logical AND (&&)
        /* The logical && operator doesn't check the second condition if the
        first condition is false. It checks the second condition only if the first one is true. */
        System.out.println((a > b && (second = a) > c )+ " second=" + second); // true  && true  = true
        second =0 ;
        System.out.println((a < b && (second = a) < c )+ " second=" + second); // false && false = false
        second =0 ;
        System.out.println((a > b && (second = a) < c )+ " second=" + second); // true  && false = false

        //Logical OR (||)
        /* The logical || operator doesn't check the second condition if the
        first condition is true.It checks the second condition only if the first one is false. */
        second =0 ;
        System.out.println((a > b || (second = a) > c )+ " second=" + second); // true  || true  = true
        second =0 ;
        System.out.println((a < b || (second = a) < c )+ " second=" + second); // false || false = false
        second =0 ;
        System.out.println((a < b || (second = a) > c )+ " second=" + second); // false || true  = true

        //Logical NOT [!()]
        System.out.println(!(a > b));      // NOT true = false
        System.out.println(!(a < b));      // NOT false = true
    }
}
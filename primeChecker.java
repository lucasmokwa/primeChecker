import java.util.*;

public class primeChecker {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        //number of numbers to query
        int n = in.nextInt();
        
        for(int i = 0;i<n;i++){
            //read the input n times
            int num = in.nextInt();
            
            //print if its prime or not
            if(isPrime(num)==true) System.out.println("Prime");
            else System.out.println("Not prime");
        }
        in.close();
    }
    
    public static boolean isPrime(int n){
        //default answer
        boolean ans = false;
        
        //for the odd numbers we should see if we find a divisor
        if(!divisors(n)) return true;
            
        return ans;
    }
    
    public static boolean divisors(int n){
        //return if an number is a Prime
        
        //1 is not a prime
        if(n==1) return true;

        //2 is a prime

        if(n==2) return false;

        //return true if the number is even
        if(n%2==0) return true;

        // if we find a divisor
        //then it is not a prime and we return true
        for(int i =3;i<=n/3;i+=2){
            if(n%i==0) return true;
        }
        
        //if we didn't find any return false
        return false;
    }
    
}
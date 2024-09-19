package assignment4.binarySearch;


public class Program7 {

    
    private static double squareRoot(int number, double precision) {
        
        if (number == 0 || number == 1) {
            return number;
        }

        double l = 0, r = number;
        double mid = 0;

        double result = 0;

        while (l <= r) {
            mid = (l + r) / 2;
            
            
            if (mid * mid == number) {
                return mid;
            }

            
            if (mid * mid < number) {
                l = mid + 1;
                result = mid;  
            } else {
                
                r = mid - 1;
            }
        }

        
        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (result * result <= number) {
                result += increment;
            }

            
            result -= increment;

            
            increment /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 10;
        double precision = 3; 
        double sqrtResult = squareRoot(number, precision);
        System.out.println("Square root of " + number + " up to " + (int)precision + " decimal places is: " + sqrtResult);
    }
}

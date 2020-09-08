import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int qw = Math.max(a, b);
        int we = Math.max(a, c);
        int er = Math.max(b, c);
        int rt = Math.min(qw, we);
        int ty = Math.min(we, er);
        int median1 = Math.min(rt, ty);
        return median1;  
    }
    

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int a1 = Math.abs(a);
        int b1 = Math.abs(b);
        int magnitude1 = Math.max(a1, b1);
        if (a < 0)
            if (a1 > b1)
                magnitude1 = magnitude1 *-1;
            
        
        else if (b < 0)
            if (b1 > a1)
                magnitude1 = magnitude1 *-1;
            
        
        else 
            magnitude1 = magnitude1;
                return magnitude1;
    }


    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        int bnm = 2;
        double yu = Math.pow(a, bnm);
        double ui = Math.pow(b, bnm);
        double jkl = (yu + ui);
        double pythagoras1 = Math.sqrt(jkl);
        return pythagoras1; 

    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("What math command would you like to carry out?");
        String dsa = scan.next();
        String runmedian = "median";
        String runmagnitude = "magnitude";
        String runpythagoras = "pythagoras";
        boolean runmedian1 = (runmedian).equals(dsa);
        if (runmedian1 == true)
            System.out.println("What is integer a?");
            int intame = scan.nextInt();
            System.out.println("What is integer b?");
            int intbme = scan.nextInt();
            System.out.println("What is integer c?");
            int intcme = scan.nextInt();
            int runmedian2 = median(intame, intbme, intcme);
        
        
        boolean runmagnitude1 = (runmagnitude).equals(dsa);
        if (runmagnitude1 == true)
            System.out.println("What is integer a?");
            int intama = scan.nextInt();
            System.out.println("What is integer b?");
            int intbma = scan.nextInt();
            int runmagnitude2 = magnitude(intama, intbma);
        
        boolean runpythagoras1 = (runpythagoras).equals(dsa);
        if (runpythagoras1 == true)
            System.out.println("What is integer a?");
            int intap = scan.nextInt();
            System.out.println("What is integer b?");
            int intbp = scan.nextInt();
            double runpythagoras2 = pythagoras(intap, intbp);
        

        
    
    
    }
} 

      

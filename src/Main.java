import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long a = 0, b = 0, n = 0, m = 0;
        long c = 1;
        boolean isValid = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("This program is calculating ∑∑(i%j)/(i+c) where c = 1, i = a...n and j = b...m.");

        do{
            try{
                System.out.println("Enter value a: ");
                a = sc.nextLong();

                if(a < 0)
                {
                    System.out.println("Value of variable a can not be less then 0 because of possible division by zero (c = " + c + ").");
                    System.out.println("Try enter values again.");
                    continue;
                }

                System.out.println("Enter value b: ");
                b = sc.nextLong();

                if(b == 0)
                {
                    System.out.println("Value of variable b can not be 0.");
                    System.out.println("Try enter values again.");
                    continue;
                }

                System.out.println("Enter value n: ");
                n = sc.nextLong();

                System.out.println("Enter value m: ");
                m = sc.nextLong();

                isValid = true;
            }
            catch (Exception e)
            {
                System.out.println("Value is out of range. Value should be from –9 223 372 036 854 775 808 to 9 223 372 036 854 775 807");
                System.out.println("Try enter values again.");
            }
        }while(!isValid);

        double res = 0;

        if(a >= n || b >= m)
        {
            System.out.println("Entered a or b value is greater (equal) then n or m respectively. Zero iterations was performed.");
        }

        for(long i = a; i < n; i++){
            for(long j = b; j < m; j++){
                res += (double) (i % j) / (i + c);
            }
        }

        System.out.println("Result of this function is " + res + ".");
    }
}
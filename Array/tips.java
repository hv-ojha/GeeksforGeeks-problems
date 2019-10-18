import java.io.*;
import java.math.BigInteger;
import java.util.*;

class tips {
    public static void main(String[] args) throws IOException {
        while(true) {
            System.out.println("1. % operation using \'&\' operator for odd and even number.");
            System.out.println("2. Multiply using left shift operator.");
            System.out.println("3. Divide using right shift operator.");
            System.out.println("4. Swapping using XOR operator.");
            System.out.println("5. Count number of digits using MATH funcitons.");
            System.out.println("6. GCD using inbuilt operation");
            System.out.println("Enter your choice: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
            case 1:
                System.out.println("Enter your number: ");
                int num1 = Integer.parseInt(br.readLine());
                System.out.println((num1 & 1) == 0 ? "Even" : "Odd");
                break;
            case 2:
                System.out.println("Enter number to multiply with 2 ");
                int num2 = Integer.parseInt(br.readLine());
                System.out.println(num2 << 1);
                break;
            case 3:
                System.out.println("Enter number to divide by 2 ");
                int num3 = Integer.parseInt(br.readLine());
                System.out.println(num3 >> 1);
                break;
            case 4:
                System.out.println("Enter 2 number to swap using XOR");
                int num4 = Integer.parseInt(br.readLine());
                int num5 = Integer.parseInt(br.readLine());
                num4 ^= num5;
                num5 ^= num4;
                num4 ^= num5;
                System.out.println("First Number: " + num4 + "   Second number: " + num5);
                break;
            case 5:
                System.out.println("Enter number to find digit: ");
                int num6 = Integer.parseInt(br.readLine());
                System.out.println(Math.floor(Math.log10(num6)) + 1);
                break;
            case 6:
                System.out.println("Enter two numbers to find GCD: ");
                int num7 = Integer.parseInt(br.readLine());
                int num8 = Integer.parseInt(br.readLine());
                System.out.println(BigInteger.valueOf(num7).gcd(BigInteger.valueOf(num8)).intValue());
                break;
            default:
                System.exit(0);
            }
        }
    }
}
import java.util.Scanner;


public class App {
    //In this function 2 parameters are same, one of them is decreased at run time till 1, other remaims same for comparison.
    static void isPrime(int number, int cons)
    {
        //If incoming number is 2, or entered number is not divisible each of valid numbers printing message and exit. 
        if(number == 2)
        {
            System.out.println(cons + " is a prime number");
            return;
        } 
        //If any changed parameters is divisible with constant parameter, print message and exit.
        if(cons % (number -1) == 0)
        {
            System.out.println(cons + " is not a prime number");
            return;
        }
        //Recursion. Note that first parameter is tend to change.
        isPrime(number-1, cons);
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number which will be determined for being prime or not: ");
        int num = input.nextInt();
        isPrime(num, num);//First parameter will be counted down, and second parameter remains same as specified above.
    }
    
}

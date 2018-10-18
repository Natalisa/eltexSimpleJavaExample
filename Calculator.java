import java.util.Scanner;
public class Calculator{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
        Double a = 0.0, b = 0.0;
        Double rez = 0.0;
        while(true){
            System.out.println("1. Enter the first number");
            System.out.println("2. Enter the second number");
            System.out.println("3. Display numbers");
            System.out.println("4. Use the result as the first number");
            System.out.println("5. Add numbers");
            System.out.println("6. Subtract the second from the first number");
            System.out.println("7. Multiply numbers");
            System.out.println("8. Subtract the second from the first number");
            System.out.println("9. Output");
            Integer i = in.nextInt();
            switch(i){
                case 1:{
                    System.out.print("a = ");
                    a = in.nextDouble ();
                    break;
                }
                case 2:{
                    System.out.print("b = ");
                    b = in.nextDouble ();
                    break;
                }
                case 3:{
                    System.out.println("a = "+ a +" b = "+b);
                    break;
                }
                case 4:{
                    a = rez;
                    System.out.println("a = "+ rez);
                    break;
                }
                case 5:{
                    rez = a + b;
                    System.out.println("a = "+ a +" b = "+b);
                    System.out.println("rez = "+ rez);
                    break;
                }
                case 6:{
                    rez = a - b;
                    System.out.println("a = "+ a +" b = "+b);
                    System.out.println("rez = "+ rez);
                    break;
                }
                case 7:{
                    rez = a * b;
                    System.out.println("a = "+ a +" b = "+b);
                    System.out.println("rez = "+ rez);
                    break;
                }
                case 8:{
                    rez = a / b;
                    System.out.println("a = "+ a +" b = "+b);
                    System.out.println("rez = "+ rez);
                    break;
                }
                case 9: {
                    System.exit(0);
                    break;
                }
            }
        }
	}
}
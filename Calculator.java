import java.util.Scanner;
public class Calculator{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
        Integer a = 0, b = 0;
        while(true){
            System.out.println("1. Enter the first number");
            System.out.println("2. Enter the second number");
            System.out.println("3. Display numbers");
            System.out.println("4. Add numbers");
            System.out.println("5. Subtract the second from the first number");
            System.out.println("6. Multiply numbers");
            System.out.println("7. Subtract the second from the first number");
            System.out.println("9. Output");
            Integer i = in.nextInt();
            switch(i){
                case 1:{
                    System.out.print("a = ");
                    a = in.nextInt();
                    break;
                }
                case 2:{
                    System.out.print("b = ");
                    b = in.nextInt();
                    break;
                }
                case 3:{
                    System.out.println("a = "+ a +" b = "+b);
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
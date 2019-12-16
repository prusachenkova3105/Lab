package diskr;
import java.util.Scanner; 
public class diskr {
	    static int a = 0;
	    static int b = 0;
	    static int c = 0;
		private static Scanner in;
		private static int a1;
		private static int b1;
		private static int c1;

	    public static void main (String[] args ) {
	        solver_ENTER(a1, b1, c1);

	        if (a1 == 0) {
	            if (b1 == 0) {
	                System.out.println("Неверное введение данных");
	            } else {
	                int x1 = (-c1)/b1;
	                System.out.println ("X = "+ x1);
	            }

	        } else {
	            int D = (b1^2)- 4*a1*c1;
	            System.out.println("D = " + D);

	            if (D>0) {
	                int x2 = (-b1-D^(1/2))/(2*a1);
	                int x3 = (-b1+D^(1/2))/(2*a1);
	                System.out.println ("X1 = "+ x2 + "; X2 = "+x3);
	            } else if (D<0) {
	                int x4 = (-b1)/(2*a1);
	                System.out.println ("X = "+ x4);
	            } else {
	                System.out.println ("Корней нет!");
	            }
	        }

	    }
	    public static void solver_ENTER (int a, int b, int c) {


	        in = new Scanner(System.in);
	        System.out.print("Input a = ");
	        setA1(in.nextInt());
	        System.out.print("Input b = ");
	        setB1(in.nextInt());
	        System.out.print("Input c = ");
	        setC1(in.nextInt());

	    }
		public static int getA1() {
			return a1;
		}
		public static void setA1(int a1) {
			diskr.a1 = a1;
		}
		public static int getB1() {
			return b1;
		}
		public static void setB1(int b1) {
			diskr.b1 = b1;
		}
		public static int getC1() {
			return c1;
		}
		public static void setC1(int c1) {
			diskr.c1 = c1;
		}

	}


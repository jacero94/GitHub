
public class condicionales {

	public static void main(String[] args) {
		double A=36, B=72, C=64;
		
			if (Math.sqrt(A)*Math.sqrt(A)==A)
			System.out.println(A+"tiene raiz exacta");
			else
				System.out.println(A+"No tiene raiz exacta");
			
			if (Math.sqrt(B)*Math.sqrt(B)==B)
		System.out.println(B+"tiene raiz exacta");
		else
			System.out.println(B+"No tiene raiz exacta");
	
			if (Math.sqrt(C)*Math.sqrt(C)==C)
		System.out.println(C+"tiene raiz exacta");
		else
			System.out.println(C+"No tiene raiz exacta");
	
			if (A%2==0)
			System.out.println(A+"es par");
			else
				System.out.println(A+"impar");
			
			if (B%2==0)
			System.out.println(B+"es par");
		    else
			    System.out.println(B+"impar"); 
			
			if (C%2==0)
			System.out.println(C+"es par");
		    else
			    System.out.println(C+"impar");
			
			if (A>B)
				if (A>C)
					if (B>C)
						System.out.println(""+A+B+C);
					else
						System.out.println(""+A+C+B);
				else
					System.out.println(""+C+A+B);
				if (B>C)
				  if (A>C)
					System.out.println(""+B+A+C);
				else
					System.out.println(""+B+C+A);
			else
				System.out.println(""+C+B+A);
			}
}

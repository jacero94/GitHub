
public class operacion {
	
	int x,y;  
	
	public static void main (String m[]){
	operacion t=new operacion ();
			t.x=7;
			t.y=8;
			t.suma();
			t.resta();
			t.multiplicacion();
			t.division();
	}
	
	public void suma (){
		
		int r; 
		
		r= x+y;
		
		System.out.println("la suma es"+r);
		
	}
	public void resta (){
		
		int r; 
		
		r= x-y;
		
		System.out.println("la diferencia es"+r);
		
	}
	public void multiplicacion (){
		
		int r; 
		
		r= x*y;
		
		System.out.println("la multiplicacion es"+r);
		
	}
	
public void division (){
		
		int r; 
		
		r= x/y;
		
		System.out.println("la division es"+r);
		
	}
	}




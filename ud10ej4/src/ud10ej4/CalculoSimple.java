package ud10ej4;

public class CalculoSimple {
	
	static private double x1;
	static private double x2;
	
	
	

	public CalculoSimple() {
		super();
	}
	
	public CalculoSimple(double x1) {
		super();
		this.x1 = x1;
	}
	
	public CalculoSimple(double x1, double x2) {
		super();
		this.x1 = x1;
		this.x2 = x2;
	}

	
	
	

	public static double getX1() {
		return x1;
	}

	public static void setX1(double x1) {
		CalculoSimple.x1 = x1;
	}

	public static double getX2() {
		return x2;
	}

	public static void setX2(double x2) {
		CalculoSimple.x2 = x2;
	}

	public static double sumar() {
		
		double s = x1 + x2;
		
		return s ;
		
	}
	
	
public static double resta() {
		
	double s = x1 - x2;
		
		return s ;
		
	}


public static double multi() {
	
	double s = x1 * x2;
	
	return s ;
	
}


public static double division() {
	
	double s =  (x1/x2);
	
	return s ;
	
}

public static double potencia() {
	
	double s = Math.pow(x1, x2);
	return s ;
	
}

public static double raizCuadrada() {
	
	double s =  (Math.sqrt(x1));

	return s ;
	
}

public static double raizcubica() {
	
	double s =  (Math.cbrt(x1));
	
	return s ;
	
}








}

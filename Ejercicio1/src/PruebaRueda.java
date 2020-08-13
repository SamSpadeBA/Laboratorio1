
public class PruebaRueda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rueda r1 = new Rueda("rojo","aluminio",14.5);
		Rueda r2 = new Rueda("plateada","plastico",21);
		Rueda r3 = new Rueda("negra","acero",20);
		
		r1.girar();
		r2.girar();
		r3.girar();
		
		r1.DatosRueda();
		r2.DatosRueda();
		r3.DatosRueda();	
		
		System.out.printf("El color de la rueda 1 es %s\n", r1.getColor());
		System.out.printf("El material de la rueda 3 es %s\n", r3.getMaterial());
		
	}

}

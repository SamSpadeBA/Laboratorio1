
public class PruebaMotor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motor M1 = new Motor("FiatMotor",1600,"Naftero",300);
		Motor M2 = new Motor("Renault",1000,"electrico",500.5);
		
		// Motor M1
		
		M1.DatosMotor();
		M1.PrenderMotor();
		M1.DatosMotor();
		M1.ApagarMotor();
		System.out.printf("El motor 1 fue fabricado por %s", M1.getMarca());
		
		// Motor M2
		M2.DatosMotor();
		M2.PrenderMotor();
		M2.DatosMotor();
		M2.ApagarMotor();
		System.out.printf("El motor 2 es del tipo %s", M2.getTipo());
		
		
		
	}

}


public class PruebaCajaVelocidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CajaVelocidad c1 = new CajaVelocidad("Pegueot",6,'l');
		CajaVelocidad c2 = new CajaVelocidad("Fiat",5,'h');
		CajaVelocidad c3 = new CajaVelocidad("Audi",7,'M');
		
		c1.Datos();
		c2.Datos();
		c3.Datos();
		
		c1.PasarMarcha();
		c1.PasarMarcha();
		System.out.printf("La marcha actual de la caja 1 es %d\n", c1.getMarchaActual());
		c1.BajarMarcha();
		System.out.printf("La marcha actual de la caja 1 es %d\n", c1.getMarchaActual());
		
		for (int i=0; i<20; i++)
			c2.PasarMarcha();
		System.out.printf("La marcha actual de la caja 2 es %d\n", c2.getMarchaActual());
		System.out.printf("La relacion de la caja 2 es %s\n", c2.getRelacion());
		
		System.out.printf("El fabricante de la caja 3 es: %s\n", c3.getFabricante());
		
	}

}

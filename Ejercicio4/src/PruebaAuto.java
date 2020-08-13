
public class PruebaAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Auto 1
		Motor M1 = new Motor("FiatMotor",1600,"Naftero",300);
		CajaVelocidad c1 = new CajaVelocidad("Audi",7,'M');
		Rueda r1 = new Rueda("negra","aluminio",24);
		Rueda r2 = new Rueda("negra","plastico",24);
		Rueda r3 = new Rueda("negra","acero",24);
		Rueda r4 = new Rueda("negra","plastico",24);
		Rueda[] autor= {r1,r2,r3,r4};
		Auto auto1 = new Auto("Fiat","Palio",4,M1,c1,false,autor);
		
		
		//Auto 2
		Motor M2 = new Motor("Renault",1000,"electrico",500.5);
		CajaVelocidad c2 = new CajaVelocidad("Fiat",5,'h');
		Rueda r5 = new Rueda("plateada","aluminio",21);
		Rueda r6 = new Rueda("plateada","plastico",21);
		Rueda r7 = new Rueda("plateada","acero",21);
		Rueda r8 = new Rueda("plateada","acero",21);
		Rueda[] autor2= {r5,r6,r7,r8};
		Auto auto2 = new Auto("Renault","Sandero",5,M1,c1,true,autor2);
		
		System.out.printf("\n Auto 1\n");
		auto1.DatosAuto();
		auto1.EncenderAuto();
		auto1.Acelerar(50);
		auto1.PasarMarcha();
		auto1.PasarMarcha();
		auto1.PasarMarcha();
		auto1.PasarMarcha();
		auto1.BajarMarcha();
		System.out.printf("\nLa marcha actual es %d y la velocidad es %.2f\n",auto1.getMarchaActual(), auto1.getVelocidad());
		auto1.ApagarAuto();

		
		System.out.printf("\n Auto 2\n");
		auto2.DatosAuto();
		auto2.EncenderAuto();
		auto2.Acelerar(40);
		auto2.PasarMarcha();
		auto2.BajarMarcha();
		System.out.printf("\nLa marcha actual es %d y la velocidad es %.2f\n",auto1.getMarchaActual(), auto1.getVelocidad());
		auto2.setTemperatura(24);
		auto2.DatosAuto();
		auto2.ApagarAuto();
	}

}

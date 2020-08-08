import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int nro1, nro2, residuo;
		
		System.out.print("Ingrese el nro1:");
		nro1 = entrada.nextInt();
		System.out.print("Ingrese el nro2:");
		nro2 = entrada.nextInt();
		
		residuo = nro1 % nro2;
		if ( residuo == 0 )
			System.out.printf("%d es multiplo de %d\n",nro1,nro2);
		else
			System.out.printf("%d es impar\n",nro1);
		
	}

}

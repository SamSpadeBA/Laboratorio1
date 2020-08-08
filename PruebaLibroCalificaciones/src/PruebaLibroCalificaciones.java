import java.util.Scanner;

public class PruebaLibroCalificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner ( System.in );
		String curso = new String();
		LibroCalificaciones miLibroCalificaciones1 = new LibroCalificaciones("algebra","Perry");
		LibroCalificaciones miLibroCalificaciones2 = new LibroCalificaciones("algo","Bonty");
		
		miLibroCalificaciones1.mostarMensaje();
		miLibroCalificaciones2.mostarMensaje();
		curso=miLibroCalificaciones2.getNombre();
		System.out.printf("\n%s\n",curso);
		
	}

}

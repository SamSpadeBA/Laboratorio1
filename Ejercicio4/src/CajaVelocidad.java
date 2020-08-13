
public class CajaVelocidad {

	private String fabricante;
	private int marchas;
	private int marchaActual;
	private char relacion; 
	// La relacion es L, M o C
	
	public int getMarchaActual() {
		return marchaActual;
	}
	public void setMarchaActual(int marchaActual) {
		this.marchaActual = marchaActual;
	}

	
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getMarchas() {
		return marchas;
	}
	public void setMarchas(int marchas) {
		this.marchas = marchas;
	}
	public char getRelacion() {
		return relacion;
	}
	public void setRelacion(char relacion) {
		if ( Character.toUpperCase(relacion) == 'L' || Character.toUpperCase(relacion) == 'M' ||  Character.toUpperCase(relacion) == 'C' )
			this.relacion = Character.toUpperCase(relacion) ;
		else
			this.relacion = 'L';
	}
	
	public void PasarMarcha()
	{
		if (this.getMarchaActual() < this.getMarchas() )
			this.setMarchaActual(this.getMarchaActual()+1);
	}

	public void BajarMarcha()
	{
		if (this.getMarchaActual() > 0 )
			this.setMarchaActual(this.getMarchaActual()-1);
	}
	
	public CajaVelocidad(String fabricante, int marchas, char relacion) {
		this.setFabricante(fabricante);
		this.setMarchas(marchas);
		this.setMarchaActual(0);
		this.setRelacion(relacion);
		}
	
	public void Datos()
	{
		System.out.printf("La caja es de marca %s , tiene una relacion %s y %d marchas. Actualmente esta en la marcha %d\n",this.getFabricante(), this.getRelacion(), this.getMarchas(), this.getMarchaActual());
	}
	
}

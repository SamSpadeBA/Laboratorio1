public class Motor {

	private String marca;   // Marca del motor
	private int cilindrada; // Potencia del motor
	private double hp;
	private String tipo;	// Tipo de motor Naftero, Electrico, etc 
	private boolean estado=false; // Estado False=Apagado y True=Prendido
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean EstadoMotor() {
		if (estado == true)
			System.out.println("El motor esta encendido");
		else
			System.out.println("El motor esta apagado");
		return estado;
	}
	private void setEstado(boolean estado) {
		this.estado = estado;
	}

	public double getHp() {
		return hp;
	}
	public void setHp(double hp) {
		this.hp = hp;
	}
	
	public void ApagarMotor() {
		this.setEstado(false);
		System.out.println("Se apagó el motor");
	}
	
	public void PrenderMotor() {
		this.setEstado(true);
		System.out.println("Se prendió el motor");
	}
	
	public Motor (String marca, int cilindrada, String tipo, double hp)
	{
		setMarca(marca);
		setCilindrada(cilindrada);
		setTipo(tipo);
		setHp(hp);
		setEstado(false);
	}
	
	public void DatosMotor()
	{
		System.out.printf("\n El motor es marca %s, de %d cm3 y %.2f HP y del tipo %s\n", this.getMarca(), this.getCilindrada(), this.getHp(), this.getTipo());
	}
}



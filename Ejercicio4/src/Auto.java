
public class Auto {
	
	private String marca;
	private double velocidad;
	private String modelo;
	private int puerta;
	private boolean estado;
	private boolean aireAcondicionado;
	private float temperatura;
	private Motor motor;
	private CajaVelocidad cajaVelocidad;
	private Rueda[] ruedas;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPuerta() {
		return puerta;
	}
	public void setPuerta(int puerta) {
		this.puerta = puerta;
	}
	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}
	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}
	public float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	public boolean isEstado() {
		if (estado == true)
			System.out.println("El auto se encuentra encendido");
		else
			System.out.println("El auto se encuentra apagado");
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	public Auto(String marca, String modelo, int puertas,Motor motor, CajaVelocidad cajaVelocidad, boolean aire, Rueda[] rueda) {
		
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPuerta(puertas);
		this.setVelocidad(0);
		this.motor=motor;
		this.cajaVelocidad=cajaVelocidad;
		this.setAireAcondicionado(aire);
		this.ruedas=rueda;

	}
	
	public void EncenderAuto()
	{
		this.setEstado(true);
		this.motor.PrenderMotor();
		this.setVelocidad(0);
		System.out.println("Se encendió el auto");
	}
	
	public void ApagarAuto()
	{
		this.setEstado(false);
		this.motor.ApagarMotor();
		this.setVelocidad(0);
		System.out.println("Se apagó el auto");
	}
	
	public void Acelerar(double velocidad)
	{
		this.setVelocidad(velocidad);
		System.out.printf("Se aceleró el auto, la velocidad actual es %.2f\n",this.getVelocidad());
	}
	
	public void Desacelerara (int velocidad)
	{
		this.setVelocidad(velocidad);
		System.out.printf("Se desaceleró el auto, la velocidad actual es %d\n",this.getVelocidad());
	}
	
	public void DatosAuto()
	{
		System.out.printf("\n El Auto es marca %s, el modelo es %s , tiene %d ruedas, la temperatura interior es %.2f grados, tiene %d puertas esta andando a %.2f km/h.\n", this.getMarca(), this.getModelo(), this.ruedas.length, this.getTemperatura(), this.getPuerta(), this.getVelocidad() );
		this.motor.DatosMotor();
		this.cajaVelocidad.Datos();
		for (int i=0; i < this.ruedas.length ; i++)
			this.ruedas[i].DatosRueda();
			
	}
	
	public void PasarMarcha()
	{
		this.cajaVelocidad.PasarMarcha();
	}

	public void BajarMarcha()
	{
		this.cajaVelocidad.BajarMarcha();
	}
	
	public int getMarchaActual() {
		return this.cajaVelocidad.getMarchaActual();
	}
	
}
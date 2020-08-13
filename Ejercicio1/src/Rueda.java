
public class Rueda {
	
	private String color;
	private String material;
	private double radio;
	
	public Rueda (String color, String material, double radio)
	{
		this.setColor(color);
		this.setMaterial(material);
		this.setRadio(radio);
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void girar()
	{
		System.out.println("La rueda esta girando");
	}
	
	public void DatosRueda()
	{
		System.out.printf("La rueda es de color %s, de material %s y tiene un radio de %.2f\n",this.getColor(),this.getMaterial(),this.getRadio());
	}
}

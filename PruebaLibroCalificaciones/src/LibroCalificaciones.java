
public class LibroCalificaciones {
	
	private String nombre;
	private String instructor;
	
	public LibroCalificaciones (String nom, String instructor)
	{
		nombre = nom;
		this.instructor = instructor;
	}
	
	public void setNombre (String curso)
	{
		nombre = curso;
	}

	public String getNombre ()
	{
		return nombre;
	}

	public void setInstructor (String instructor)
	{
		this.instructor = instructor;
	}

	public String getInstructor()
	{
		return instructor;
	}
	public void mostarMensaje()
	{
		System.out.printf("Bienvenido al curso de %s, lo imparte %s\n",getNombre(),getInstructor());
	}
}

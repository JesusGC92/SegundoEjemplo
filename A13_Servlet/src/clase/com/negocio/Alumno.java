package clase.com.negocio;

public class Alumno {

	private String nombre;
	private String apellidos;
	private Double promedio;
	
	public Alumno() {
		
	}
	
	public Alumno(String nom, String ape, Double prome) {
		nombre= nom;
		apellidos=ape;
		promedio= prome;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public Double getPromedio() {
		return promedio;
	}
	
	
	
	
	
}

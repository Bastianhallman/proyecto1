/**
 * 
 */
package fundamento;

/**
 * @author 1
 *
 */
public class perro extends animal{
	private String nombre;
	private String Agrecividad;
	
	/**
	 * @param nombre
	 * @param agrecividad
	 */
	public perro(String nombre, String agrecividad) {
		super();
		this.nombre = nombre;
		Agrecividad = agrecividad;
	}

	public String ladrar () {
    	String ladrido= " " ;
    	if(this.Agrecividad.equals("fiero")){
	        ladrido="GRRr";
            }

	        if(this.Agrecividad.equals("manso")){
	        }
	        return ladrido ;
	        	
	     
    	
	
		
	}

	@Override
	public String toString() {
		return "perro [nombre=" + nombre + ", Agrecividad=" + Agrecividad + "]";
	}

}

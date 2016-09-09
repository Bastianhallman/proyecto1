/**
 * 
 */
package fundamento;

/**
 * @author 1
 *
 */
public class Pinguino extends animal {
	
	private String nombre;


	@Override
	public String toString() {
		return "Pinguino [nombre=" + nombre + "]";
	}


	/**
	 * @param nombre
	 */
	public Pinguino(String nombre) {
		super();
		this.nombre = nombre;
		
	}



	
	

}

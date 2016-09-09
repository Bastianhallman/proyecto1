/**
 * 
 */
package fundamento;

/**
 * @author bastian
 *@version 1.0
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		     perro cain= new perro("cain","fiero");
		     perro perro= new perro("gabriel","manso");
		     System.out.println("el perro ladrar: "+cain.ladrar());
		     System.out.println("el perro manso: "+perro.ladrar());
		     loro lorito= new loro();
		     System.out.println(lorito.hablar());
		     Pinguino pingui= new Pinguino("adela");
		     System.out.println(pingui.toString());
		     
		     }
		    

}

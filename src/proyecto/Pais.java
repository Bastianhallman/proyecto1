/**
 * 
 */
package proyecto;

import java.util.Date;

/**
 * @author 1
 *
 */
public class Pais {
	
		private String nombre;
		private Integer habitantes;
		private Integer metrocuadrados;
		private Date fechaindependencia;
		private Integer metrocuadrado;
		/**
		 * @param nombre
		 * @param habitantes
		 * @param metrocuadrados
		 * @param fecha
		 */
		public Pais(String nombre, Integer habitantes, Integer metrocuadrado, Date fecha) {
			this.nombre = nombre;
			this.habitantes = habitantes;
			this.metrocuadrado  = metrocuadrado;
			this.fechaindependencia = fechaindependencia;
		}
		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}
		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		 * @return the habitantes
		 */
		public Integer getHabitantes() {
			return habitantes;
		}
		/**
		 * @param habitantes the habitantes to set
		 */
		public void setHabitantes(Integer habitantes) {
			this.habitantes = habitantes;
		}
		/**
		 * @return the metrocuadrados
		 */
		public Integer getMetrocuadrados() {
			return metrocuadrados;
		}
		/**
		 * @param metro the metro to set
		 */
		public void setMetro(Integer metrocuarado) {
			this.metrocuadrado = metrocuadrado;
		}
		/**
		 * @return the fechaindependencia
		 */
		public Date getFechaindependencia() {
			return fechaindependencia;
		}
		/**
		 * @param fechaindependencia the fechaindependencia to set
		 */
		public void setFechaindependencia(Date fechaindependencia) {
			this.fechaindependencia = fechaindependencia;
		}
		
	     public String impresion(){
	    	 return "el pais tiene "+ this.nombre+"con la cantidad de habitante "+
	       this.habitantes+"los metros cuadrados:"+this.metrocuadrado+"la fecha de independencia"+
	    	this.fechaindependencia;
	     
	 
	    	 
	    	 
	     } 	 
	    	 
	    	 
	    	 
	    	 
	     
}
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	   
    
	    	 

	     
	     
		
		

	



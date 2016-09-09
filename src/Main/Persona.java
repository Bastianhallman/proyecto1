/**
 * 
 */
package Main;

/**
 * @author 1
 *
 */
public class Persona {

		private String Rut;
		private String Nombre;
		private String ApellidoPaterno;
		private String ApellidoMaterno;
		private String Sexo;
		/**
		 * @param rut
		 * @param nombre
		 * @param apellidoPaterno
		 * @param apellidoMaterno
		 * @param sexo
		 */
		public Persona(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String sexo) {
			super();
			Rut = rut;
			Nombre = nombre;
			ApellidoPaterno = apellidoPaterno;
			ApellidoMaterno = apellidoMaterno;
			Sexo = sexo;
		}
		/**
		 * @param rut
		 */
		public Persona(String rut) {
			super();
			Rut = rut;
		}
		/**
		 * 
		 */
		public Persona() {
			super();
		}
		public String getRut() {
			return Rut;
		}
		public void setRut(String rut) {
			Rut = rut;
		}
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String nombre) {
			Nombre = nombre;
		}
		public String getApellidoPaterno() {
			return ApellidoPaterno;
		}
		public void setApellidoPaterno(String apellidoPaterno) {
			ApellidoPaterno = apellidoPaterno;
		}
		public String getApellidoMaterno() {
			return ApellidoMaterno;
		}
		public void setApellidoMaterno(String apellidoMaterno) {
			ApellidoMaterno = apellidoMaterno;
		}
		public String getSexo() {
			return Sexo;
		}
		public void setSexo(String sexo) {
			Sexo = sexo;
		}
		@Override
		public String toString() {
			return "Persona [Rut=" + Rut + ", Nombre=" + Nombre + ", ApellidoPaterno=" + ApellidoPaterno
					+ ", ApellidoMaterno=" + ApellidoMaterno + ", Sexo=" + Sexo + "]";
		}
		
		
		
		
		

	

}

import java.util.Scanner;

public class Saluda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dime tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Hola "+nombre);
//		Nombres.pideNombre();
		System.out.println(Nombres.pideNombre());
	}

	static class Nombres{
		static Scanner sc = new Scanner(System.in);
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

		private String nombre;

		public void Nombre(String nombre){
			this.nombre = nombre;
		}
		
		public Nombres(){String nombre="";}
		
		public static String pideNombre(){
			System.out.println("dime tu nombre");
			String nombre = sc.nextLine();
			return "hola "+nombre;
			
		}
		
		
	}
	
}

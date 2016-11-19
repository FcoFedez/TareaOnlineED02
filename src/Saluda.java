import java.util.Scanner;

public class Saluda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dime tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Hola "+nombre);
	}

}

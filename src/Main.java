import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float temperaturaCelsius = 0;
		float temperaturaFahrenheit = 0;
		String simOuNao = "";
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			temperaturaCelsius = sc.nextFloat();
			double conversao = ((9 * temperaturaCelsius) / 5) + 32;
			System.out.printf("Temperatura equivalente em Fahrenheit: " + "%.1f%n",conversao);
			System.out.print("Deseja repetir (s/n)? ");
			simOuNao = sc.next();
		}while(simOuNao.equals("s"));
	}

}

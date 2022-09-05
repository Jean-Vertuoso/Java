import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tc = new Scanner(System.in);
		
		double num1;
		double num2;
		String op = "";
		double result = 0;
		String opcao = "s";
		boolean opIsValido = true;
		
		while (opcao.equals ("s") || opcao.equals("S")) {
			System.out.print("Digite o primeiro número: ");
			num1 = tc.nextDouble();
			
			System.out.print("Digite o segundo número: ");
			num2 = tc.nextDouble();
			
			System.out.print("Qual operador deseja utilizar? ");
			op = tc.next();
			
			switch (op) {
				case "+":
					result = num1 + num2;				
				break;

				case "-":
					result = num1 - num2;					
				break;
				
				case "/":
					result = num1 / num2;					
				break;
				
				case "*":
					result = num1 * num2;					
				break;
				
				default:
					System.out.println("Operador inválido. Reinicie o programa.");
					opIsValido = false;
				break;
			}
			
			if (opIsValido) {
				System.out.println("Resultado: "+ result);
				
				System.out.print("Deseja continuar? ");
				opcao = tc.next();
			} else {
				break;
			}
		}
	}

}

import java.util.Scanner;

public class CalcIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tc = new Scanner(System.in);
		
		double height;
		double weight;
		char option = 'S';
		
		while (startProgram(tc)) {
			
			System.out.print("\nDigite sua altura: ");
			height = tc.nextDouble();	
			
			System.out.print("Digite seu peso: ");
			weight = tc.nextDouble();
			
			System.out.println(verifConsAlt(height, weight));
			System.out.println("");
		}
		

	}

	public static String verifConsAlt(double height, double weight) {
		
		double imc = weight / (height * height);
		
		String message;
		
		
		if (imc < 17) {
			
			message = "\nSeu IMC é de: "+ imc +"\nEstá muito abaixo do peso.";
			
			}else if(imc >= 17 && imc < 18.5) {				
				message = "\nSeu IMC é de: "+ imc +"\nEstá abaixo do peso.";	
				
				}else if(imc >= 18.5 && imc < 25) {				
					message = "\nSeu IMC é de: "+ imc +"\nEstá no peso normal.";
					
					}else if(imc >= 25 && imc < 30) {				
						message = "\nSeu IMC é de: "+ imc +"\nEstá acima do peso.";
						
						}else if(imc >= 30 && imc < 35) {				
							message = "\nSeu IMC é de: "+ imc +"\nEstá com obesidade grau I.";
							
							}else if(imc >= 35 && imc < 40) {				
								message = "\nSeu IMC é de: "+ imc +"\nEstá com obesidade grau II.";
								
								}else{				
									message = "\nSeu IMC é de: "+ imc +"\nEstá com obesidade grau III.";
								}
		
		return message;
		
	}
	
	public static boolean startProgram(Scanner tc) {
		
		boolean goContinue = true;
		boolean isOpValid = false;
		char option = 'S';
		
		while(!isOpValid) {

			System.out.print("Digite 'S' para iniciar ou 'Q' para sair: ");
			option = tc.next().charAt(0);
		
		if (option == 'S' || option == 's') {
			goContinue = true;
			isOpValid = true;
			
			}else if(option == 'Q' || option == 'q') {
				System.out.println("\nPrograma encerrado.");
				goContinue = false;
				isOpValid = true;
				
				}else{
					isOpValid = false;
					System.out.println("\nOpção inválida. ");
					System.out.print("Deseja continuar? S/N: ");
					option = tc.next().charAt(0);					
				}
		}
		return goContinue;
	}
}

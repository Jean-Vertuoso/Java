// ---------------------------------------------------------------------------------------  Início do código ------------------------------------------------------------------------------------\\

// -----------------------------------------------------------------------------------  Importação de bibliotecas -------------------------------------------------------------------------------\\
import java.util.Scanner;
//----------------------------------------------------------------------------------------  Início da Classe ------------------------------------------------------------------------------------\\
public class CalcularMedia {

// ---------------------------------------------------------------------------------------  Método principal ------------------------------------------------------------------------------------\\

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tc = new Scanner(System.in); // Instanciando objeto Scanner;
// --------------------------------------------------------------------------------------  Declarando variáveis ---------------------------------------------------------------------------------\\	
		double nota;		
		double somaNotas = 0;
		double media = 0;
		byte cont = 0;
// ---------------------------------------------------------------------------------------  Conteúdo da classe ---------------------------------------------------------------------------------\\	
		do{
			
			System.out.print("Digite a nota: "); 			 // 1. Pedido de digitação ao usuário;
			nota = tc.nextDouble(); 			 			 // 2. Guarda temporariamente na variável "nota" para verificação nas condições abaixo;
				
				if(nota >= 0 && nota <= 10) {				 // 3. Verificação do conteúdo inserido na variável "nota";
					somaNotas = somaNotas + nota;			 // 4. Se a nota for válida, adiciona esta nota na soma;
					System.out.println("Nota adicionada. "); // 5. Informa ao usuário que a nota foi adicionada;
					cont++; 								 // 6. Contador do número de notas para divisão da média. Só será incrementado, caso o número da variável "nota" seja válido;
				}else {										 // 7. Se a nota não for válida, é enviada a mensagem abaixo para o usuário, e nada é adicionado à variável "nota";
					System.out.println("\nNota inválida. Adicione uma nota válida ou calcule a média e encerre o programa.");
				}
				
		}while(addNewNote(tc));								 // 8. Todo o processo é feito enquanto a condição da função "addNewNote" for verdadeira, ou seja, enquanto o usuário quiser adicionar
															 // uma nova nota;

		media = somaNotas / cont;							 // 9. Após sair do laço acima, é calculada a média baseando-se na soma de notas dividido pelo número armazenado na variável "cont";
		System.out.println("\nMédia:"+ media);  			 // 10. Mostra o resultado para 
		System.out.println("\nPrograma encerrado.");		 // 11. Mensagem de encerramento do programa.
	}

// ----------------------------------------------------------------------------------  Função de controle do programa ---------------------------------------------------------------------------\\	
	
//----------------------------------------------------------------------------------------  Início da Classe ------------------------------------------------------------------------------------\\
	public static boolean addNewNote(Scanner tc) {
// --------------------------------------------------------------------------------------  Declarando variáveis ---------------------------------------------------------------------------------\\	
		boolean goContinue = true;
		boolean isInvalido = true;
		char opcao = 's';
// ---------------------------------------------------------------------------------------  Conteúdo da classe ---------------------------------------------------------------------------------\\	
		System.out.println("\n1 - Adicionar nova nota "); 	 // 12. Esta opção joga o usuário para o início do programa, na linha 22; 
		System.out.println("2 - Calcular e sair do programa "); // 13. Esta opção encerra o programa e joga o usuário para a linha 36;
		System.out.print("Opção: ");						 // 14. Mensagem para o usuário escolher uma opção;
		opcao = tc.next().charAt(0);						 // 15. Função que armazena a opção do usuário;
		System.out.println("");
		
		while(isInvalido) {									 // 16. Laço de repetição que só sai caso a variável isInvalido seja falsa;
		
			if(opcao == '1') {								 // 17. Se o usuário escolher a opção "1", 
				goContinue = true;							 // 18. Variável responsável pelo rumo do programa, indicando se o usuário irá continuar com o valor "true" ou se o programa irá
															 // encerrar com o valor "false";
				isInvalido = false;							 // 19. Variável responsável pela opção escolhida, indicando se a opção é inválida com o valor "true", ou se a opção é válida com o
															 // valor "false";
				
				}else if(opcao == '2'){		 				 // 20. Se o usuário escolher a opção "2",
					goContinue = false;						 // 21. Variável goContinue explicada no passo "18" recebe o valor de "false";
					isInvalido = false;						 // 22. Variável isInvalido explicada no passo "19" recebe o valor de "false";
					
					}else {
						isInvalido = true;					 // 23. Se não for atendido nenhuma das outras situações, a variável explicada no passo "19" recebe o valor de "true";
						System.out.println("\nOpção Inválida. Deseja continuar?"); // 24. Mensagem ao usuário para escolher se irá continuar ou não com o programa;
						System.out.println("1 - Sim");		 // 25. Se o usuário escolher esta opção, continuará sendo executado o programa e será enviado para a linha "22" preservando as
															 // variáveis e seus valores;
						System.out.println("2 - Não");		 // 26. Se o usuário escolher esta opção, será enviado para a linha "36" e o programa será encerrado;
						System.out.print("Opção: ");		 // 27. Mensagem para o usuário escolher uma opção;
						opcao = tc.next().charAt(0);		 // 28. Função que armazena a opção do usuário;
						System.out.println("");				 // 29. Pula uma linha;
				}
		
		}		
		return goContinue;									 // 30. Retorno da variável que indicará se o programa continuará ou encerrará;
	}
}
//------------------------------------------------------------------------------------------  Fim do código -------------------------------------------------------------------------------------\\
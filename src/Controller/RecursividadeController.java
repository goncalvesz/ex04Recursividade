package Controller;
/*
 * 4. Crie uma função recursiva que exiba o total de elementos nega�vos de um vetor de inteiros, de N
posições, passado como parâmetro:
O código deve trazer como comentários:
A condição de parada
Como escrever a função para o termo n em função do termo anterior
 */
public class RecursividadeController {

	public RecursividadeController(){
		
	}
	
	public int MostraNegativos(int vet[], int tamanho){
		if (tamanho >= 0) {
			if (vet[tamanho] < 0) {
				return 1 + MostraNegativos(vet, tamanho-1); //Soma um quando um valor do vetor e negativo
			}
			return 0 + MostraNegativos(vet, tamanho-1); //Não soma nada e chama a si mesmo quando o valor e positivo
		}
		return 0; //retorna zero ao chegar no ultimo termo do vetor, encadeando os retornos
	}
	
}

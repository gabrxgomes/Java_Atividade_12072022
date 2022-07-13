package atividadeJava12072022;
import java.util.*;
public class Atividade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gerador = new Random();
	    int lancamentos[] = new int[10];
	    int maior = 0;
	    int qtdMaior = 0;
	    float media = 0.f;

	    for (int i = 0; i < lancamentos.length; i++) {
	      lancamentos[i] = gerador.nextInt(1, 7);
	      if (maior < lancamentos[i]){
	        maior = lancamentos[i];
	        qtdMaior = 1;
	      }else if (maior == lancamentos[i]){
	        qtdMaior++;
	      }
	      media += lancamentos[i];
	    }
	    for (int i = 0; i < lancamentos.length; i++) {
	      System.out.print(lancamentos[i] + " | ");
	    }
	    System.out.println("Maior: " + maior);
	    System.out.println("Maior Qtd: " + qtdMaior);
	    System.out.println("Media: " + (media / lancamentos.length));

	  }
	

}

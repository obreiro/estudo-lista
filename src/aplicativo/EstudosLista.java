package aplicativo;

import java.util.ArrayList;
import java.util.List;

public class EstudosLista {

	public static void main(String[] args) {
		
		//Declarando variáveis e atribuindo valores valores
				String texto1= "Modelo1";
				String texto2= "Modelo2";
				String texto3= "Modelo3";
				
				//declarando interface List e implentando classe
				List<String> lista = new ArrayList<>();
				
				//implementando elementos na lista
				
				lista.add(texto1);
				lista.add(texto2);
				lista.add(texto3);
				
				//imprimindo elementos da lista
				System.out.println(lista);
				
				//imprimindo elementos da lista com for each
				for(String x : lista) {
					System.out.println(x);
				}
				
				

	}

}

package aplicativo;

import java.util.ArrayList;
import java.util.List;


public class EstudosLista {

	public static void main(String[] args) {
					
//Estilo tsConfig do TypeScript
				String aula1 = "Modelando aula";
				String aula2 = "Conhecendo aula lista";
				String aula3 = "Printando aulas";
				
			    List<String> aulas = new ArrayList<>();
				aulas.add(aula1);
				aulas.add(aula2);
				aulas.add(aula3);
				
				System.out.println(aulas);
				
				System.out.println("");
				System.out.println("Excluindo elementos");
				aulas.remove(1);
				System.out.println(aulas);
				
				System.out.println();
				System.out.println("Imprimindo pelo forEach");
				
				for(String p : aulas) {
					System.out.println(p);
				}
				
				System.out.println();
				System.out.println("Acesando Elementos");
				
				String acessando = aulas.get(2);
				System.out.println("Acessando elemento da posição 2: " + "["+ acessando+"]");
			
				System.out.println();
				System.out.println("Acesando Elementos pelo for");
				for (int i = 0; i < aulas.size(); i++) {
				    System.out.println("aula : " + aulas.get(i));
				}
				
				System.out.println();
				System.out.println("Removendo elemento M");
				aulas.removeIf(x -> x.charAt(0) == 'M');
				for(String a : aulas) {
					 System.out.println("aula : " + a);
				}

	}
}

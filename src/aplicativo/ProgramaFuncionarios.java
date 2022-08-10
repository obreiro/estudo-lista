package aplicativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.FuncionarioTercerizado;
import entidades.Funcionarios;

public class ProgramaFuncionarios {

	public static void main(String[] args) {
		
     Scanner scan = new Scanner(System.in);
     
     List<Funcionarios> lista = new ArrayList<>();

     System.out.println("Entre com numero de funcionarios: ");
     int num = scan.nextInt();
     scan.nextLine();
     for(int i=0; i<num; i++) {
    	   scan.nextLine();
    	 System.out.println("Funcionário #" + (i+1) + " Informação"); 
    	 System.out.print("Funcionário terceirizado? "); 
    	 String l = scan.nextLine();
    	 if(l.equalsIgnoreCase("n")) {
    		 System.out.print("Entrar com nome: ");
    		 String nome = scan.nextLine();
    		 System.out.print("Entrar com hora: ");
    		 Integer hora = scan.nextInt();
    		 System.out.print("Entrar com hora valor: ");
    		 Double horaValor = scan.nextDouble();
    		 
    		 Funcionarios f = new Funcionarios(nome, hora, horaValor);
    		 lista.add(f);
    	 } else {
    		 System.out.print("Entrar com nome: ");
    		 String nome = scan.nextLine();
    		 System.out.print("Entrar com hora: ");
    		 Integer hora = scan.nextInt();
    		 System.out.print("Entrar com hora valor: ");
    		 Double horaValor = scan.nextDouble();
    		 System.out.print("Valor adicional: ");
    		 Double adicional = scan.nextDouble();
    		 FuncionarioTercerizado ft = new FuncionarioTercerizado(nome, hora, horaValor, adicional);
    		 lista.add(ft);
    	 }
     }
     System.out.println("Pagamentos:");
	 for(Funcionarios x : lista) {
		 System.out.println(x);
	 }
	}

}

package redesDeComputadores;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Administracao 
{
	
	static Scanner sc;
	static RedeDeComputadores lista;

	public static void main(String[] args)
	{
		
		lista = new RedeDeComputadores();
		sc = new Scanner(System.in);
		int usuario;
		
		usuario = menu();
		while (usuario != 0) 
		{
			opcoes(usuario);
			usuario = menu();
		}
	}
			
		static int menu ()
		{
			System.out.printf("\n \t----- Lista de Op��es -----\n\n");
			System.out.println("1 - Ver lista de computadores de uma s� marca");
			System.out.println("2 - Ver lista de computadores de um s� modelo");
			System.out.println("3 - Ver lista de computadores por data de aquisi��o");
			System.out.println("4 - Quantidade de computadores adquiridos apos a data informada");
			System.out.println("5 - Adicionar computador");
			System.out.println("0 - Para sair");
			System.out.printf("\n\n");
			return sc.nextInt();
		}
		
	static void opcoes(int usuario) 
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		switch (usuario) 
		{
		case 1:
			System.out.println("Digite a marca:");
			String marcacomp = sc.next();
			System.out.printf("\n \t----- Resultados encontrados -----\n\n");
			lista.listaComputadoresPorMarca(marcacomp);
			
			break;

		case 2:
			System.out.println("Digite o modelo:");
			String modelo = sc.next();
			System.out.printf("\n \t----- Resultados encontrados -----\n\n");
			lista.listaComputadoresPorModelo(modelo);
			
			break;

		case 3:
			
			
		case 4:
			System.out.println("Formato da data: dd/mm/yyyy");
			String data = sc.next();
			LocalDate date = LocalDate.parse(data, formatter);
			System.out.printf("\n \t----- Resultados encontrados -----\n\n");
			System.out.println(lista.qtdComputadoresAdquiridosAposData(date));
			break;
			
		case 5:
			Computador comp = new Computador();
			System.out.println("Digite o ip do computador");
			comp.setIp(sc.next());
			
			System.out.println("Digite a marca do computador");
			comp.setMarca(sc.next());
			
			System.out.println("Digite o modelo do computador");
			comp.setModelo(sc.next());
			
			System.out.println("Digite a data da compra do computador no formato de data: dd/mm/yyyy");
			String datal = sc.next();
			
			comp.setDataAquisicao(LocalDate.parse(datal, formatter));
			lista.adicionaComputadorNaLista(comp);
			
			break;
		case 0:
			break;
		}
	}
}

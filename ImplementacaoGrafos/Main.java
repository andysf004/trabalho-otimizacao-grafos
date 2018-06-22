package listaAdj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int u, v; 
		Scanner sc = new Scanner(System.in);
		try {
			FileReader arquivo = new FileReader("\\\\ANDERSON\\Users\\Anderson\\eclipse-workspace\\listaAdj\\src\\listaAdj\\Grafos.txt");
			BufferedReader lerArquivo = new BufferedReader(arquivo);
			
			Grafo grafo = new Grafo(lerArquivo);
			ListaAdjacencia lista = new  ListaAdjacencia();
			
			lista.lerGrafo(grafo);//monta a lista adjacencia
			
			//fechando o arquivo
			arquivo.close();
			lerArquivo.close();
			
			//imprime a lista adjacencia
			System.out.println("Lista Adjac�ncia \n" + lista.formataSaidaLista(grafo));
			

			System.out.println("Digite a aresta a ser removida");
			u = sc.nextInt();
			v = sc.nextInt();
			lista.removeAresta(grafo, u, v);
			System.out.println("Lista Adjacência \n" + lista.formataSaidaLista(grafo));
			
			System.out.println("Digite a aresta a ser adicionada");
			u = sc.nextInt();
			v = sc.nextInt();
			lista.insere(grafo, u, v);
			lista.insere(grafo, v, u);
			System.out.println("Lista Adjacência \n" + lista.formataSaidaLista(grafo));
			
			//System.out.println("Digite o vertice a ser adicionado");
			//u = sc.nextInt();
			//grafo.L = new NoAresta[grafo.n++];
			//grafo.L = lista.insereVertice(grafo, u);
			//System.out.println("Lista Adjacência \n" + lista.formataSaidaLista(grafo));
			
			System.out.println("Digite o vertice para que seja mostrados seus vizinhos");
			u = sc.nextInt();
			lista.vizinhos(grafo, u);
			
			System.out.println("Digite o vertice a ser removido");
			u = sc.nextInt();
			lista.removeVertice(grafo, u);
			System.out.println("Lista Adjacência \n" + lista.formataSaidaLista(grafo));
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
}
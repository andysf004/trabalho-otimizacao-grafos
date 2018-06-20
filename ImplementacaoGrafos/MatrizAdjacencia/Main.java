package MatrizAdjacencia;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		try {
		FileReader arquivo = new FileReader("Grafos.txt");
		BufferedReader lerArquivo = new BufferedReader(arquivo);
		
		Grafo grafo = new Grafo(lerArquivo);
		MatrizAdjacencia matriz = new  MatrizAdjacencia();
		
		matriz.lerGrafo(grafo);//monta a matriz adjacencia
		
		//fechando o arquivo
		arquivo.close();
		lerArquivo.close();
		
		//imprime a matriz adjacencia
		System.out.println("Matriz Adjacência \n" + grafo.formataSaidaDaMatriz());
		
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
}

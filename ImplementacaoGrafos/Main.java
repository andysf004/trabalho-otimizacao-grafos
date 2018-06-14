import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		try {
		FileReader arquivo = new FileReader("Grafos.txt");
		BufferedReader lerArquivo = new BufferedReader(arquivo);
		
		Grafo grafo = new Grafo(lerArquivo.readLine());//lendo uma linha do arquivo e enviando para classe Grafos
		MatrizAdjacencia matriz = new  MatrizAdjacencia();
		
		matriz.lerGrafo(grafo);//mota a matriz adjacencia
		
		//fechando o arquivo
		arquivo.close();
		lerArquivo.close();
		//imprime a matriz adjacencia
		System.out.println(grafo.formataSaidaDaMatriz());
		
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
}

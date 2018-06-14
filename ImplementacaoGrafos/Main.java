import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		try {
		FileReader arquivo = new FileReader("Grafos.txt");
		BufferedReader lerArquivo = new BufferedReader(arquivo);
		
		Grafo grafos = new Grafo(lerArquivo.readLine());//lendo uma linha do arquivo e enviando para classe Grafos
		MatrizAdjacencia matriz = new  MatrizAdjacencia();
		
		matriz.lerGrafo(grafos);
		
		/*while(lerArquivo.read() == -1) { // enquanto não chegou no fim do arquivo
			if((char)lerArquivo.read() != '{' || ((char)lerArquivo.read()) != ',' || ((char)lerArquivo.read()) != ' ' ) {
				u = lerArquivo.read();
			}
		}*/
		//fechando o arquivo
		arquivo.close();
		lerArquivo.close();
		}catch(IOException ex){
			ex.printStackTrace();
		}
	
	}
}

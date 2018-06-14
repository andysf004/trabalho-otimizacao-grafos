
public class Grafo {
	String arestas;
	int n, m;
	int[][] M;
	public Grafo(String arestas) {
		this.arestas = arestas;
		obterDimensaoMatriz(this.arestas);
		M = new int[n][n];
	}
	
	private void obterDimensaoMatriz(String arestas) {
		int qntArestas = 0;
		//de acordo com a quantidade de chaves abertas no arquivo, se tem a quantidade de arestas do grafo que serão as dimensões da matriz
		for(int i = 0; i < arestas.length(); i++)
			//conta a quantidade de digitos numericos no arquivo
			if(Character.isDigit(arestas.charAt(i))) {
				qntArestas++;
			}
		n = qntArestas/2;//divide a quantidade de digitos numericos no arquivo para pegar quantidade de arestas do grafo
	}
	
	public String formataSaidaDaMatriz(){
		String saida=""; // Cria e inicializa uma String	
		for(int linha=0;linha<M.length;linha++){ //for para percorrer as linhas da matriz
			for(int coluna=0;coluna<M[0].length;coluna++){ //percorrer as colunas
                                //guardando na String cada elemento separado por um espaço
				saida= saida +M[linha][coluna] + " ";
			}
			saida = saida + "\n"; // Guarda uma quebra de linha na String
		}
		return saida; //retorna a String 
}
	
}

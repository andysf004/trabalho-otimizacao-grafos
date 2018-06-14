
public class Grafo {
	String arestas;
	int n, m;
	int[][] M;
	public Grafo(String arestas) {
		this.arestas = arestas;
		obterDimensaoMatriz(this.arestas);
		M = new int[n][m];
	}
	
	private void obterDimensaoMatriz(String arestas) {
		int qntArestas = 0;
		//de acordo com a quantidade de chaves abertas no arquivo, se tem a quantidade de arestas do grafo que serão as dimensões da matriz
		for(int i = 0; i < arestas.length(); i++)
			if(arestas.charAt(i) == '{') {
				qntArestas++;
				n = qntArestas;
				m = qntArestas;
			}
	}
}

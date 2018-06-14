
public class Grafo {
	String arestas;
	int n, m;
	int[][] M;
	public Grafo(String arestas) {
		this.arestas = arestas;
		M = new int[n][m];
		obterDimensaoMatriz(this.arestas);
	}
	
	private void obterDimensaoMatriz(String arestas) {
		int qntArestas = 0;
		for(int i = 1; i<=arestas.length(); i++)
			if(arestas.charAt(i) == '{') {
				qntArestas++;
				n = qntArestas;
				m = qntArestas;
			}
	}
}

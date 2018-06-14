
public class MatrizAdjacencia {
	
	public void lerGrafo(Grafo G) {
		int u = 0, v = 0;
		//for(int i = 1; i<= G.m; i++) {
			for(int j = 1; j<=G.arestas.length(); j++) {
				if(G.arestas.charAt(j) != '{' || G.arestas.charAt(j) != '}' || G.arestas.charAt(j) != ',' || G.arestas.charAt(j) != ' ') {
					u = G.arestas.charAt(j);
					j = j+2; 
					v = G.arestas.charAt(j);
					G.M[u][v] = 1; 
					G.M[v][u] = 1;
				}
			}
		//}
		
	}
}

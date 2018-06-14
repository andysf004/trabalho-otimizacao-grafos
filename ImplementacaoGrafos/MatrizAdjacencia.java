
public class MatrizAdjacencia {
	
	public void lerGrafo(Grafo G) {
		int u = 0, v = 0;
		//for(int i = 1; i<= G.m; i++) {
			for(int j = 0; j < G.arestas.length(); j++) {
				//se o que foi lido do arquivo não for esses caracteres então será a aresta do grafo
				if(Character.isDigit(G.arestas.charAt(j))) { 
						//|| G.arestas.charAt(j) == '}' || G.arestas.charAt(j) != ',' || G.arestas.charAt(j) != ' ') {
					u = Character.getNumericValue(G.arestas.charAt(j));
					j = j+2; 
					v = Character.getNumericValue(G.arestas.charAt(j));
					G.M[u-1][v-1] = 1; //foi preciso subtrair um pois o array jo java começa a contar a partir do indice 0
					G.M[v-1][u-1] = 1;
				}
			}
		//}
	}
}

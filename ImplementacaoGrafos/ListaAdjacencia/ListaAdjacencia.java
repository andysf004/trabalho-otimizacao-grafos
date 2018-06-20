package ListaAdjacencia;

public class ListaAdjacencia {
	   
	protected void lerGrafo(Grafo G){
		int u,v;
	   	
		for(int j = 0; j < G.arestas.length(); j++) {	
			//ler u e v
			if(Character.isDigit(G.arestas.charAt(j))) { 			
				u = Character.getNumericValue(G.arestas.charAt(j)); 			
				j = j+2; 				
				v = Character.getNumericValue(G.arestas.charAt(j)); 
				
				insere(G.L[u-1], v);
				insere(G.L[v-1], u);
				
			}
		}
	}
	  
	protected void insere(NoAresta L, int vizinho){
		NoAresta novo = new NoAresta();
		novo.vizinho = vizinho;
		novo.prox = L;
		L = novo;
		
		//System.out.println("Vizinho = " + novo.vizinho + "\n" + "Próximo = " + novo.prox + "\n" + "L = " + L);
		
	}
	
	protected String formataSaidaLista(Grafo G) {
		String saida=""; // Cria e inicializa uma String
		
		for(int i = 0; i < G.L.length; i++){ //for para percorrer as linhas da matriz
			saida = saida +G.L[i] + " ";
			saida = saida + "\n"; // Guarda uma quebra de linha na String
		}
		return saida; //retorna a String 
	}
	   	
}

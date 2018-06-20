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
				
				insere(G, u-1, v);
				insere(G,v-1, u);
				
			}
		}
	}
	  
	protected void insere(Grafo G, int indice, int vizinho){
	//	L = new NoAresta();
		
		NoAresta novo = new NoAresta();
		novo.vizinho = vizinho;
		novo.prox = G.L[indice];
		G.L[indice] = novo;
		
		//System.out.println("L = " + G.L[indice]+"\nVizinho = " + novo.vizinho + "\n" + "Próximo = " + novo.prox + "\n");
		
	}
	
	protected String formataSaidaLista(Grafo G) {
		String saida=""; // Cria e inicializa uma String
		
		for(int i = 0; i < G.L.length; i++){ 
			saida = saida +G.L[i].vizinho + " ";
			saida = saida + "\n"; // Guarda uma quebra de linha na String
		}
		return saida; //retorna a String 
	}
	   	
}

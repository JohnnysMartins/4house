package grafos;

import java.util.ArrayList;
import java.util.List;

public class TestDijkstra {
	private static List<Vertice> vertices = new ArrayList<Vertice>();
	private static List<Aresta> arestas = new ArrayList<Aresta>();
	
	public static void main (String[] args){
		for (int i = 0; i < 6; i++) {
			vertices.add(new Vertice(i+1));
		}
		
		addAresta(1, 3, 1);
		addAresta(0, 2, 2);
		addAresta(1, 2, 3);
		addAresta(1, 3, 4);
		addAresta(1, 4, 5);
		addAresta(2, 4, 6);
		addAresta(3, 4, 7);
		addAresta(3, 5, 8);
		addAresta(4, 5, 9);
		
		Dijkstra dijkstra = new Dijkstra(arestas, vertices);
		dijkstra.executar(vertices.get(0));
		
		for (int i = 0; i < 6; i++) {
			List<Vertice> caminho = dijkstra.getCaminho(vertices.get(i));
			if(!caminho.isEmpty()) {
				for (Vertice v : caminho) {
					System.out.print(v.getId() + "->");
					}
				System.out.println();
			}
		}
	}
	
	private static void addAresta (int v1Id, int v2Id, int w) {
		arestas.add (new Aresta(vertices.get (v1Id), vertices.get(v2Id),w));
	}
        
	
	
}

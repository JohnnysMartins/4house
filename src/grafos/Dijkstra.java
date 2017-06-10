package grafos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Dijkstra {

	private final List<Aresta> arestas;
	private final List<Vertice> vertices;
	
	private Set<Vertice> resolvidos; //S
	private Set<Vertice> naoResolvidos; //Q
	private Map<Vertice, Vertice> predecessores; //pi[v]
	private Map<Vertice, Integer> distancias; //d[v]
	
	public Dijkstra(List<Aresta> arestas, List<Vertice> vertices) {
		this.arestas = new ArrayList<Aresta>(arestas);
		this.vertices = new ArrayList<Vertice>(vertices);
	}
	
	public void executar(Vertice source) {
		resolvidos = new HashSet<Vertice>();
		naoResolvidos = new HashSet<Vertice>();
		distancias = new HashMap<Vertice, Integer> ();
		predecessores = new HashMap<Vertice, Vertice> ();
		
		for (Vertice v : vertices) {				// para cada v e V
			distancias.put(v, Integer.MAX_VALUE);	// d[v] = infinito
			predecessores.put(v, null);				// pi[v] = null  
		}
		
		distancias.put(source, 0); // d[s] <- 0
		naoResolvidos.addAll(vertices); // Q <- V
		
		while (naoResolvidos.size() > 0) { // enquanto |Q| dif 0
			Vertice minimo = extrairMinimo(naoResolvidos); // u <- extrairMinimo (Q)
			resolvidos.add(minimo); // S <- S U u
			
			for (Vertice v: getAdjacentes(minimo)) { // para cada v Adj[u]
				if (distancias.get(v) > distancias.get(minimo) + getW(minimo, v)){
					distancias.put(v, distancias.get(minimo) + getW(minimo, v));
					predecessores.put(v, minimo);
				}
			}
		}
		
	}
	
	private Vertice extrairMinimo(Set<Vertice> vertices) {
		Vertice minimo = null;
		for(Vertice v : vertices) {
			if (minimo == null) {
				minimo = v;
			} else {
				if( distancias.get(v) < distancias.get(minimo)) {
					minimo = v;
				}
			}
		}
		naoResolvidos.remove(minimo);
		return minimo;
	 }

	private int getW (Vertice v1, Vertice v2){
		for (Aresta a : arestas){
			if ((a.getV1().equals(v1) && a.getV2().equals(v2))
					|| (a.getV2().equals(v1) && a.getV1().equals(v2))){
				return a.getW();
			}
		}
		return 0;
	}
	
	private List<Vertice> getAdjacentes(Vertice v) {
		List<Vertice> adjacentes = new ArrayList<Vertice>();
		for (Aresta a : arestas) {
			if (a.getV1().equals(v) && !resolvidos.contains(a.getV2())){
				adjacentes.add(a.getV2());
				} else if (a.getV2().equals(v) && !resolvidos.contains(a.getV1())) {
					adjacentes.add(a.getV1());
				}
			}
		return adjacentes;
	}
	
	public LinkedList<Vertice> getCaminho(Vertice alvo) {
		LinkedList<Vertice> caminho = new LinkedList<Vertice>();
		Vertice passo = alvo;
		
		if (predecessores.get(passo) == null) {
			return caminho;
		}
		caminho.add(passo);
		while (predecessores.get(passo) != null) {
			passo = predecessores.get(passo);
			caminho.add(passo);			
		}
		// Put it into the correct order
		Collections.reverse(caminho);
		return caminho;
	}
}

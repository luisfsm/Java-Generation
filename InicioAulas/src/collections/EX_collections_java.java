package collections;

import java.util.ArrayList;

public class EX_collections_java {

	public static void main(String[] args) {
		
		String nomes[] = {"Luis","Carlos","Roberto","Geizy","fernanda"};
		ArrayList<String> nome = new ArrayList<>();
		
		
		for(String i : nomes) {
			
			if(i.toLowerCase().contains("l")) {
				nome.add(i);
			}
			
		}
		
		for(String lista : nome ) {
			
			System.out.println(lista);
		}
	}

}

package deadlock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.security.AlgorithmConstraints;
import java.util.ArrayList;

public class Avoid {
	static ArrayList<Integer[]> alocation = new ArrayList<>();
	static ArrayList<Integer[]> max = new ArrayList<>();
	static int m;
	static int n;
	static void parse(String[] args) throws IOException{
		String caminho;
		try {
			caminho = args[0];
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
		BufferedReader br = new BufferedReader(new FileReader(new File("").getAbsolutePath() + "/" + caminho)); 
		while(br.ready()){ 
			String linha = br.readLine(); 
			String dados[] = linha.split("[,;]");
			m = dados.length -1;
			Integer[] p = new Integer[m];
			Integer[] mx = new Integer[m];
			if(dados[0].toLowerCase().equals("max")) {
				for(int i = 0; i< dados.length ; i++) {
					if(dados[i].toLowerCase().equals("max")) {
						Integer r = Integer.valueOf(dados[i]);
						mx[i] = r;
					}else {
						int r = Integer.valueOf(dados[i]);
						p[i] = r;
					}				
				} 
				
			}
			alocation.add(p);
			max.add(mx);
		}
		n = alocation.size();
		br.close(); 
	}

	public boolean baqueiro() {
		int[] Avaliable = new int[m];
		int[][] Max = new int[n][m];
		int[][] Alocation = new int[n][m];
		int[][] Need = new int[n][m];
		
		//init
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				Avali
			}
		}
		
		
		Integer[] work = new Integer[m];
		boolean[] finish = new boolean[n];
		return false;
		
	}
	public static void main(String[] args) {
		
	}
}

package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex9086 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i =0; i<T; i++) {
			String x =br.readLine();
			System.out.println(String.valueOf(x.charAt(0))+String.valueOf(x.charAt(x.length()-1)));
			
		}
	}

}

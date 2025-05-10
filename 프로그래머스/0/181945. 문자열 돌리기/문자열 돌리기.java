import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer((br.readLine()));
		String a = st.nextToken();
		
		for (int i = 0; i < a.length(); i++) {
			char b = a.charAt(i);
			System.out.println(b);
		}

	}

}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer((br.readLine()));
		String a = st.nextToken();
		
		String answer = "";
		
		for(int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if(Character.isUpperCase(c)) {
				answer += Character.toLowerCase(c);
			} else {
				answer += Character.toUpperCase(c);
			}
		}
		
		System.out.println(answer);

	}

}
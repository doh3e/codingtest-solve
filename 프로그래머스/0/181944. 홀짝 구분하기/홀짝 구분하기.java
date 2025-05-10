import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine().strip());
		String result = "";
		if(a % 2 == 0) {
			result = " is even";
		} else {
			result = " is odd";
		}
		
		System.out.println(a + result);
	}

}
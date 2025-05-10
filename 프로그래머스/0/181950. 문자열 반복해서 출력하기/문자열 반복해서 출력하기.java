import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public void solution() throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer((br.readLine()));
		String a = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a.repeat(b));
		
	}
	
	public static void main(String[] args) throws Exception {
		
		new Main().solution();

	}

}
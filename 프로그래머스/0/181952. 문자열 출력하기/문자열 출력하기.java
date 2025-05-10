import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public void solution() throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer((br.readLine()));
		String a = st.nextToken();
		
		System.out.println(a);
		
	}
	
	public static void main(String[] args) throws Exception {
		
		new Main().solution();

	}

}
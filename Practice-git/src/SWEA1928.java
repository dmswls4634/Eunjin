import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class SWEA1928 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] ans=new String[num];
		
		for(int i=0;i<num;i++) {
			String str = br.readLine();
			byte[] target = str.getBytes("UTF-8");

			Decoder decoder = Base64.getDecoder();
			byte[] decoded = decoder.decode(target);
			
			ans[i]=new String(decoded);
		}
		
		for(int i=0;i<num;i++) {
			System.out.println("#"+(i+1)+" "+ans[i]);
		}
	}
}

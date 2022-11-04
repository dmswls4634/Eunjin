import java.util.*;
import java.io.*;

public class SWEA1206 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int []arr=new int[4];
		int []arr2=new int[10];	
		int total=0;
		
		for(int j=0;j<10;j++) {
			int num = Integer.parseInt(br.readLine());
			String [] str = br.readLine().split(" ");
			for(int i=2;i<num-1;i++) {
				
				if(Integer.parseInt(str[i])>Integer.parseInt(str[i+1])&&Integer.parseInt(str[i])>Integer.parseInt(str[i+2])&&Integer.parseInt(str[i])>Integer.parseInt(str[i-1])&&Integer.parseInt(str[i])>Integer.parseInt(str[i-2])) {
					arr[0] = Integer.parseInt(str[i])-Integer.parseInt(str[i+1]);
					arr[1]=Integer.parseInt(str[i])-Integer.parseInt(str[i+2]);
					arr[2]=Integer.parseInt(str[i])-Integer.parseInt(str[i-1]);
					arr[3]=Integer.parseInt(str[i])-Integer.parseInt(str[i-2]);
					Arrays.sort(arr);
					total+=arr[0];
					i=i+2;
				}
			}
			System.out.println(total);
			arr2[j]=total;
			System.out.println(j+" "+total);
			total=0;
			System.out.println(total);
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("#"+(i+1)+" "+ arr2[i]);
		}		
	}
}

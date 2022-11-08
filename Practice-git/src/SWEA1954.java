import java.util.*;
import java.io.*;

public class SWEA1954 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int [] n = new int[num];
		for(int i=0;i<num;i++) {
			n[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<num;i++) {
			
			int [][] arr = new int[n[i]][n[i]];
			
			int data=1;
			int x=0;
			int y=-1;
			int w=n[i];
			int h=n[i]-1;
			
			while(data<=(n[i]*n[i])) {
				for(int a=0; a<w; a++) {
					arr[x][++y] = data;
					data++;
				}
				w--;
				
				for(int a=0; a<h; a++) {
					arr[++x][y]=data;
					data++;
				}
				h--;
				
				for(int a=0; a<w; a++) {
					arr[x][--y]=data;
					data++;
				}
				w--;
				
				for(int a=0; a<h; a++) {
					arr[--x][y]=data;
					data++;
				}
				
				h--;
				
			}
			System.out.println("#"+(i+1));
			
			for(int k=0;k<n[i];k++) {
				for(int g=0;g<n[i];g++) {
					System.out.print(arr[k][g]+" ");
				}
				System.out.println("");
			}
		}
	}
}

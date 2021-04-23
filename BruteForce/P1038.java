import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

// 백준 - 감소하는 수
// 브루트포스 알고리즘 / 백트래킹
public class P1038{
	static int N;
	

	
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("E:\\WebProject\\newworkspace\\algo\\input\\P1038.txt"));
				
		Scanner sc = new Scanner(System.in);		
		N = sc.nextInt(); // 0<= N <= 1,000,000
		int cnt = 0;
		long val = 0;
		long num = 10;
		
		if(N == 0) { // 0번째면 0
			val = 0;
		} else if(N < 10) { //한자리수 번째 이면 그대로
			val = N;
		} else {
			cnt = 9;
			
			while(true) {
				
				String tmp = String.valueOf(num);
				
				boolean flag = true;
				for(int j=0;j < tmp.length()-1;j++) {
					if(tmp.charAt(j) <= tmp.charAt(j+1)) {
						flag = false;
						break;
					}
				}
				
				if(flag)
					cnt++;
				
				if(cnt == N) {
					val = num;
					break;
				}
				num++;
						
			}
		}
		
		System.out.println(val);
		sc.close();
	}
	
}

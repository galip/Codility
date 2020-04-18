package lesson3;

public class FrogJmp {
	public static void main(String args[]) {
		FrogJmp frogJmp = new FrogJmp();
		int result = frogJmp.solution(10, 95, 30);
		System.out.println(result);
	}
	
	public int solution(int X, int Y, int D) {
		int jumpCount = 0;
		int distance = Y - X;
		
		int mod = distance % D;
		jumpCount = distance / D;
		
		if(mod != 0) {
			jumpCount++;
		}
		return jumpCount;
	}
}
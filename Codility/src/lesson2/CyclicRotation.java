package lesson2;

public class CyclicRotation {
	public static void main(String args[]) {

		int[] array = { 2, 4, 6, 7 };
		int rotationCount = 3;

		int arr[] = solution(array, rotationCount);

		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j]);
		}
	}

	public static int[] solution(int[] A, int K) {
		int tmp;
		int length = A.length;
		
		if(length != 0) {
			for (int i = 0; i < K; i++) {
				length = A.length;
				int count = length - 1;
				tmp = A[length - 1];
				while (count > 0) {
					A[count] = A[count - 1];
					count--;
				}
				A[count] = tmp;
			}
		}
		return A;
	}
}
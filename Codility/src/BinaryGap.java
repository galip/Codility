import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryGap {
	public static void main(String args[]) {
		
		BinaryGap binaryGap = new BinaryGap();
		int maxDistance = binaryGap.solution(17);
		
		System.out.println(maxDistance);
		
	}
	
	public int solution(int number) {
		int lastDigit;
		StringBuffer sb = new StringBuffer();
		
		while(number > 1) {
			
			lastDigit = number % 2;
			number = number / 2;
			sb.append(lastDigit);
			if(number == 1) {
				sb.append(number);
			}
		}
		
		String str[] = sb.reverse().toString().split("");
		
		List<String> stringList = new ArrayList<String>();
		stringList = Arrays.asList(str);
		
		int length = stringList.size();
		int counter = 0;
		int maxDistanceCount = 0;
		
			int i = 0;
			while(length > i && length > 2) {
				if(!stringList.get(i).equals("1")) {
					counter++;
					
					
					if(counter > maxDistanceCount) {
						if(length > (i+1) && stringList.get(i+1).equals("1"))
							maxDistanceCount = counter;
					}
				} else {
					counter = 0;
				}
				i++;
			}
			counter = 0;
		
		return maxDistanceCount;
	}
	
	public static String convertToBinaryNumber(int number) {
		int lastDigit;
		StringBuffer sb = new StringBuffer();
		
		while(number > 1) {
			
			lastDigit = number % 2;
			number = number / 2;
			sb.append(lastDigit);
			if(number == 1) {
				sb.append(number);
			}
		}
		return sb.reverse().toString();
	}
	
	public static int findLongestDistanceBetweenOnes(List<String> stringList) {
		
		int length = stringList.size();
		int counter = 0;
		int maxCount = 0;
		
			int i = 0;
			while(length > i && length > 2) {
				if(!stringList.get(i).equals("1")) {
					counter++;
					
					
					if(counter > maxCount) {
						if(length > (i+1) && stringList.get(i+1).equals("1"))
						 maxCount = counter;
					}
				} else {
					counter = 0;
				}
				i++;
			}
			counter = 0;
		
		return maxCount;
	}
}
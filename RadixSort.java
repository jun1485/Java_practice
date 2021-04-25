package Algorithm;

public class RadixSort {
	public static void main(String[] args) {
		int[] data = {8,26,23,11,27,501,2,34,56,256};
		int max = 0;
		for(int i=1; i<data.length; i = i*10) {
			max = Math.max(data[i-1], data[i]);
			radixSort(data, data.length, max);
		}
	}
	static void radixSort(int[] data, int n, int max) {
		for(int i=1; (max/i) > 0; i=i*10) {
			countSort(data, n, i);
		}
	}
	
	static void countSort(int[] data, int n, int digit) {
		int[] temp = new int[n];
		int[] cnt = new int[10];
		
		System.out.println("\n\n" + digit + " 의 자리 정렬 전 값");
		for(int i=0; i<n; i++) {
			System.out.printf("%3d ", data[i]);
		}

		for(int i=0; i<=9; i++) {
			cnt[i] = cnt[i] + cnt[i-1];
		}
		
		for(int i=n-1; i>=0; i--) {
			int cntValue = (data[i]/digit) % 10;
			int newIdx = cnt[cntValue]-1;
			temp[newIdx] = data[i];
			cnt[cntValue]--;
		}
		
		for(int i=0; i<n; i++) {
			data[i] = temp[i];
		}
		
		System.out.println("\n\n" + digit + "의 자리 정렬 후 값");
		for(int i=0; i<n; i++) {
			System.out.printf("%3d", data[i]);
		}
	}
}

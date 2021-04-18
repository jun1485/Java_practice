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

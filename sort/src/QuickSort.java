
/**
 * 快速排序（Quicksort）是对冒泡排序的一种改进,考虑数据已有顺序，快排是一种不稳定的排序（当然可以改进），对于大部分排好的数据，快排会浪费大量不必要的步骤.
 * 数据量极小，而且已经基本排好序，冒泡是最佳选择。我们说快排好，是指大量随机数据下，快排效果最理想。而不是所有情况。
 * 平均时间复杂度为：：T(n)=O(nlogn).空间复杂度: 快速排序为时间复杂度O(nlogn)，空间复杂度O(logn)，不稳定排序
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,2,1,6,7,3,22,11,55};
		sort(arr,0,arr.length-1);
		for(int i : arr){
			System.out.println(i);
		}
	}

	public static void sort(int[] arr,int left,int right){
		int l = left;
		int r = right;
		int middle = (l+r)/2;
		int temp=arr[middle];
		while(l<=r){
			while(arr[l]<temp&&l<middle){
				l++;
			}
			while(arr[r]>temp&&r>middle){
				r--;
			}
			if(l<=r){
				int t = arr[l];
				arr[l]=arr[r];
				arr[r]=t;
				l++;
				r--;
			}
		}
		if(left<r){
			sort(arr,left,r);
		}
		if(right>l){
			sort(arr,l,right);
		}
	}

}

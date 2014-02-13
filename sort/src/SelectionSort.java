/**
 * 时间复杂度为O(n2),空间复杂度1，不稳定排序
 * @author Administrator
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {9,2,1,6,7,3,22,11,55};
		sort(arr);
		for(int i : arr){
			System.out.println(i);
		}
	}
	public static void sort(int[] arr){
		int length = arr.length;
		for(int i=0;i<length;i++){
			int temp = arr[i];
			int index = i;
			for(int j=i+1;j<length;j++){
				if(temp>arr[j]){
					temp=arr[j];
					index=j;
				}
			}
			arr[index]=arr[i];
			arr[i]=temp;
		}
	}
}

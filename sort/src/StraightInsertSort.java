/**
 * 时间复杂度为O(n2)，空间复杂度为1，稳定排序
 * @author Administrator
 *
 */
public class StraightInsertSort {

	/**
	 * @param args
	 */
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
		for(int i=1;i<length;i++){
			int temp = arr[i];
			int j=i;
			for(;j>0;j--){
				if(arr[j-1]>temp){
					arr[j]=arr[j-1];
				}else{
					break;
				}
			}
			arr[j]=temp;
		}
	}
}

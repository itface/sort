/**
 * ʱ�临�Ӷ�O(n2)���ռ临�Ӷ�1,���ȶ���
 * @author Administrator
 *
 */
public class ShellSort {

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
		for(int i=length/2;i>0;i=i/2){
			for(int j=i;j<length;j++){
				int temp = arr[j];
				int k=j;
				for(;k-i>=0;k-=i){
					if(arr[k-i]>temp){
						arr[k] = arr[k-i];
					}else{
						break;
					}
				}
				arr[k]=temp;
			}
		}
	}
}

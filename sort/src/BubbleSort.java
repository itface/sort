
/**
 * ʱ�临�Ӷ�ΪO(n2),�ռ临�Ӷ�1���ȶ�����
 * @author Administrator
 *
 */
public class BubbleSort {

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
		for(int i=0;i<length;i++){
			int temp = arr[i];
			for(int j=i+1;j<length;j++){
				if(temp>arr[j]){
					arr[i]=arr[j];
					arr[j]=temp;
					temp=arr[i];
				}
			}
		}
	}
}

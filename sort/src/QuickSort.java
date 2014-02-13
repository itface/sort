
/**
 * ��������Quicksort���Ƕ�ð�������һ�ָĽ�,������������˳�򣬿�����һ�ֲ��ȶ������򣨵�Ȼ���ԸĽ��������ڴ󲿷��źõ����ݣ����Ż��˷Ѵ�������Ҫ�Ĳ���.
 * ��������С�������Ѿ������ź���ð�������ѡ������˵���źã���ָ������������£�����Ч�������롣���������������
 * ƽ��ʱ�临�Ӷ�Ϊ����T(n)=O(nlogn).�ռ临�Ӷ�: ��������Ϊʱ�临�Ӷ�O(nlogn)���ռ临�Ӷ�O(logn)�����ȶ�����
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

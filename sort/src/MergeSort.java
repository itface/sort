
/**
 * 	所需辅助空间最多：归并排序,时间复杂度为O(nlogn)，空间复杂度为O(n)，稳定排序
 * @author Administrator
 *
 */
public class MergeSort {

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

	public static void sort(int[] arr,int start,int end){
		if(start<end){
			int part = (end+start)/2;
			sort(arr,start,part);
			sort(arr,part+1,end);
			merge(arr,start,end,part);
		}
		
	}
	public static void merge(int[] arr,int start,int end,int part){
		int l=0;
		int r=0;
		int[] left = new int[part-start+1];
		int[] right = new int[end-part];
		for(int i=start;i<=part;i++){
			left[l]=arr[i];
			l++;
		}
		for(int i=part+1;i<=end;i++){
			right[r]=arr[i];
			r++;
		}
		l=0;
		r=0;
		int k=start;
		for(;l<left.length;){
			int temp = left[l];
			for(;r<right.length;){
				if(temp<right[r]){
					arr[k]=temp;
					k++;
					l++;
					break;
				}else{
					arr[k]=right[r];
					k++;
					r++;
				}
			}
			if(r==right.length){
				break;
			}
		}
		if(l==left.length){
			for(;r<right.length;r++){
				arr[k]=right[r];
				k++;
			}
		}else if(r==right.length){
			for(;l<left.length;l++){
				arr[k]=left[l];
				k++;
			}
		}
	}
}

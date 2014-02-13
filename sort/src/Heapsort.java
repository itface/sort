
/**
 * 堆排序，时间复杂度为O(nlogn)，空间复杂度为1，不稳定排序。
 * 对于n个关键字序列，最坏情况下每个节点需比较log2(n)次，因此其最坏情况下时间复杂度为nlogn。堆排序为不稳定排序，不适合记录较少的排序
 * @author Administrator
 *
 */
public class Heapsort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,4,3};
		sort(arr);
		for(int i : arr){
			System.out.println(i);
		}
	}

	/**
	 * 堆排序
	 * 
	 * */
	public static void sort(int[] a){
		int temp;
		initCreateHeap(a);
		for(int i = a.length - 1; i > 0; i --){
			temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			createHeap(a, i, 0);
		}
	}
	
	/**
	 * 将数组看成完全二叉树，建立最大堆
	 * */
	private static void initCreateHeap(int[] a){
		//从最后一层向上循环每一层，因为是二叉树，所以层数为0到(a.length-1)/2。
		for(int i = (a.length-1)/2; i >= 0; i --){
			createHeap(a, a.length,i);		
		}
		
	}
	
	
	private static void createHeap(int[] a,int n ,int p){
		int a1inum = 2 * p + 1;
		boolean currentIsMax = false;
		int temp = a[p];
		while(a1inum < n && !currentIsMax){
			if(a1inum < n -1 && a[a1inum] < a[a1inum+1]){
				a1inum ++;//记录左右节点最大的数组元素下标
			}
			
			if(temp > a[a1inum]){
				currentIsMax = true;
			}else{
				a[p] = a[a1inum];//将大者放到上移
				p = a1inum;
				a1inum = 2 * p + 1;
			}
		}
		
		a[p] = temp;
	}
}

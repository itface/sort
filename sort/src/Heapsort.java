
/**
 * ������ʱ�临�Ӷ�ΪO(nlogn)���ռ临�Ӷ�Ϊ1�����ȶ�����
 * ����n���ؼ������У�������ÿ���ڵ���Ƚ�log2(n)�Σ������������ʱ�临�Ӷ�Ϊnlogn��������Ϊ���ȶ����򣬲��ʺϼ�¼���ٵ�����
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
	 * ������
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
	 * �����鿴����ȫ����������������
	 * */
	private static void initCreateHeap(int[] a){
		//�����һ������ѭ��ÿһ�㣬��Ϊ�Ƕ����������Բ���Ϊ0��(a.length-1)/2��
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
				a1inum ++;//��¼���ҽڵ���������Ԫ���±�
			}
			
			if(temp > a[a1inum]){
				currentIsMax = true;
			}else{
				a[p] = a[a1inum];//�����߷ŵ�����
				p = a1inum;
				a1inum = 2 * p + 1;
			}
		}
		
		a[p] = temp;
	}
}

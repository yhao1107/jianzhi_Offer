package ��ת�������С����;

/*
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� ����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء� 
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 */
/*
 * ���ӣ�https://www.nowcoder.com/questionTerminal/9f3231a991af4f55b95579b44b7a01ba?f=discussion
��Դ��ţ����

���ö��ַ����������⣬
mid = low + (high - low)/2
��Ҫ�������������
(1)array[mid] > array[high]:
�������������array����[3,4,5,6,0,1,2]����ʱ��С����һ����mid���ұߡ�
low = mid + 1
(2)array[mid] == array[high]:
�������������array���� [1,0,1,1,1] ����[1,1,1,0,1]����ʱ��С���ֲ����ж���mid���
�����ұ�,��ʱֻ��һ��һ���� ��
high = high - 1
(3)array[mid] < array[high]:
�������������array����[2,2,3,4,5,6,6],��ʱ��С����һ������array[mid]������mid����
�ߡ���Ϊ�ұ߱�Ȼ���ǵ����ġ�
high = mid
ע�������и��ӣ��������ѯ�ķ�Χ���ֻʣ����������ômid һ����ָ���±꿿ǰ������
���� array = [4,6]
array[low] = 4 ;array[mid] = 4 ; array[high] = 6 ;
���high = mid - 1���ͻ�������� ���high = mid
������(1)��low = mid + 1�Ͳ������
 */
public class Solution {
	public int minNumberInRotateArray(int[] array) {
		if(array.length==0) {
			return 0;
		}
	    int low=0,high=array.length-1;
	    while(high>low) {
	    	int mid=(high+low)/2;
	    	if(array[mid]>array[high]) {
	    		low=mid+1;
	    	}else if(array[mid]==array[high]) {
	    		high=high-1;
	    	}else if(array[mid]<array[high]) {
	    		high=mid;
	    	}
	    }
	    
		return array[low];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,1,1,1,1,1,1,1,1,0,1,1};
		Solution s=new Solution();
		int Num=s.minNumberInRotateArray(a);
		System.out.println("����"+Num);

	}

}

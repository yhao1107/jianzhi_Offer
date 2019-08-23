package �����е������;

/*
 * �������е��������֣����ǰ��һ�����ִ��ں�������֣�
 * ���������������һ������ԡ�����һ������,�����������е�����Ե�����P��
 * ����P��1000000007ȡģ�Ľ������� �����P%1000000007
 * 
 * */
public class Solution {

		 public int InversePairs(int [] array) {
		            if(array==null || array.length<=0){
		                return 0;
		            }
		            int pairsNum=mergeSort(array,0,array.length-1);
		            return pairsNum;
		        }
		         
		        public int mergeSort(int[] array,int left,int right){
		            if(left==right){
		                return 0;  
		            }
		            int mid=(left+right)/2;
		            int leftNum=mergeSort(array,left,mid);
		            int rightNum=mergeSort(array,mid+1,right);
		            int Num=Sort(array,left,mid,right);
		            return (Num+leftNum+rightNum)%1000000007;
		        }
		         
			        public int Sort(int[] array,int left,int middle,int right){
			            int current1=middle;
			            int current2=right;
			            int current3=right-left;
			            int temp[]=new int[right-left+1];
			            int pairsnum=0;
			            while(current1>=left && current2>=middle+1){
			                if(array[current1]>array[current2]){
			                    temp[current3--]=array[current1--];
			                    pairsnum+=1;     //����ط���current2-middle��������
			                    if(pairsnum>1000000007)//��ֵ��������
			                    {
			                        pairsnum%=1000000007;
			                    }
			                }else{
			                    temp[current3--]=array[current2--];
			                }
			            }
			            while(current1>=left){
			                temp[current3--]=array[current1--];
			            }
			            while(current2>=middle+1){
			                temp[current3--]=array[current2--];
			            }
			            //����ʱ���鸳ֵ��ԭ����
			            int i=0;
			            while(left<=right){
			                array[left++]=temp[i++];
			            }
			            return pairsnum;
			        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution s=new Solution();
        int a[]= {1,2,3,4,5,6,7,0};
        
        int n=s.InversePairs(a);
        System.out.println(n);
	}

}

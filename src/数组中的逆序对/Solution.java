package 数组中的逆序对;

/*
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，
 * 则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
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
			                    pairsnum+=1;     //这个地方是current2-middle！！！！
			                    if(pairsnum>1000000007)//数值过大求余
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
			            //将临时数组赋值给原数组
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

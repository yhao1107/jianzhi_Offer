package �����е�·��;
/*
 * �����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����·�����ԴӾ����е�����һ�����ӿ�ʼ��
 * ÿһ�������ھ������������ң����ϣ������ƶ�һ�����ӡ����һ��·�������˾����е�ĳһ�����ӣ���֮�����ٴν���������ӡ� 
 * ���� a b c e s f c s a d e e ������3 X 4 �����а���һ���ַ���"bcced"��·����
 * ���Ǿ����в�����"abcb"·������Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ�������֮��·�������ٴν���ø��ӡ�
 */
public class Solution {
		public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
		    {
		        //��־λ����ʼ��Ϊfalse
		        boolean[] flag = new boolean[matrix.length];
		        for(int i=0;i<rows;i++){
		            for(int j=0;j<cols;j++){
		                 //ѭ��������ά���飬�ҵ�������str��һ��Ԫ�ص�ֵ���ٵݹ��ж������Ƿ��з���������----���ݷ�
		                 if(judge(matrix,i,j,rows,cols,flag,str,0)){
		                     return true;
		                 }
		            }
		        }
		        return false;
		    }
		     
		    //judge(��ʼ��������������i������������j�������������������������жϵ��ַ������ַ���������ʼΪ0�����ж��ַ����ĵ�һλ)
		    private boolean judge(char[] matrix,int i,int j,int rows,int cols,boolean[] flag,char[] str,int k){
		        //�ȸ���i��j����ƥ��ĵ�һ��Ԫ��תΪһά�����λ��
		        int index = i*cols+j;
		        //�ݹ���ֹ����
		        if(i<0 || j<0 || i>=rows || j>=cols || matrix[index] != str[k] || flag[index] == true)
		            return false;
		        //��k�Ѿ�����strĩβ�ˣ�˵��֮ǰ�Ķ��Ѿ�ƥ��ɹ��ˣ�ֱ�ӷ���true����
		        if(k == str.length-1)
		            return true;
		        //Ҫ�ߵĵ�һ��λ����Ϊtrue����ʾ�Ѿ��߹���
		        flag[index] = true;
		         
		        //���ݣ��ݹ�Ѱ�ң�ÿ���ҵ��˾͸�k��һ���Ҳ�������ԭ
		        if(judge(matrix,i-1,j,rows,cols,flag,str,k+1) ||
		           judge(matrix,i+1,j,rows,cols,flag,str,k+1) ||
		           judge(matrix,i,j-1,rows,cols,flag,str,k+1) ||
		           judge(matrix,i,j+1,rows,cols,flag,str,k+1)  )
		        {
		            return true;
		        }
		        //�ߵ��⣬˵����һ��·��ͨ����ԭ������������·��
		        flag[index] = false;
		        return false;
		    }
		    public static void main(String[] args) {
		    	//�˴�����
		    }

}

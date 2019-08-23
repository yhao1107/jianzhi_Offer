package �ַ���������;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 ��Ŀ����
����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С����������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
��������:
����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��
 * */
public class Solution {
	
	public ArrayList<String> Permutation(String str){
		 
        ArrayList<String> list = new ArrayList<String>();
        if(str!=null && str.length()>0){
            PermutationHelper(str.toCharArray(),0,list);
            Collections.sort(list);	//��list�����е��ַ�����������	           
        }
        return list;
    }
	//�ݹ���ã����ݷ�
    private void PermutationHelper(char[] chars,int i,ArrayList<String> list){
        if(i == chars.length-1){
        	//�ж��Ƿ��ظ���������ظ���浽list
        	if(!list.contains(String.valueOf(chars)))
                 list.add(String.valueOf(chars));
        }else{		           
            for(int j=i;j<chars.length;++j){
                    swap(chars,i,j);
                    PermutationHelper(chars,i+1,list);
                    swap(chars,i,j);
                
            }
        }
    }
 
    private void swap(char[] cs,int i,int j){
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }
	public static void main(String[] args) {
		Solution s_obj=new Solution();
		ArrayList<String> resultlist=s_obj.Permutation("dbacfe");		
		//���������
        Iterator<String> it = resultlist.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
            }

	}

}

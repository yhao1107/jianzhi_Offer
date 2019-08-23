package 字符串的排序;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 题目描述
输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
输入描述:
输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 * */
public class Solution {
	
	public ArrayList<String> Permutation(String str){
		 
        ArrayList<String> list = new ArrayList<String>();
        if(str!=null && str.length()>0){
            PermutationHelper(str.toCharArray(),0,list);
            Collections.sort(list);	//对list容器中的字符串进行排序	           
        }
        return list;
    }
	//递归调用，回溯法
    private void PermutationHelper(char[] chars,int i,ArrayList<String> list){
        if(i == chars.length-1){
        	//判断是否重复，如果不重复则存到list
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
		//迭代器输出
        Iterator<String> it = resultlist.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
            }

	}

}

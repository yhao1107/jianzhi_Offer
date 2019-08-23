package �������е���λ��;
/*
 * ��εõ�һ���������е���λ����������������ж�����������ֵ����ô��λ������������ֵ����֮��λ���м����ֵ��
 * ������������ж���ż������ֵ����ô��λ������������ֵ����֮���м���������ƽ��ֵ��
 * ����ʹ��Insert()������ȡ��������ʹ��GetMedian()������ȡ��ǰ��ȡ���ݵ���λ����
 */
import java.util.PriorityQueue;
import java.util.Comparator;
public class Solution {
    //С����
    private PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    //�󶥶�


private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(15, new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
});
    //��¼ż��������������
    int count = 0;
    //ÿ�β���С���ѵ��ǵ�ǰ�󶥶���������
    //ÿ�β���󶥶ѵ��ǵ�ǰС��������С����
    //������֤С�����е�����Զ���ڵ��ڴ󶥶��е���
    //��λ���Ϳ��Է���ش����ߵĸ�����л�ȡ��
    public void Insert(Integer num) {
        //����Ϊż���Ļ������Ȳ��뵽�󶥶ѣ�Ȼ�󽫴󶥶�������������С������
        if(count % 2 == 0){
            maxHeap.offer(num);
            int max = maxHeap.poll();
            minHeap.offer(max);
        }else{
            //����Ϊ�����Ļ������Ȳ��뵽С���ѣ�Ȼ��С��������С��������󶥶���
            minHeap.offer(num);
            int min = minHeap.poll();
            maxHeap.offer(min);
        }
        count++;
    }
    public Double GetMedian() {
        //��ǰΪż��������ȡС���Ѻʹ󶥶ѵĶѶ�Ԫ����ƽ��
        if(count % 2 == 0){
            return new Double(minHeap.peek() + maxHeap.peek())/2;
        }else{
            //��ǰΪ����������ֱ�Ӵ�С������ȡԪ�ؼ���
            return new Double(minHeap.peek());
        }
    }
}

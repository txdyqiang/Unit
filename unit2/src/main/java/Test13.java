import java.util.ArrayList;
public class Test13 {
    public static void yesefu(int totalNum,int countNum,int s) {
        //初始化人数
        ArrayList<Integer> start = new ArrayList<Integer>();
        for(int i=1;i<=totalNum;i++) {
            start.add(i);
        }
        int k = s;//从第s人开始计数
        while(start.size() > 0) {
            k = k + countNum;
            //第m人的索引位置
            k = k % (start.size()) - 1;
            //判断是否到队尾，即k的大小为start的大小，此时k为-1
            if(k < 0) {
                //如果到队尾了，则输出队尾元素
                System.out.print(start.get(start.size()-1)+" ");
                start.remove(start.size() - 1);
                k = 0;
            }else {
                //否则，直接输出k对应的元素
                System.out.print(start.get(k)+" ");
                start.remove(k);
            }

        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        yesefu(10,3,2);

    }

}

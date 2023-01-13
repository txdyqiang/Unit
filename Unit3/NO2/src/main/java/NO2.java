class queue{
    int [] que=null;
    int front=0;
    int count=0;
    public queue(int max){
        this.que = new int[max];
    }
    public boolean isEmpty(){
        if(count==0)
            return true;
        return false;
    }
    public String enqueque(int x){
        if(que.length>count){
            que[(front+count)%que.length]=x;
            count++;
            return "插入成功";
        }
        return "队列已满，插入失败";
    }
    public boolean outqueue(){
        if(count<=0){
            return false;
        }else{
            que[front]=0;
            front=(front+1)%que.length;
            count--;
            return true;
        }
    }
    public void queueTraverse() {  //输出队列

        String s = "";
        int i = this.front;

        if(this.front == (front+count)%que.length && count!=0) {
            s += que[i] + "\t";
            i = (i + 1) % que.length;
        }

        while (i != (front+count)%que.length) {
            s += que[i] + "\t";
            i = (i + 1) % que.length;
        }

        if(s.length() == 0) { //如果没有读取到元素，直接返回空字符串
            System.out.printf(s);
        }
        System.out.printf(s.substring(0,s.length()));
    }
}
public class NO2 {
    public static void main(String[] args) {
        queue q=new queue(5);
        q.enqueque(3);
        q.enqueque(3);
        q.enqueque(3);
        q.enqueque(3);
        q.enqueque(3);
        System.out.println(q.enqueque(3));
        q.queueTraverse();
    }
}

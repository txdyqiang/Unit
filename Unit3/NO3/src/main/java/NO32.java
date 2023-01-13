import java.util.Random;

class queue{
    int size;
    int front;
    int rear;
    int [] que;
    int item;
    public queue(int size){
        this.size=size+1;
        que=new int[this.size];
        front=rear=0;
    }
    public boolean enqueue(int t){
        if(((rear+1)%size)==front){
            System.out.printf("队列已满，溢出");
            return false;
        }
        que[rear]=t;
        rear=(rear+1)%size;
        return true;
    }
    public boolean dequeue(){
        if(front==rear){
            System.out.printf("空队列，出队失败");
            return false;
        }
        item=que[front];
        front=(front+1)%size;
        return true;
    }
}
public class NO32 {
    public static void main(String[] args) {
        stack S=new stack(10);
        queue q=new queue(10);
        for(int i=0;i<S.size;i++){
            Random r=new Random();
            S.push(r.nextInt(10));
        }
        System.out.printf("栈S中的元素为：");
        S.printStack();
        int a=S.top;
        for(int i=0;i<=a;i++){
            S.pop();
            q.enqueue(S.item);
        }
        for (int i=0;i<q.size-1;i++){
            q.dequeue();
            S.push(q.item);
        }
        System.out.printf("逆置后的栈S为：");
        S.printStack();
    }
}

class stack{
    int size;
    int top;
    int [] st;
    int item;
    public stack(int size){
        this.size=size;
        st=new int[size];
        top=-1;
    }
    public void clear(){
        top=-1;
    }
    public boolean push(int x){
        if(top==size-1){
            System.out.println("栈满溢出");
            return false;
        }else {
            st[++top]=x;
            return true;
        }
    }
    public boolean pop(){
        if(top==-1){
            System.out.println("栈为空，弹出失败");
            return false;
        }else {
            item=st[top--];
            return true;
        }
    }
    public void printStack(){
        for(int i=0;i<=top;i++){
            System.out.printf(st[i]+"\t");
        }
        System.out.println();
    }
}
class queue{
    int item;
    stack s1=new stack(10);
    stack s2=new stack(10);
    public void enqueue(int t){
        s1.push(t);
    }
    public void dequeue(){
        int a=s1.top;
        for(int i=0;i<=a;i++){
            s1.pop();
            s2.push(s1.item);
        }
        s2.pop();
        item=s2.item;
        int b=s2.top;
        for(int i=0;i<=b;i++){
            s2.pop();
            s1.push(s2.item);
        }
    }
    public void display(){
        for(int i=0;i<=s1.top;i++){
            System.out.printf(s1.st[i]+"\t");
        }
        System.out.println();
    }
    public boolean queue_empty(){
        if(s1.top==-1){
            System.out.println("队列为空");
            return true;
        }
        System.out.println("队列不为空");
        return false;
    }
}
public class SJ1 {
    public static void main(String[] args) {
        queue q=new queue();
        q.enqueue(4);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(1);
        q.enqueue(1);
        q.dequeue();
        q.dequeue();
        q.display();
        q.queue_empty();
    }
}

class InitQueue{

    private int [] queue = null;

    private int front = 0;

    private int rear = 0;

    private boolean empty = true; //true表示循环队列为空

    public InitQueue(int max) {
        this.queue = new int[max];
    }
    public void clearQueue() {
        this.front = 0;
        this.rear = 0;
        this.empty = true;
    }
    public int queueLength() {
        if (this.front == this.rear && this.empty == false) {
            return this.queue.length;
        }
        return (this.rear - this.front + this.queue.length) % this.queue.length;
    }
    public int [] getHead() {

        if (this.empty == true) {
            return null;
        }

        int [] i = new int[1];
        i[0] = queue[this.front];
        return i;
    }
    public boolean enQueue(int value) {

        if (this.empty == false && this.front == this.rear) {
            System.out.printf("队满，插入失败");
            return false;
        }
        this.queue[this.rear] = value;
        this.rear = (this.rear + 1) % this.queue.length;
        this.empty = false;
        return true;
    }
    public int [] deQueue() {

        if (this.empty == true) {
            return null;
        }

        int [] i = new int[1];
        i[0] = this.queue[this.front]; //获取队头元素

        this.front = (this.front + 1) % this.queue.length; //删除队头元素（front指针加一）

        if(this.front == this.rear) {  //如果循环队列变空，改变标志位
            this.empty = true;
        }
        return i;
    }
    public String queueTraverse() {  //输出队列

        String s = "";
        int i = this.front;

        if(this.front == this.rear && this.empty == false) {
            s += this.queue[i] + "\t";
            i = (i + 1) % this.queue.length;
        }

        while (i != this.rear) {
            s += this.queue[i] + "\t";
            i = (i + 1) % this.queue.length;
        }

        if(s.length() == 0) { //如果没有读取到元素，直接返回空字符串
            return s;
        }
        return s.substring(0,s.length());
    }

}
public class NO1 {
    public static void main(String[] args) {
        InitQueue queue=new InitQueue(10);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(3);
        queue.enQueue(3);
        queue.deQueue();
        queue.enQueue(6);
        String s= queue.queueTraverse();
        System.out.printf(s);;
    }
}
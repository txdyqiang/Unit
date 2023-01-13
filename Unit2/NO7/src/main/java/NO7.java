class NODE {      //构造一个节点的类
    public int data;
    public NODE next;
    public NODE(int data) {
        this.data = data;
        this.next = null;
    }
}
class ListNode {
    public NODE head;  //保存单链表的头节点的引用  代表的是整个链表的头 所以定义在这个地方
    public NODE last;
    //头插法
    public void addFirst(int data) {
        NODE node = new NODE(data);
        if (this.head == null) {
            this.head = node;
            last=node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        NODE node = new NODE(data);
        if (this.head == null) {
            this.head = node;
            last=node;
            return;
        }
        NODE cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
        last=node;
    }
    //打印链表
    public void display() {
        if(this.head == null) {
            System.out.println("The List is empty.");
            return;
        }
        NODE cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    //删除节点
    public void delete(NODE delNode){
        NODE newNode;
        NODE tmp;
        // 删除链表的第一个节点，只需要把链表首指针指向第二个节点即可
        if (head.data == delNode.data) {
            head = head.next;
        }
        else if (last.data==delNode.data) {
            newNode=head;
            tmp=head;
            while (newNode!=last){
                tmp=newNode;
                newNode=newNode.next;
            }
            tmp.next=null;
            last=tmp;
        }
        //删除链表内的中间节点：只要将删除节点的前一个节点指针指向要删除节点的下一个节点即可
        else {
            newNode = head;
            tmp = head;
            while (newNode.data != delNode.data) {
                tmp = newNode;
                newNode = newNode.next;
            }
            tmp.next = delNode.next;
        }
    }
}
public class NO7 {
    public static void main(String[] args) {
        ListNode list=new ListNode();
        list.addLast(4);
        list.addLast(4);
        list.addLast(4);
        list.addLast(4);
        list.addLast(4);
        list.addLast(4);
        list.addLast(4);
        list.addLast(7);
        list.addLast(7);
        list.display();
        NODE node=list.head;
        NODE n;
        for(;node!=null;node= n.next){
            if (node.data==node.next.data){
                n=node;
                list.delete(node.next);
            } else n=node;
        }
        list.display();
    }
}

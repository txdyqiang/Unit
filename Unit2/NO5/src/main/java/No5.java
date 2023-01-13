class NODE {      //构造一个节点的类
    public char data;
    public NODE next;
    public NODE(char data) {
        this.data = data;
        this.next = null;
    }
}
class ListNode {
    public NODE head;  //保存单链表的头节点的引用  代表的是整个链表的头 所以定义在这个地方
    public NODE last;
    //头插法
    public void addFirst(char data) {
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
    public void addLast(char data) {
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
public class No5 {
    public static void main(String[] args) {
        ListNode A=new ListNode();
        A.addFirst('0');
        A.addFirst('0');
        A.addFirst('0');
        A.addFirst('0');
        A.addFirst(' ');
        A.addFirst('-');
        A.addFirst('=');
        //A.addFirst('d');
        //A.addFirst('6');
        // A.addFirst('@');
        // A.addFirst('%');
        // A.addFirst('0');
        ListNode num=new ListNode();
        ListNode ch=new ListNode();
        ListNode el=new ListNode();
        NODE X=A.head;
        while (X!=null){
            if(X.data>='0'&&X.data<='9'){
                num.addFirst(X.data);
                X=X.next;
            } else if ((X.data>='a'&&X.data<='z')||(X.data>='A'&&X.data<='Z')) {
                ch.addFirst(X.data);
                X=X.next;
            }else {
                el.addFirst(X.data);
                X=X.next;
            }
        }
        A.display();
        num.display();
        ch.display();
        el.display();
    }
}
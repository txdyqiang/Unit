
public class Test12 {

    class Node {
        public String data;//结点值
        public Node next;//下一个元素

        public Node(String data) {
            this.data = data;
        }

        public void show() {
            System.out.print(data + " ");
        }
    }

    class LinkedList {
        public Node head;
        public int location;//结点位置

        //头插
        public void insertHeadNode(String data) {
            Node node = new Node(data);
            node.next = head;
            head = node;
        }

        public String NthNodeFromEnd(int m) {//查找倒数第m个结点
            Node pN = null;
            Node p = head;
            for (int count = 1; count < m; count++) {//1:先让p移动到第m个结点处
                if (p!= null) {
                    p= p.next;
                }
            }
            while (p!= null) {//2:pN开始移动
                if (pN == null) {
                    pN = head;
                } else {
                    pN = pN.next;
                }
                p= p.next;
            }
            if (pN!= null)
                return pN.data;
            return null;
        }

        //显示所有结点信息
        public void displayAllNodes() {
            Node curNode = head;
            while (curNode != null) {
                curNode.show();
                curNode = curNode.next;
            }
            System.out.println();
        }
    }
}

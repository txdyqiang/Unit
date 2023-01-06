import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        ListNode A=new ListNode();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入链表A的元素个数：");
        int a=scanner.nextInt();
        System.out.println("请升序输入链表A的元素值：");
        for(int i=0;i<a;i++){
            A.addLast(scanner.nextInt());
        }
        System.out.println("请分别输入min和max的值：");
        int min= scanner.nextInt();
        int max= scanner.nextInt();
        NODE B=A.head;
        while (B.data<=min) {
            B=B.next;
        }
        while (B.data<max) {
               NODE C=B;
               A.delete(B);
               if (C.next!=null)
               B=C.next;
               else break;
        }
        System.out.println("删除后的链表为：");
        A.display();
    }
}

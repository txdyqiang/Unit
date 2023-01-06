import java.util.Scanner;

public class Test4 {


    public static void main(String[] args) {
        ListNode A=new ListNode();
        ListNode B=new ListNode();
        ListNode C=new ListNode();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入链表A的元素个数：");
        int a=scanner.nextInt();
        System.out.println("请升序输入链表A的元素值：");
        for(int i=0;i<a;i++){
            A.addLast(scanner.nextInt());
        }
        System.out.println("请输入链表B的元素个数：");
        int b=scanner.nextInt();
        System.out.println("请升序输入链表B的元素值：");
        for(int i=0;i<b;i++){
            B.addLast(scanner.nextInt());
        }
        NODE A1=A.head;
        NODE B1=B.head;
        while (A1!=null&&B1!=null){
            if (A1.data< B1.data){
                C.addFirst(A1.data);
                A1=A1.next;
            }
            else {
                C.addFirst(B1.data);
                B1=B1.next;
            }
        }
        for(;A1!=null;A1=A1.next)
            C.addFirst(A1.data);
        for(;B1!=null;B1=B1.next)
            C.addFirst(B1.data);
        System.out.println("归并得到的降序链表C为");
        C.display();
    }
}

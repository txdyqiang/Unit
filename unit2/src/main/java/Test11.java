import java.util.Scanner;

public class Test11 {

    private class Node{
        private int data;
        private Node nextNode;
        Node(int data){
            this.data = data;
            this.nextNode = null;
        }
    }

    private Node lastNode;
    private Node firstNode;

    Test11(){
        this.lastNode = null;
        this.firstNode = null;
    }
    public void push(Node node){
        if(firstNode!=null){
            lastNode.nextNode = node;
            lastNode = node;
        }else{
            firstNode=lastNode=node;
        }
    }
    public void iterator(){
        Node startNode = firstNode;
        System.out.printf("初始链表为：");
        while(startNode!=null){
            System.out.print(startNode.data+" ");
            startNode = startNode.nextNode;
        }
        System.out.print("\n");
    }
    //非递归
    public void invert(Test11 test){
        Node node1 = test.firstNode;
        Node node2 = node1.nextNode;
        Node node3 = node2.nextNode;
        node1.nextNode = null;
        node2.nextNode = node1;
        do{
            node1 = node2;
            node2 = node3;
            node3 = node2.nextNode;
            node2.nextNode = node1;
            firstNode = node2;
        }while(test.firstNode!=test.lastNode);

    }


    public static void main(String[] args) {
        Test11 test = new Test11();
        for(int i=0;i<10;i++){
            test.push(test.new Node(i));
        }
        test.iterator();
        test.invert(test);
        System.out.printf("逆置链表为：");
        Node startNode = test.lastNode;
        while(startNode!=null){
            System.out.print(startNode.data+" ");
            startNode = startNode.nextNode;
        }
    }
}
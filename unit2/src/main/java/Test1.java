import java.util.Scanner;

class SqList{
    private final int DEFAULT_SIZE = 20;//初始数组分配容量
    private final int CREATE_SIZE = 1;  //每次扩容的增量

    private int[] list;
    private int size;  //数组容量

    public SqList() {
        this.list = new int[DEFAULT_SIZE];
        this.size = DEFAULT_SIZE;
    }
    public SqList(int[] head, int size) {
        this.list = head;
        this.size = size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setList(int[] list) {
        this.list = list;
    }
    public int[] getList() {
        return list;
    }
    public int getSize() {
        return size;
    }

    boolean insert(int e){
        capacityExpansion();  //看看是否需要扩容
        int count = 0;  //要后移的元素的个数
        int index = list.length-1-CREATE_SIZE;
        while (index >= 0 && e < this.list[index]){
            count++;
            index--;
        }
        if (this.list.length - (index + 1) >= 0){
            System.arraycopy(this.getList(),index+1,this.getList(),index+2,count);
        }
        this.list[index+1] = e;
        return true;
    }
    void capacityExpansion(){
        if (this.size <= this.list.length){  //没有空间了,必须扩容
            int[] newInt = new int[this.size + CREATE_SIZE];
            if (this.size >= 0) System.arraycopy(this.list, 0, newInt, 0, this.size);
            this.list = newInt;
            this.setSize(this.size + CREATE_SIZE);
        }
    }
}
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入顺序表的元素个数\t");
        int len = sc.nextInt();
        int[] list = new int[len];
        System.out.println("输入"+len+"个递增有序的数字");
        for (int i = 0;i < len;i++){
            list[i] = sc.nextInt();
        }
        SqList sqList = new SqList(list,len);
        System.out.println("原始顺序表元素");
        for (int e : sqList.getList()){
            System.out.print(e + "\t");
        }
        System.out.print("\n输入要插入的数据\t");
        int e = sc.nextInt();
        boolean judge = sqList.insert(e);
        if (judge){
            System.out.println("插入成功");
        }
        System.out.println("插入数据后的顺序表为");
        for (int x : sqList.getList()){
            System.out.print(x + "\t");
        }
    }
}


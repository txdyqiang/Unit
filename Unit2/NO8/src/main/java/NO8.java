class sqlist {
    private final int DEFAULT_SIZE = 0;
    private final int CREATE_SIZE = 1;
    private int[] list;
    private int size;  //数组容量

    public sqlist() {
        this.list = new int[DEFAULT_SIZE];
        this.size = 0;
    }

    public sqlist(int[] list, int size) {
        this.list = list;
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

    void capacityExpansion() {
        if (this.size >= list.length) {  //没有空间了,必须扩容
            int[] newInt = new int[this.list.length + CREATE_SIZE];
            if (this.size >= 0) System.arraycopy(this.list, 0, newInt, 0, this.size);
            this.list = newInt;
            //this.setSize(this.size + CREATE_SIZE);
        }
    }

    boolean insert(sqlist a, int e) {
        capacityExpansion();  //看看是否需要扩容
        list[list.length - 1] = e;
        a.setSize(a.getSize() + 1);
        return true;
    }
}
public class NO8 {
    public static void main(String[] args) {
        sqlist A = new sqlist();
        sqlist B = new sqlist();
        sqlist C = new sqlist();
        A.insert(A,1);
        A.insert(A,3);
        A.insert(A,5);
        A.insert(A,6);
        A.insert(A,9);
        A.insert(A,10);
        A.insert(A,11);
        A.insert(A,20);
        B.insert(B,2);
        B.insert(B,4);
        B.insert(B,7);
        B.insert(B,9);
        B.insert(B,12);
        B.insert(B,13);
        B.insert(B,18);
        System.out.printf("顺序表A:" + "\t");
        for (int x : A.getList()) {
            System.out.printf(x + "\t");
        }
        System.out.printf( "\n");
        System.out.printf("顺序表B:" + "\t");
        for (int x : B.getList()) {
            System.out.printf(x + "\t");
        }
        System.out.printf( "\n");
        int i = 0,j=0;
        while (i< A.getSize()&&j<B.getSize()){
            if(A.getList()[i]<B.getList()[j]){
                i++;
            } else if (A.getList()[i]>B.getList()[j]) {
                j++;
            }else {
                C.insert(C,A.getList()[i]);
                i++;
                j++;
            }
        }
        System.out.printf("顺序表A,B的并集为:" + "\t");
        for (int x : C.getList()) {
            System.out.printf(x + "\t");
        }
    }
}

class sqlist{
    private final int DEFAULT_SIZE = 1;
    private final int CREATE_SIZE = 1;
    private int[] list;
    private int size;  //数组容量
    public sqlist(){
        this.list=new int[DEFAULT_SIZE];
        this.size=0;
    }
    public sqlist(int[] list,int size){
        this.list=list;
        this.size=size;
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
    boolean insert(sqlist a,int e) {
        capacityExpansion();  //看看是否需要扩容
        list[list.length-1]=e;
        a.setSize(a.getSize()+1);
        return true;
    }
}
public class NO6 {
    public static void main(String[] args) {
        sqlist a=new sqlist();
        a.insert(a,5);
        a.insert(a,3);
        a.insert(a,45);
        a.insert(a,26);
        a.insert(a,58);
        a.insert(a,6);
        a.insert(a,0);
        a.insert(a,55);
        a.insert(a,90);
        int i=2;
        int k=10;
        int c=k;
        if(a.getSize()<i+k-1){
            System.out.printf("数组长度不满足要求，删除失败");
            return;
        }
        System.out.printf("原数组为："+ "\n");
        for (int x : a.getList()){
            System.out.printf(x + "\t");
        }
        System.out.printf( "\n");
        int [] newlist=new int[a.getSize()-k];
        for (int b=0;b<i-1;b++)
            newlist[b]=a.getList()[b];
        for (int b=i-1;b<newlist.length;b++){
            newlist[b]=a.getList()[i+c-1];
            c++;
        }
        System.out.printf("删除从第"+i+"个数据开始的"+k+"个元素后的数组为："+ "\n");
        for (int x : newlist){
            System.out.printf(x + "\t");
        }
    }
}
public class sqlist{
    private final int DEFAULT_SIZE = 20;
    private int[] list;
    private int size;  //数组容量
    public sqlist(){
        this.list=new int[DEFAULT_SIZE];
        this.size=DEFAULT_SIZE;
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
}
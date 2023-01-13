class stack{
    int size;
    int top ;
    int top2;
    int [] st;
    int item;
    public stack(int size){
        this.size=size;
        st=new int[size];
        top=-1;
        top2=size;
    }
    public boolean push(int x){
        if(top==top2-1){
            System.out.println("栈1满，入站失败");
            return false;
        }else {
            st[++top]=x;
            return true;
        }
    }
    public boolean push2(int x){
        if(top2==top+1){
            System.out.println("栈2满,入栈失败");
            return false;
        }
        st[--top2]=x;
        return true;
    }
    public boolean pop(){
        if(top==-1){
            System.out.println("栈1为空，弹出失败");
            return false;
        }else {
            item=st[top--];
            return true;
        }
    }
    public boolean pop2(){
        if(top2==size){
            System.out.println("栈2为空，弹出失败");
            return false;
        }else {
            item=st[top2++];
            return true;
        }
    }
    public void printStack1(){
        for(int i=0;i<=top;i++){
            System.out.printf(st[i]+"\t");
        }
        System.out.println();
    }
    public void printStack2(){
        for(int i=size-1;i>=top2;i--){
            System.out.printf(st[i]+"\t");
        }
        System.out.println();
    }
}
public class NO6 {
    public static void main(String[] args) {
        stack S=new stack(10);
        S.push(2);
        S.push(2);
        S.push(3);
        S.push(5);
        S.push(1);
        S.push2(1);
        S.push2(2);
        S.push2(2);
        S.push2(2);
        S.push2(2);
        S.push2(2);
        S.printStack1();
        S.printStack2();
    }

}

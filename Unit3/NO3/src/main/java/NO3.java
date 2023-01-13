import java.util.Random;

class stack{
    int size;
    int top;
    int [] st;
    int item;
    public stack(int size){
        this.size=size;
        st=new int[size];
        top=-1;
    }
    public void clear(){
        top=-1;
    }
    public boolean push(int x){
        if(top==size-1){
            System.out.println("栈满溢出");
            return false;
        }else {
            st[++top]=x;
            return true;
        }
    }
    public boolean pop(){
        if(top==-1){
            System.out.println("栈为空，弹出失败");
            return false;
        }else {
            item=st[top--];
            return true;
        }
    }
    public void printStack(){
        for(int i=0;i<=top;i++){
            System.out.printf(st[i]+"\t");
        }
        System.out.println();
    }
}
public class NO3 {
    public static void main(String[] args) {
        stack S=new stack(10);
        stack S1=new stack(10);
        stack S2=new stack(10);
        for(int i=0;i<S.size;i++){
            Random r=new Random();
            S.push(r.nextInt(10));
        }
        System.out.printf("栈S中的元素为：");
        S.printStack();
        int a=S.top;
        for(int i=0;i<=a;i++){
            S.pop();
            S1.push(S.item);
        }
        int b= S1.top;
        for(int i=0;i<=b;i++){
            S1.pop();
            S2.push(S1.item);
        }
        int c=S2.top;
        for(int i=0;i<=c;i++){
            S2.pop();
            S.push(S2.item);
        }
        System.out.printf("逆置后的栈S为：");
        S.printStack();
    }

}

public class NO10 {
    public static void main(String[] args) {
        char[] E = {'(','(','3','+','2',')','/','(','6','-','2',')'};
        for (char x : E) {
            System.out.printf(x + "");
        }
        System.out.printf( "\n");
        int i=0,j=0;
        while(i<E.length&&j>=0){
            if(E[i]=='('){
                j++;
                i++;
            } else if (E[i]==')') {
                j--;
                i++;
            }else i++;
        }
        if(j!=0){
            System.out.printf("括号配对失败");;
        }else System.out.printf("括号配对成功");
    }
}

public class Test2 {
    int i=0;
    String compare(sqlist A,sqlist B){
        sqlist A1=new sqlist(new int[A.getSize()], A.getSize());
        sqlist B1=new sqlist(new int[B.getSize()],B.getSize());
        for(i=0;i<Math.max(A.getSize(), B.getSize());i++){
            if(A.getList()[i]==B.getList()[i])
                i++;
        }
        for(int a=i;a<A.getSize();a++){
            int a1=0;
            A1.getList()[a1]=A.getList()[a];
            a1++;
        }
        for(int b=i;b<B.getSize();b++){
            int b1=0;
            B1.getList()[b1]=B.getList()[b];
            b1++;
        }
        if(A1.getList()!=null||B1.getList()!=null){
            if(A1.getList()[0]<B1.getList()[0])
                return "A<B";
            else return "A>B";
        }
        return "A=B";
    }

}

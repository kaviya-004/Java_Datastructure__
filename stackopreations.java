import java.util.Arrays;

class operations{
    int ref;
    public  operations() {
        this.ref = -1;
        this.array = new int[5];
    }

    int[] array;

public  boolean push(int value){
    if(ref==array.length){
        ref--;
        return false;
    }
    else{
        ref=ref+1;
        array[ref]=value;

    }
    return true;
}
public int pop(){
     int current=ref;
     array[ref]=0;
     ref=ref-1;
     return current;

}
public boolean isEmpty(){
    if(ref==-1){
        return true;

    }
    else{
        return false;
    }
}
@Override
public String toString() {
    return "operations [ref=" + ref + ", array=" + Arrays.toString(array) + "]";
}
}
public class stackoperation {
    
    public static void main(String[] args) {
     operations op=new operations();
     System.out.println(op.push(5));
     System.out.println(op.push(6));
     System.out.println(op.push(7));
     System.out.println(op);
     System.out.println(op.pop());
     System.out.println(op.pop());
     System.out.println(op.pop());
     System.out.println(op);
     System.out.println(op.isEmpty());

    }
}

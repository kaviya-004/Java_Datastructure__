import java.util.*;
public class missingno {
    public static void main(String[] args) {
         ArrayList<Integer> ls=new ArrayList<>();
         ls.add(1);
        ls.add(4);
        ls.add(3);
        ls.add(5);
        ls.add(6);
        for(int i=0;i<5;i++){
            System.out.println(ls.get(i));
        }
        int n=ls.size();
        int sumno=  n*(n+1)/2;
        int res=0;
        for(int i=0;i<ls.size()-1;i++){
            res=res+ls.get(i);
        }
        System.out.println("missing no:");
        int missingno=sumno-res;
        System.out.println(missingno);

    }
}

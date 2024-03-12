import java.util.*;

public class validparantheses {
    public static boolean isValid(String s){
     Stack<Character> stk=new Stack<>();
    ArrayDeque<Character> ls=new ArrayDeque<>(stk);
        for(char i:s.toCharArray()){
            if(i=='(')
            ls.push(')');
            else if(i=='[')
            ls.push(']');
            else if(i=='{')
            ls.push('}');
            else if (ls.isEmpty() || ls.pop() != i) 
                   return false;
         }
          return ls.isEmpty();    
        }

    
    public static void main(String[] args) {

        System.out.println("enter a string:");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
         if(isValid(str)){
            System.out.println("valid parantheses");
         }
         else{
            System.out.println("invalid paranthese");
         }

        
    }
}

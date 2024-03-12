import java.util.*;
class missingarray {
    
    public static void main(String[] args) {
        int[] nums=new int[]{1,3,4,5};
        int[] store=new int[nums.length+1]; // We need to add 1 to the length of the store array to account for the possibility of a missing number at the end
        for(int i:nums){
            store[i-1]=1; // Subtract 1 from 'i' to correctly access the elements of the 'store' array
        }
        for(int i=0;i<store.length;i++){
            if(store[i]==0){
                System.out.println("missingno:"+i);
            }
        }
        if(store[store.length-1]==0){
            System.out.println("missingno:"+(store.length-1));
        }
    }
}

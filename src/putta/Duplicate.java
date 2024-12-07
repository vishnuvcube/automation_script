package putta;

import java.util.HashMap;
import java.util.HashSet;

public class Duplicate {

    public static void main(String[] args) {
        int a[] = {10, 20, 50, 80, 70, 90,10,50};
        HashMap<Integer,Integer> result=new HashMap<Integer,Integer>(); 
        int count1=0;
        for (int i = 0; i < a.length; i++) {
         int count = 0;
			count1++;

		for(int j=0;j<a.length;j++) {
			
        	 if(a[i]==a[j]) {
        		count++; 
        	 }
         }
        if(count!=1) {
result.put( i,a[i]);// Here i= index number and a[i]= value present in that index 
        }

    }
        System.out.println(result +",count="+ count1);

}
}

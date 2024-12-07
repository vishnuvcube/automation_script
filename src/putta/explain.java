package putta;

import java.util.HashMap;

public class explain {

    public static void main(String[] args) {
        int a[] = {10, 20, 50, 80, 70, 90};
        int count = 0;
        HashMap<Integer,Integer> result=new HashMap<Integer,Integer>();
        for (int i = 0; i < a.length; i++) {
            count = count + 1;
            result.put(i, a[i]);
        }

        System.out.println(result +"total array count"+count);
    }
}

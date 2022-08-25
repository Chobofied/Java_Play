
//https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/

import java.util.ArrayList;
import java.util.List;

public class fib {

    public static List<Integer> fiber(List<Integer> lister){

        int y =lister.get(1);
        int x=5;

        lister.add(lister.get(lister.size()-2)+lister.get(lister.size()-1));

        if (lister.get(lister.size()-1)>1000)
            return lister;
        System.out.println(lister);
        return fiber(lister);

        //while (lister.get(lister.size()-1)<1000){
        //    lister.add(lister.get(lister.size()-2)+lister.get(lister.size()-1));
        //}
    }

    public static int[] fib2(int n){

        int f[]=new int[n+2];
        f[0]=0;
        f[1]=1;

        for (int i=1;i<n;i++){
            f[i+1]=f[i-1]+f[i];
        }
        return f;



    }



    
    
    public static void main(String[] args){
        List<Integer> lister = new ArrayList<Integer>();
        lister.add(1);
        lister.add(1);
        int[] fib_results=fib2(9);
        int[] mylist = {9,1,32,2,4,22};
        lister.get(0);
        List<Integer> results=fiber(lister);
        System.out.println(lister);



    }
}

import java.util.ArrayList;
import java.util.List;


class Animal {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
 

public class play {

    int x =5;
    int y;
    int years;
    String names;

    public play(int year, String name){
    years = year;
    names = name;
    }

    public static int[] fib(ArrayList<Integer> myarr){


        int test =myarr.get(0);
        int new_list[]=new int[5];
        new_list[0]=myarr.get(1);
        

        return new_list;
    }

    public static void main(String[] args){
        play inst = new play(22,"The_Best");
        System.out.println(inst.x);
        System.out.println(inst.years);
        System.out.println(inst.names);



        ArrayList<Integer> myarr = new ArrayList<Integer>();
        myarr.add(2);
        myarr.add(5);
        myarr.get(1);

        Animal test = new Animal();
        test.animalSound();


        //ArrayList<Integer> myarr_process = fib(myarr);
        int[] myarr_process = fib(myarr);

        List<Integer> myarr2 = new ArrayList<Integer>();



    }
}

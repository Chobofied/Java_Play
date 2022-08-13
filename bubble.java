import java.lang.reflect.Array;

public class bubble {

	public static int isUniqueChars(int str) {
		int news = str+6; 
        System.out.println(news);
		return news;
	}

    public static void test2(String[] a)
    {
    int news2=4;
    }

    public static int[] test(int[] mylist){
        //Array x = {5,4};
        int[] arr={5,6,7,8,9};
        return arr;

    }

    public static int[] run(int[] tosort){

        int[] sorted=tosort;

        int n=tosort.length;
        int z=tosort.length;


        for (int j=0;j<z-j-1;j++){
                
            for (int i=0;i<n-1;i++){
                if (sorted[i]>sorted[i+1]){
                    int temp = sorted[i+1];
                    sorted[i+1]=sorted[i];
                    sorted[i]=temp;
                }

            }

        }



        return sorted;
    }
	
	public static void main(String[] args) {
		int[] mylist = {9,1,32,2,4,22};
        int uu=3;
        int n = mylist.length;
        int [] sorted_arr = run(mylist);
        String[] arrayw = new String[4];
        test2(arrayw);
        int[] arry = test(mylist);
		for (int value : mylist) {
			System.out.println(value + ": " + isUniqueChars(value));
		}
	}

}
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
	
	public static void main(String[] args) {
		int[] mylist = {1,2,4};
        int uu=3;
        int n = mylist.length;
        String[] arrayw = new String[4];
        test2(arrayw);
        int[] arry = test(mylist);
		for (int value : mylist) {
			System.out.println(value + ": " + isUniqueChars(value));
		}
	}

}
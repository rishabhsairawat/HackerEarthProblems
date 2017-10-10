
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
             arr[i]=s.nextInt();
        }
	countSort(arr);
    }
    private static void countSort(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++){
			max=Math.max(max, arr[i]);
		}
		int aux[]=new int[max+1];
		for(int i=0;i<aux.length;i++){
			aux[i]=0;
		}
		for(int i=0;i<arr.length;i++){
			aux[arr[i]]++;
		}
		for(int i=0;i<aux.length;i++){
			if(aux[i]>0){
			    System.out.println(i+" "+aux[i]);
			}
		}
	}
}

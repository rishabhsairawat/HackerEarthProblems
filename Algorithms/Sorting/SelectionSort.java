import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int t=s.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
           arr[i]=s.nextInt();
        }
        for(int i=0;i<t;i++){
            int min=i;
			for(int k=i+1;k<N;k++){
				if(arr[min]>arr[k]){
					min=k;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
        }
        for (int i = 0; i < N; i++) {
           System.out.print(arr[i]+" ");
        }
    }
}

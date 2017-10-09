
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[]=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
    }
    private static void quickSort(int[] arr,int start, int end){
        if(start<end){
            int piv=partition(arr,start,end);
            quickSort(arr,start,piv-1);
            quickSort(arr,piv+1,end);
        }
    }
    private static int partition(int[] arr,int start, int end){
        int piv=arr[start];
        int i=start+1;
        for(int j=start+1;j<=end;j++){
            if(arr[j]<piv){
                int x=arr[i];
                arr[i]=arr[j];
                arr[j]=x;
                i++;
            }
        }
        int temp=arr[i-1];
        arr[i-1]=arr[start];
        arr[start]=temp;
        return i-1;
    }
}

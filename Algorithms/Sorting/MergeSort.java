import java.util.*;

class TestClass {
    static long count=0;
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[]=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
        }
        mergeSort(arr,0,arr.length-1);
        System.out.println(count);
    }
    private static void mergeSort(int[] arr,int start, int end) {
		if(start<end){
			int mid=(start+end)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr,start,mid,end);
		}
	}
	private static void merge(int[] arr, int start, int mid, int end) {
		int p=start, q=mid+1;
		int arr_new[]=new int[end-start+1];
		int k=0;
		while(p<=mid && q <=end){
			if(arr[p]<=arr[q]){
				arr_new[k++]=arr[p++];
			}
			else{
			    count+=(long)(mid-p+1);
				arr_new[k++]=arr[q++];
			}
		}
		while(p<=mid){
			arr_new[k++]=arr[p++];
		}
		while(q <=end){
			arr_new[k++]=arr[q++];
		}
		for(int i=0;i<k;i++){
			arr[start++]=arr_new[i];
		}
	}
}

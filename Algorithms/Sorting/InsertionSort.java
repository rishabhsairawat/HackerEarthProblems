import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[]=new int[N];
        int index[]=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=s.nextInt();
            index[i]=arr[i];
        }
        for(int i=1;i<N;i++){
            int temp=arr[i];
            int j=i;
            while(j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
        for(int i=0;i<index.length;i++){
            for(int j=0;j<arr.length;j++){
                if(index[i]==arr[j]){
                    index[i]=j+1;
                }
            }
        }
        for(int i=0;i<index.length;i++){
			System.out.print(index[i]+" ");
		}
        
    }
}

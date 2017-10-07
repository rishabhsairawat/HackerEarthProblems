import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i < N;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for (int i = 0; i < N-1; i++) {
            for(int j=0;j<N-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
			}
        }
        System.out.println(count);
    }
}

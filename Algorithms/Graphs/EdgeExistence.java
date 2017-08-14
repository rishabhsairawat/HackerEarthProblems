/*

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class EdgeExistence {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] in=line.split(" ");
        int N=Integer.parseInt(in[0]),M=Integer.parseInt(in[1]);
        int[][] graphMat=new int[N][N];
        for (int i = 1; i <= M; i++) {
           String line2 = br.readLine();
           String[] inputs=line2.split(" ");
           int a=Integer.parseInt(inputs[0]),b=Integer.parseInt(inputs[1]);
           graphMat[a][b]=1;
        }
        String line3=br.readLine();
        int Q=Integer.parseInt(line3);
        for(int i=1;i<=Q;i++){
            String line2 = br.readLine();
           String[] inputs=line2.split(" ");
           int a=Integer.parseInt(inputs[0]),b=Integer.parseInt(inputs[1]);
           if(graphMat[a][b]==1)
           System.out.println("YES");
           else
           System.out.println("NO");
        }

        
    }
}

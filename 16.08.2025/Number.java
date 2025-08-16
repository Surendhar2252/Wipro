import java.util.Scanner;
public class Number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int j;
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            if(i<n){
                for(int k=(n-i)*2;k>0;k--){
                    System.out.print("  ");
                }
            }
            for(int x=j-1;x>0;x--){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

//input : 4

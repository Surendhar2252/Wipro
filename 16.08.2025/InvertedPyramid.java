import java.util.Scanner;
class InvertedPyramid{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=n+1;i>=0;i--){
            if(i>1){
                for(int k=0;k<s;k++){
                    System.out.print("  ");
                }
            }
            if(i==1){
                for(int x=1;x<n;x++){
                    System.out.print("  ");
                }
                System.out.print(" *");
                break;
            }
            for(int j=(i-1)*2;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
            s++;
        }
        sc.close();
    }
}
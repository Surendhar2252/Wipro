import java.util.Scanner;
class SumOfInt {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
        sc.close();
    }
}

import java.util.Scanner;
class StringDemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        //System.out.println(s1+" Technologies "+s2);
        String result=s1+" Technologies "+s2;
        System.out.println(result);
            sc.close();
    }
}

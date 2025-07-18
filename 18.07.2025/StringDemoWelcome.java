import java.util.Scanner;
class StringDemoWelcome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String result="Welcome "+s1;
        //System.out.println("Welcome "+s1);
        System.out.println(result);
        sc.close();
    }
}

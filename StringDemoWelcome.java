import java.util.Scanner;
class StringDemoWelcome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println("Welcome "+s1);
        sc.close();
    }
}

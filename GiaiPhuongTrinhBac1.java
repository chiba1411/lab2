package test;
import java.util.Scanner;
public class GiaiPhuongTrinhBac1 {
    public static void main(String[] agrs){
        float a,b,x;
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap a:");
        a=sc.nextFloat();
        System.out.println("nhap b");
        b=sc.nextFloat();
        if(a==0){
            if(b==0){
                System.out.println("vô số nghiệm");
            }
            else{
                System.out.println("vô nghiệm");
            }
        }
        else{
            x=-b/a;
            System.out.println("nghiệm của phương trình:"+x);
        }
        
        
        
        
        
    }
    
}

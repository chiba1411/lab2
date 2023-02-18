
package test;

import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
    public static void main(String[] args) {
        double a,b,c,x,x1,x2,delta;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap a");
        a = sc.nextDouble();
        System.out.println("nhap b:");
        b=sc.nextDouble();
        System.out.println("nhap c:");
        c=sc.nextDouble();
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("vo so nghiem");
                }
                else{
                    System.out.println("vo nghiem");                   
                }
            }else{
                x=-c/b;
                System.out.println("nghiem cua phuong trinh"+x);
            }
        }else{
            delta=b*b-4*a*c;
            if(delta<=0){
                if(delta<0){
                    System.out.println("vo nghiem");
                }else{
                    System.out.println("co nghiem kep");
                    x=-b/(2*a);
                    System.out.println("x:"+x);
                }
            }else{
                System.out.println("co 2 nghiem phan biet");
                x1 =((-b)+ Math.sqrt(delta)/(2*a));
                System.out.println("x1:"+x1);
                x2=((-b)- Math.sqrt(delta)/(2*a));
                System.out.println("X2:"+x2);               
            }
                
        }
        
    }
    
}


package test;

import java.util.Scanner;

public class TinhTienDien {
    public static void main(String[] agrs){
        double soDien,tienDien;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dien:");
        soDien=sc.nextDouble();
        if(soDien<50){
            tienDien=soDien*1000;
            System.out.println("tien dien trong thang:"+tienDien);
            
        }else{
            tienDien=50*1000+(soDien-50)*1200;
            System.out.println("tien dien trong thang:"+tienDien);
        }
    
    }
}

package complexnumbers;
import java.util.Scanner;
public class Complexnumbers
{
    int real,img;
    
    Complexnumbers()
    {
        
    }

    Complexnumbers(int realn,int imgn){
        real=realn;
        img=imgn;
        
        
    }
    
    public Complexnumbers add(Complexnumbers c1,Complexnumbers c2){
        Complexnumbers c=new Complexnumbers();
        c.real=c1.real+c2.real;
        c.img=c1.img+c2.img;
        return c;
    }
    
    public static void main(String[] args) {
        int real1,img1,real2,img2;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter first number real part");
        real1=sc.nextInt();
        System.out.println("Enter the first number imaginary part");
        img1=sc.nextInt();
        System.out.println("Enter second number real part");
        real2=sc.nextInt();
        System.out.println("Enter the second number imaginary part");
        img2=sc.nextInt();
        
        Complexnumbers c1=new Complexnumbers(real1,img1);
        Complexnumbers c2=new Complexnumbers(real2,img2);
        Complexnumbers c3=new Complexnumbers();
        
        c3=c3.add(c1,c2);
        
        System.out.println("\ncomplex no 1:"+real1+"+i"+img1);
        System.out.println("\ncomplex no 2:"+real2+"+i"+img2);
        
        System.out.println("\nThe sum of numbers = "+c3.real+"+i"+c3.img);
        
        
        
    }
    
}


class student
{
int m1,m2,m3;


student(int a1,int b1,int c1)
{
   m1=a1;
   m2=b1;
   m3=c1;
}
public void sum()
{
    System.out.println(m1+m2+m3);
}
public void perc()
{
    float w =m1+m2+m3;
    float l =w/300;
   float k =l*100;
    System.out.println("percentage is  "+k);
}
public static void main(String args[])
{
    student s1=new student(10,20,30);
    s1.sum();
     
    student p1=new student(10,20,30);
    p1.perc();
    student s2=new student(50,80,40);
    s2.sum();
    
    student p2=new student(50,80,30);
     p2.perc();
}
}
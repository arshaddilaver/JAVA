package rectangle;

/**
 *
 * @author sjcet
 */
public class rectangle
{
    int length, breadth;
    rectangle (int l,int b){
            length=l;
            breadth=b;
    }
    public void area(){
        int area = length*breadth;
        System.out.println("area is:"+area);
    }
    public void perimeter(){
        int perimeter = 2*(length+breadth);
        System.out.println("perimeter is:"+perimeter);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rectangle R1 =new rectangle (12,10);
        rectangle R2 =new rectangle (8,10);
        R1.area();
        R1.perimeter();
        R2.area();
        R2.perimeter();
        // TODO code application logic here
    }
    
}
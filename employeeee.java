public class employeeee {
    int emp_id;
    String emp_name;
    int salary;
    employeeee(int a,String b,int c)
    {
      emp_id = a;
      emp_name = b;
      salary = c;
    }
    public void totalsalary()
    {
    int totalsalary = salary+((salary*20)/100);
    System.out.println("totalsalary is:" +totalsalary);
    }

    public static void main(String[] args) 
    {
        employeeee E = new employeeee(8,"gdsz",10000);
        
        E.totalsalary();
    }
}
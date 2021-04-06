class Employee
{
private int eid;
private String ename;
Employee(int eid,String ename)
{
this.eid=eid;
this.ename=ename;
}
public void display()
{
System.out.println("Employee ID No:"+eid);
System.out.println("Employee Name:"+ename);
}
}
class SDemo5
{
public static void main(String a[])
{
Employee s1= new Employee(114,"sita");
Employee s2= new Employee(115,"gita");
s1.display();s2.display();
}
}

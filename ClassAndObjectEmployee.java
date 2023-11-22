class Employee{
    String name, address;
    int year, salary;
}
public class ClassAndObjectEmployee{
    public static void main(String[] args){
        Employee a = new Employee();
        a.name="Elon";
        a.address="California, 6th-Street";
        a.year=2008;
        a.salary=24000;
        Employee b = new Employee();
        b.name="Jeff";
        b.address="NewYork, dowtown";
        b.year=1996;
        b.salary=15000;
        Employee c = new Employee();
        c.name="Bill";
        c.address="London Bewry";
        c.year=2002;
        c.salary=87300;
        System.out.println("Name"+"\t"+"Salary"+"\t"+"Year"+"\t"+"Address");
        System.out.println(a.name+"\t"+a.salary+"\t"+a.year+"\t"+a.address);
        System.out.println(b.name+"\t"+b.salary+"\t"+b.year+"\t"+b.address);
        System.out.println(c.name+"\t"+c.salary+"\t"+c.year+"\t"+c.address);
    }
}
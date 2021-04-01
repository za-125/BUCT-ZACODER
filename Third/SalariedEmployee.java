package Homework.Third;

public class SalariedEmployee  extends  Employee{
    private double salary;  //薪水

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, String ID, double salary) {
        super(name, ID);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee\n{" +
                "姓名："+super.getName()+
                ",身份证号："+super.getID()+
                ",薪水：" + salary +"元"+
                '}';
    }
}

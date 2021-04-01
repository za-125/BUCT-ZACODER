package Homework.Third;

public class HourlyEmployee extends Employee{
    private double workhour;   //工作时间
    private double hoursalary; //时薪

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, String ID, int workhour, int hoursalary) {
        super(name, ID);
        this.workhour = workhour;
        this.hoursalary = hoursalary;
    }

    public double getWorkhour() {
        return workhour;
    }

    public void setWorkhour(double workhour) {
        this.workhour = workhour;
    }

    public double getHoursalary() {
        return hoursalary;
    }

    public void setHoursalary(double hoursalary) {
        this.hoursalary = hoursalary;
    }

    @Override
    public String toString() {
        return "HourlyEmployee\n{" +
                "姓名："+super.getName()+
                ",身份证号："+super.getID()+
                ",工作时间：" + workhour +"时"+
                ",每小时工资数：" + hoursalary +"元/时"+
                ",总薪水："+workhour*hoursalary+"元"+
                '}';
    }
}

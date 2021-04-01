package Homework.Third;

public class ComissionEmployee  extends Employee{
    private  double percent;    //提成比例
    private double sumsalary;   //销售总额

    public ComissionEmployee() {
    }

    public ComissionEmployee(String name, String ID, double percent, double sumsalary) {
        super(name, ID);
        this.percent = percent;
        this.sumsalary = sumsalary;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getSumsalary() {
        return sumsalary;
    }

    public void setSumsalary(double sumsalary) {
        this.sumsalary = sumsalary;
    }

    @Override
    public String toString() {
        return "ComissionEmployee\n{" +
                "姓名:" + super.getName()  +
                ",身份证号:" + super.getID()+
                ",提成比例:" + percent*100 +"%"+
                ",销售总额:" + sumsalary +"元"+
                ",提成薪水:"+percent*sumsalary+"元"+
                '}';
    }
}

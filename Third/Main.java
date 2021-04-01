package Homework.Third;

public class Main {
    public static void main(String[] args) {
        /**
            Employee类对象
         */
        Employee employee=new Employee("小明","001");
        System.out.println(employee);
        /**
         *  SalariedEmployee类对象
         */
        SalariedEmployee salariedEmployee=new SalariedEmployee("小红","002",5000);
        System.out.println(salariedEmployee);
        /**
         * hourlyEmployee类对象
         */
        HourlyEmployee hourlyEmployee=new HourlyEmployee("小刚","003",10,200);
        System.out.println(hourlyEmployee);
        /**
         * ComissionEmployee类对象
         */
        ComissionEmployee comissionEmployee=new ComissionEmployee("小智","007",0.5,10000);
        System.out.println(comissionEmployee);
    }
}

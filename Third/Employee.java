package Homework.Third;

public class Employee {
    private String name;        //姓名
    private String ID;          //身份证

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Employee(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee\n{" +
                "姓名:" + name  +
                ",身份证号:" + ID  +
                '}';
    }
}

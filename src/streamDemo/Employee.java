package streamDemo;

public class Employee {

    public Employee(String name,int salary,int brithYear,int brithMonth,int brithDay){
        this.salary=salary;
        this.name = name;
        this.brithYear = brithYear;
        this.brithMonth = brithMonth;
        this.brithDay = brithDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBrithYear() {
        return brithYear;
    }

    public void setBrithYear(int brithYear) {
        this.brithYear = brithYear;
    }

    public int getBrithMonth() {
        return brithMonth;
    }

    public void setBrithMonth(int brithMonth) {
        this.brithMonth = brithMonth;
    }

    public int getBrithDay() {
        return brithDay;
    }

    public void setBrithDay(int brithDay) {
        this.brithDay = brithDay;
    }

    private String name;
    private int salary;
    private int brithYear;
    private int brithMonth;
    private int brithDay;

    static class Builder{
        public Builder builder(){return this;}
    }

    @Override
    public String toString(){
        return (this.getSalary()+this.getName());
    }



}

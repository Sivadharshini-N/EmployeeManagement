public class Employee {

    private int empId;
    private String empName;
    private int age;
    private String dept;
    private String desg;
    private int repTo;


    static int empCount=1;

    Employee(String empName,int age,String dept,String desg,int repTo){
        this.empId=empCount++;
        this.empName=empName;
        this.age=age;
        this.dept=dept;
        this.desg=desg;
        this.repTo=repTo;
    }

    public int getEmpId() { return empId; }
    public String getEmpName() { return empName; }
    public int getAge() { return age; }

    public String getDept() {
        return dept;
    }

    public String getDesg() {
        return desg;
    }

    public int getRepTo() {
        return repTo;
    }

    public void setEmpName(String empName){
        this.empName=empName;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public void setDesg(String desg){
        this.desg=desg;
    }

    public void setRepTo (int id){
        repTo=id;
    }

}

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EmployeeSystem {
    Scanner sc=new Scanner(System.in);
    Set<Employee> employees;

    EmployeeSystem(List<List<Object>> employeeList){
        employees=new HashSet<>();
        for(List<Object> employee:employeeList){
            Employee emp=new Employee((String) employee.get(0),(int) employee.get(1),(String) employee.get(2),(String) employee.get(3),(int) employee.get(4));
            employees.add(emp);
        }
    }


    public void showAllRecords(Set<Employee> employees){
        System.out.printf("%-6s %-15s %-6s %-25s %-25s %-10s%n","ID","Name","Age","Department","Designation","ReportingTo");
        for(Employee emp:employees){
            System.out.printf("%-6d %-15s %-6d %-25s %-25s %-10d%n",emp.getEmpId(),emp.getEmpName(),emp.getAge(),emp.getDept(),emp.getDesg(),emp.getRepTo());
        }
    }

    public Object getSearchFields(){
        System.out.println("Search By field:\n1.EmpId\n2.EmpName\n3.EmpAge\n4.EmpDepartment\n5.EmpDesignation\n6.ReportingTo\n");
        int option=sc.nextInt();

        switch (option){
            case 1: {
                return "empId";
            }
            case 2:{
                return "empName";
            }
            case 3: {
                return "age";
            }
            case 4: {
                return "dept";
            }
            case 5: {
                return "desg";
            }
            case 6:{
                return "repTo";
            }
            default: {
                System.out.println("Enter a valid field");
                getSearchFields();
            }
        }
        return "";

    }


    public Set<Employee> getStringSearchResult(Set<Employee> empList,Object searchField){
        System.out.println("Search Options:\n1. Equals\n2. Not Equals\n3. Starts With\n4. Ends With\n4. Contains\n5. Not Contains\n");
        int option=sc.nextInt();

        if(option<1 || option>5) {
            System.out.println("Enter valid option");
            return getStringSearchResult(empList,searchField);
        }
        String target=sc.next();
        Set<Employee> filtered = new HashSet<>();
        for(Employee emp:empList){
            if(isMatchedString(emp,option,target,String.valueOf(searchField))){
                filtered.add(emp);
            }
        }
        return filtered;

    }

    public boolean isMatchedString(Employee emp,int option,String target,String searchField){
        String value = String.valueOf(getValueOfSearchField(emp,searchField));
        switch (option){
            case 1:{
                return value.equals(target);

            }
            case 2:{
                return !value.equals(target);
            }
            case 3:{
                return value.startsWith(target);
            }
            case 4:{
                return value.endsWith(target);
            }
            case 5: {
                return value.contains(target);
            }
            case 6: {
                return !value.contains(target);
            }
            default:{
                return false;
            }
        }
    }

    public Object getValueOfSearchField(Employee emp,String searchField){
        if(searchField.equals("empId")) {
            return emp.getEmpId();
        }
        else if(searchField.equals("empName")){
            return emp.getEmpName();
        }
        else if(searchField.equals("age")){
            return emp.getAge();
        }
        else if(searchField.equals("dept")){
            return emp.getDept();
        }
        else if(searchField.equals("desg")){
            return emp.getDesg();
        }
        else{
            return emp.getRepTo();
        }
    }
    public int showUpdateOptions(){
        System.out.println("Fields for updation:\n1.EmpName\n2.Age\n3.Department\n4.Designation\n5.RepTo");
        int option= sc.nextInt();
        return  option;


    }
    public void searchAndUpdate(){

        while(true){

            Set<Employee> res =new HashSet<>(employees);
            Object searchField = getSearchFields();
            if(searchField.getClass().getSimpleName().equals("String")){
                res = getStringSearchResult(res,searchField);
            }
            showAllRecords(res);
            while(true)
            {
                System.out.println("1.Add another search criteria\n2. update record\n3. exit search");
                int option = sc.nextInt();
                switch (option) {
                    case 1: {
                        res=getStringSearchResult(res,searchField)
                    }
                    case 2: {
                        while(true)
                        {
                            int field = showUpdateOptions();
                            Object target = sc.next();

                            switch (field) {
                                case 1: {
                                    for (Employee emp : res) {
                                        emp.setEmpName(String.valueOf(target));
                                    }
                                    break;
                                }
                                case 2: {
                                    for (Employee emp : res) {
                                        emp.setAge((int) target);
                                    }
                                    break;
                                }
                                case 3: {
                                    for (Employee emp : res) {
                                        emp.setDept(String.valueOf(target));
                                    }
                                    break;
                                }
                                case 4: {
                                    for (Employee emp : res) {
                                        emp.setDesg(String.valueOf(target));
                                    }
                                    break;
                                }
                                case 5: {
                                    for (Employee emp : res) {
                                        emp.setRepTo((int) target);
                                    }
                                    break;
                                }
                                default: {
                                    return;
                                }
                            }

                        }




                    }
                    default: {
                        return;
                    }
                }
            }

        }
    }



}

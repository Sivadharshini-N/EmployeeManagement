import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<List<Object>> empList = new ArrayList<>();
        empList.add(List.of("Sriram",45,"Management","CEO",0));
        empList.add(List.of("Mukund",42,"HR","HR Manager",1));
        empList.add(List.of("Sebastian",38,"Finance","Finance Manager",1));
        empList.add(List.of("Ashritha",32,"Product Management","Dev Manager",1));
        empList.add(List.of("Mohammad Rafi",35,"HR","HR Lead",2));
        empList.add(List.of("Anjali Kumar",29,"HR","HR Associate",5));
        empList.add(List.of("Joseph",40,"Finance","Finance Associate",3));
        empList.add(List.of("Ramachandran",27,"Product Development","Tech Lead",4));
        empList.add(List.of("Abhinaya Shankar",23,"Product Development","System Developer",8));
        empList.add(List.of("Imran Khan",28,"Product Testing","QA Lead",8));

        EmployeeSystem empSys = new EmployeeSystem(empList);

        System.out.println("Initial Menu:\n1:Show all records\n2. Search and update records");

        while(true)
        {
            int option = sc.nextInt();
            switch (option){
                case 1:{
                    empSys.showAllRecords(empSys.employees);
                    break;
                }
                case 2:{
                    empSys.searchAndUpdate();
                }
                default: {
                    System.exit(1);
                }
            }
        }


    }
}
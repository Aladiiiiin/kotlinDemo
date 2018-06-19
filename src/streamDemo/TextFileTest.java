package streamDemo;

import java.io.*;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TextFileTest {
    public static void main(String[] args) throws IOException{

//        File file = new File("tempfile\\fos.txt");

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker",75000,1987,12,15);
        staff[1] = new Employee("Harry Hacker",5000,1989,10,1);
        staff[2] = new Employee("Tony Tester",40000,1990,3,15);


        try(PrintWriter out = new PrintWriter("employee.dat","UTF-8")){
            writeDate(staff,out);
        }

        try(Scanner in = new Scanner(
                new FileInputStream("employee.dat"),"UTF-8")){
            Employee[] newStaff = readData(in);
            for(Employee e: newStaff)
                System.out.println(e.toString());
        }
    }


    private static void writeDate(Employee[] employees,PrintWriter out) throws IOException{
        out.println(employees.length);
        for(Employee e:employees) {
            writeEmployee(out, e);
        }
    }

    private static Employee[] readData(Scanner in){
        int n = in.nextInt();
        in.nextLine();

        Employee[] employees = new Employee[n];
        for(int i = 0 ;i<n; i++){
            employees[i] = readEmployee(in);
        }

        return employees;
    }

    public static void writeEmployee(PrintWriter out,Employee e){
        GregorianCalendar calendar = new GregorianCalendar();
        out.println(e.getName()+ "|" + e.getSalary());
    }

    public static Employee readEmployee(Scanner in){
        String  line = in.nextLine();
        String [] tokens = line.split("\\|");
        String name = tokens[0];
        int salary = Integer.parseInt(tokens[1]);
        return new Employee(name,salary,222,333,444);
    }


}

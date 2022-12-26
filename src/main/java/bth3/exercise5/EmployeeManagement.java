package bth3.exercise5;

import app.App;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {

    private static final DecimalFormat dcf = new DecimalFormat("###,###.##");
    private static final Scanner sc = new Scanner(System.in);
    private static final double BASIC_SALARY = 100000;
    protected List<Employee> employees;

    public EmployeeManagement() {
        employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public boolean removeEmployee(String s) {
        Employee other = search(s);
        if (other != null) {
            employees.remove(other);
            return true;
        }
        return false;
    }

    public void show1Employee(Employee employee) {
        System.out.printf("\n== THÔNG TIN NHÂN VIÊN %s\n", employee.getStt());
        System.out.println(employee.toString());
    }

    public void showEmployeeList() {
        employees.forEach(employee -> show1Employee(employee));
    }

    /**
     * Tìm kiếm nhân viên theo "CCCD/CMND" hoặc "Mã nhân viên" hoặc "Tên" hoặc "Quê quán"
     *
     * @param key "CCCD/CMND", "Mã nhân viên", "Tên" hoặc "Quê quán"
     * @return
     */
    public Employee search(String key) {
        return employees.stream().filter(
                employee -> employee.getId().equals(key) || employee.getStt().equals(key) || employee.getName().equals(key)
                    || employee.getOrigin().equals(key)).findFirst()
            .orElse(null);
    }

    public void calculateSalary() {
        employees.forEach(employee -> {
            App.printLine(100);
            System.out.printf("- Nhập số ngày công nhân viên %s: ", employee.getStt());
            int days = Integer.parseInt(sc.nextLine());
            System.out.printf("Mã số: %s\n", employee.getStt());
            System.out.printf("Họ tên: %s\n", employee.getName());
            System.out.printf("Số ngày công: %d\n", days);
            StringBuilder salary = new StringBuilder();
            try {
                salary.append(dcf.format(employee.getSalary(days) * BASIC_SALARY + ((AllowanceEmployee) employee).getBonus()));
            } catch (Exception e) {
                salary.append(dcf.format(employee.getSalary(days) * BASIC_SALARY));
            }
            System.out.printf("Tiền lương: %s\n", salary);
            App.printLine(100);
        });
    }
}

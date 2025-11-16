package model;

public class Employee {
    private int employee_id;
    private String full_name;
    private String address;
    private String phone;

    public Employee() {}

    public Employee(int employee_id, String full_name, String address, String phone) {
        this.employee_id = employee_id;
        this.full_name = full_name;
        this.address = address;
        this.phone = phone;
    }

    public int getEmployeeId() {return employee_id;}
    public void setEmployeeId(int employee_id) {this.employee_id = employee_id;}

    public String getName() {return full_name;}
    public void setName(String full_name) {this.full_name = full_name;}

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}
}

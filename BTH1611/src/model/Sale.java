package model;

public class Sale {
    private int employee_id;
    private int service_id;
    private int quantity;

    public Sale() {}

    public Sale(int employee_id, int service_id, int quantity) {
        this.employee_id = employee_id;
        this.service_id = service_id;
        this.quantity = quantity;
    }

    public int getEmployeeId() {return employee_id;}
    public void setEmployeeId(int employee_id) {this.employee_id = employee_id;}

    public int getServiceId() {return service_id;}
    public void setServiceId(int service_id) {this.service_id = service_id;}

    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
}

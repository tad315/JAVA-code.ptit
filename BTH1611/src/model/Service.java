package model;

public class Service {
    private int service_id;
    private String name;
    private String gr_name;
    private double cost;
    private double fee;

    public Service() {}

    public Service(int service_id, String name, String gr_name, double cost, double fee){
        this.service_id = service_id;
        this.name = name;
        this.gr_name = gr_name;
        this.cost = cost;
        this.fee = fee;
    }

    public int getServiceId() {return service_id;}
    public void setServiceId(int service_id) {this.service_id = service_id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getGrName() {return gr_name;}
    public void setGrName(String gr_name) {this.gr_name = gr_name;}

    public double getCost() {return cost;}
    public void setCost(double cost) {this.cost = cost;}

    public double getFee() {return fee;}
    public void setFee(double fee) {this.fee = fee;}
}

public class SpaService{

    // Declaring data fields
    private String serviceDescription;
    private double price;
    
    //setting default values for a SpaService
    public SpaService(){
        serviceDescription = "XXX";
        price = 0;
    }
    // Making set methods
    public void setServiceDescription(String service){
        serviceDescription = service;
    }
    public void setPrice(double pr){
        price = pr;
    }
    
    // Making get methods
    public String getServiceDescription(){
        return serviceDescription;
    }
    public double getPrice(){
        return price;
    }
}
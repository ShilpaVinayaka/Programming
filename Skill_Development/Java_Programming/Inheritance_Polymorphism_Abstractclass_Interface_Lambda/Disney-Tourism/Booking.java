public abstract class Booking{
    protected String customerName;
    protected String cityName;
    protected String phoneNumber;
    protected int noOfPeople;
    
    public Booking(String customerName, String cityName, 
    String phoneNumber, int noOfPeople){
        setCustomerName(customerName);
        setCityName(cityName);
        setPhoneNumber(phoneNumber);
        setNoOfPeople(noOfPeople);
    }
    
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public int getNoOfPeople(){
        return noOfPeople;
    }
    public void setNoOfPeople(int noOfPeople){
        this.noOfPeople = noOfPeople;
    }
    
    public abstract double calculateTotalAmount();
}

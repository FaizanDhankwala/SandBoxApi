public class Device {
    private String id;
    private String status;

    public Device(String status, String id) {
        this.status = status;
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}

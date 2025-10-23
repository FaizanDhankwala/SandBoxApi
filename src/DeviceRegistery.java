import java.util.*;
public class DeviceRegistery {
    private static Map<String, Device> devices = new HashMap<>();

    static{ //this is autofilling the hashmap
        devices.put("D1", new Device("ACTIVE", "D1"));
        devices.put("D2", new Device("INACTIVE" , "D2"));
        devices.put("D3", new Device("DOWN", "D3"));
    }

    //Api Method
    public static Device getDeviceById(String id){
        return devices.get(id); //returns null if not found

        }

        //APi method to update
    public static void updateDeviceStatus(String id, String newStatus){
        Device device= devices.get(id);
        if(device !=null){
            device.setStatus(newStatus);
        }
    }
    public static void printAllStatus(){
        for(Device device: devices.values()){
            System.out.println("Device " + device.getId()+ " "+  device.getStatus());
        }
    }

}

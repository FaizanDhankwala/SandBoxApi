class Main{
    public static void main(String[] args) {
        //get a device
        Device d1= DeviceRegistery.getDeviceById("D1");
        System.out.println(d1.getId() + "status:" + d1.getStatus());


        //update its status
        DeviceRegistery.updateDeviceStatus("D1", "INACTIVE");
        System.out.println(d1.getId() + " new status: " + d1.getStatus());


        String[] deviceIds = {"D1", "D2", "D3", "D4", "D5"};

       for(String deviceId : deviceIds){
           Device d= DeviceRegistery.getDeviceById(deviceId);
           System.out.println(deviceId + " found? " +(d!=null));
       }

        DeviceRegistery.printAllStatus();
       //hello!

    }
}
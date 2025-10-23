class Main{
    public static void main(String[] args) {
        //get a device
        Device d1= DeviceRegistery.getDeviceById("D1");
        System.out.println(d1.getId() + "status:" + d1.getStatus());

        //update its status
        DeviceRegistery.updateDeviceStatus("D1", "INACTIVE");
        System.out.println(d1.getId() + " new status: " + d1.getStatus());

        //try a device taht dosent exist
        Device missing= DeviceRegistery.getDeviceById("D4");
        System.out.println("D4 found? " + (missing!=null));

        DeviceRegistery.printAllStatus();

    }
}
interface INetworkprotocol{
    void broadcastMassage(String msg);
}
class BluetoothMeshNetwor implements INetworkprotocol{
    public void broadcastMassage(String msg){
        System.out.println("Bluetooth broadcast"+msg);
    }
}
class DisasterAlterSystem{
    private INetworkprotocol network;
    public DisasterAlterSystem( INetworkprotocol network){
        this.network=network;
    }

    public void triggerAlter(String data){
        network.broadcastMassage(data);
    }
}
public class Main7 {
    public static void main(String[] args) {
        INetworkprotocol network=new BluetoothMeshNetwor();

        DisasterAlterSystem system = new DisasterAlterSystem(network);

        system.triggerAlter("Flood warning!!");
    }
}

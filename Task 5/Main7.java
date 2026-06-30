interface HttpService{
    void handGttpRequest();
}
interface DatabaseManager{
    void executeSqlStatemet();
}
interface ContainerOps{
    void restartDockerConatiner();
}
class WebController implements HttpService{
    public void handGttpRequest(){
        System.out.println("Routing traffic to endpoint");
    }
}
public class Main6 {
    public static void main(String[] args) {
        WebController controller=new WebController();
        controller.handGttpRequest();

    }
}

interface OptimizableModel{
    void quantize();
}
class ResNet18 implements OptimizableModel{
    public void quantize(){
        System.out.println("appling int8 quantization");
    }
}
class MobileNet implements OptimizableModel{
    public void quantize(){
        System.out.println("appling dynamic quantization");
    }
}
class InterfaceEngine{
    public void optimize(OptimizableModel model){
        model.quantize();

    }
}
public class Main4 {
    public static void main(String[] args) {
        InterfaceEngine engine=new InterfaceEngine();
    engine.optimize(new ResNet18());
    engine.optimize(new MobileNet());
    }
    
}


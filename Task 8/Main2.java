import java.lang.module.ModuleDescriptor.Builder;

class NeuralNetConfig{
    private final int hiddenLayers;
    private final double learningRate;
    private final String optimizer;
    private final int epochs;

    private NeuralNetConfig(Builder builder){
        this.hiddenLayers=builder.hiddenLayers;
        this.learningRate=builder.learningRate;
        this.optimizer=builder.optimizer;
        this.epochs=builder.epochs;
    }

    public void printSummery(){
        System.out.println("Model: "+ hiddenLayers+ "layers, "+ optimizer + ", Epochs: " + epochs);
    }

    public static class Builder{
        private int hiddenLayers=1;
        private double learningRate=0.01;
        private String optimizer="500";
        private int epochs=10;

        public Builder setHiddenLayer(int hiddenLayers)
        {this.hiddenLayers=hiddenLayers; return this; }

        public Builder setLearningaRate(int hiddenLayers)
        {this.learningRate=learningRate; return this; }
        
        public Builder setOptimizer(String optimizer) { this.optimizer = optimizer; return this; }
        
        public Builder setEpochs(int epochs) { this.epochs = epochs; return this; }

         public NeuralNetConfig build() { return new NeuralNetConfig(this); }



    }
}
public class Main2 {
    public static void main(String[] args) {
        NeuralNetConfig config =new NeuralNetConfig.Builder()
            .setHiddenLayer(5)
            .setOptimizer("Adam")
            .build();

        config.printSummery();
    }
}


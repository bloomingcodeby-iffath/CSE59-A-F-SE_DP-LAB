interface Printer{
    void printDocument();
}
interface Scanner{
    void scanDocument();
}
interface FaxMacine{
    void faxDocument();
}
class BasicPrinter implements Printer{
    public void printDocument(){
        System.out.println("printing...");
    }
}
class MultiFunction implements Printer,Scanner,FaxMacine{
    public void printDocument(){
        System.out.println("Printing..");
    }
    public void scanDocument(){
        System.out.println("scanning..");
    }
    public void faxDocument(){
        System.out.println("faxing..");
    }
}
public class Main3 {
    public static void main(String[] args) {
        
    }
}


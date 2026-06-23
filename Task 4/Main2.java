class teammember{
    protected String name;
    public teammember(String name){
        this.name=name;
            }
}
interface BonusEligible{
    void calculateBonus();
}
class Employee extends teammember implements BonusEligible{
    public Employee(String name){
        super(name);
    }
    public void calculateBonus(){
        System.out.println("Employee bonus calculated");
    }
} 
class Contrator extends teammember{
    public Contrator(String name){
        super(name);
    }
}
public class Main2 {
    public static void main(String[] args) {
        BonusEligible emp=new Employee(("Iffath"));
        emp.calculateBonus();
    }
}


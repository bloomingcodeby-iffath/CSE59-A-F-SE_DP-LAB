class Patient{
    private String patientName;
    private String nationalId;
    public Patient(String patientName, String natinalId){
        this.patientName=patientName;
        this.nationalId=natinalId;
    }

    public String getPatientName(){
        return patientName;
    }

    public String getNationalId(){
        return nationalId;
    }
}

class IdValidator{
    public boolean validate(String id){
        return id.length()==10 || id.length()==17;
    }
}
class SmsService{
    public void sendConfirmation(Patient patient){
        IdValidator validator= new IdValidator();
        if(validator.validate(patient.getNationalId())){
            System.out.println(
                "Sending SMS to"
                +patient.getPatientName()
                +" Registraion successful"
            );
        }
    }
}
public class Main3 {
    public static void main(String[] args) {
        Patient patient=new Patient("ffath","12345678");
        SmsService sms=new SmsService();
        sms.sendConfirmation(patient);
    }
}


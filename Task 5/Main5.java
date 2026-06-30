class UniversityMember{
    public void attendLecture(){
        System.out.println("Attending lecture");
    }
}
interface Researcher{
    void conductResearch();
}
class Professor implements Researcher{
    public void conductResearch(){
        System.out.println("publishing research");
    }
}
class GraduateResearchAssistant extends UniversityMember implements Researcher{
    public void conductResearch(){
        System.out.println("doing research");
    }
}
class UndergraduateStudent extends UniversityMember{

}
public class Main5 {
    public static void main(String[] args) {
        UndergraduateStudent student=new UndergraduateStudent();
        student.attendLecture();
        GraduateResearchAssistant gra=new GraduateResearchAssistant();
        gra.attendLecture();
        gra.conductResearch();
        Professor professor=new Professor();
        professor.conductResearch();
    }
}


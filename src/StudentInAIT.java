
/* Написать как минимум одну иерархию классов в которой будет один родительский класс и два наследника,
расширяющих его функционал */
public class StudentInAIT {
    public void direction() {
        System.out.println("Students can choose IT-directions they are interested in. For example:");
    }
}
class FullStackDeveloper extends StudentInAIT {
    public void direction() {
        System.out.println("Full-Stack Developer");
    }
}
class FrontEndDeveloper extends StudentInAIT {
    public void direction(){
        System.out.println("Front-End Developer");
    }
}

class BackEndDeveloper extends StudentInAIT {
    public void direction(){
        System.out.println("Back-End Developer");
    }
}
class QA_Specialist extends StudentInAIT {
    public void direction(){
        System.out.println("QA-Specialist");
    }
}

class Main {
    public static void main(String[] args) {
        StudentInAIT students = new StudentInAIT();
        FullStackDeveloper student1 = new FullStackDeveloper();
        FrontEndDeveloper student2 = new FrontEndDeveloper();
        BackEndDeveloper student3 = new BackEndDeveloper();
        QA_Specialist student4 = new QA_Specialist();

        students.direction();
        student1.direction();
        student2.direction();
        student3.direction();
        student4.direction();


    }
}




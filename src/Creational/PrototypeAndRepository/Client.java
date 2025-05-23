package Creational.PrototypeAndRepository;

public class Client {

    public static void main(String[] args) {
        Registory studentRegistry = new Registory();

        Student mar23Student = new Student( "John Doe","A1", 22, "Apr");
        studentRegistry.addPrototype("mar23Student", mar23Student);

        Student mar23StudentCopy = studentRegistry.getStudent("mar23Student");
        mar23StudentCopy.setName("Jane Doe");
        mar23StudentCopy.setAge(21);

        Student apr24Student = new Student("Alice Smith", "B1",23,"Mar");
        studentRegistry.addPrototype("apr24Student", apr24Student);

        Student apr24StudentCopy = studentRegistry.getStudent("apr24Student");
        apr24StudentCopy.setName("Bob Brown");
        apr24StudentCopy.setAge(23);

        IntelligentStudent intelligentStudent = new IntelligentStudent( "Charlie Black", "C1", 44,"Jan",130);
        studentRegistry.addPrototype("intelligentStudent", intelligentStudent);

        IntelligentStudent intelligentStudentCopy =
                (IntelligentStudent) studentRegistry.getStudent("intelligentStudent");
        intelligentStudentCopy.setName("David White");
        intelligentStudentCopy.setAge(24);
        intelligentStudentCopy.setIq(140);
    }
}

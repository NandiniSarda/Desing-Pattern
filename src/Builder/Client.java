package Builder;

public class Client {

    public static void main(String[] args) {
        Student student= Student.getBuilder()
                                .setName("name")
                                .setAge(1)
                                .setEmail("email")
                                .setNumber("number")
                                .build();





    }



}

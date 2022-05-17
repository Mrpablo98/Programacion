import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Person pedro=new Person("Pedro", "Garcia", "Calle Falsa 123", LocalDate.of(1990, 1, 1), "pedro@gmail.com");

        System.out.println(pedro.getName());
        System.out.println(pedro.getSurname());
        System.out.println(pedro.getDni());
        System.out.println(pedro.getBirthDate());
        System.out.println(pedro.getEmail());

    }
}

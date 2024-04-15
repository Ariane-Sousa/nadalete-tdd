package exercicio2;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class PersonDAOTest {

    @Test
    public void testIsValidToInclude_ValidPerson() {
        PersonDAO personDAO = new PersonDAO();
        Person person = new Person(1, "John Doe", 30);
        Email email = new Email(1, "john.doe@example.com");
        person.addEmail(email);

        List<String> errors = personDAO.isValidToInclude(person);

        assertTrue(errors.isEmpty());
    }

    @Test
    public void testIsValidToInclude_InvalidName() {
        PersonDAO personDAO = new PersonDAO();
        Person person = new Person(1, "JohnDoe123", 30);
        Email email = new Email(1, "john.doe@example.com");
        person.addEmail(email);

        List<String> errors = personDAO.isValidToInclude(person);

        assertFalse(errors.isEmpty());
        assertTrue(errors.contains("Nome inválido"));
    }

    @Test
    public void testIsValidToInclude_InvalidAge() {
        PersonDAO personDAO = new PersonDAO();
        Person person = new Person(1, "John Doe", 0);
        Email email = new Email(1, "john.doe@example.com");
        person.addEmail(email);

        List<String> errors = personDAO.isValidToInclude(person);

        assertFalse(errors.isEmpty());
        assertTrue(errors.contains("Idade inválida"));
    }

    @Test
    public void testIsValidToInclude_NoEmail() {
        PersonDAO personDAO = new PersonDAO();
        Person person = new Person(1, "John Doe", 30);

        List<String> errors = personDAO.isValidToInclude(person);

        assertFalse(errors.isEmpty());
        assertTrue(errors.contains("Pelo menos um email deve ser associado"));
    }
}

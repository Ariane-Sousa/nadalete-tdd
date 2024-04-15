package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    public void save(Person p) {
    }

    public List<String> isValidToInclude(Person p) {
        List<String> errors = new ArrayList<>();

        if (!isValidName(p.getName())) {
            errors.add("Nome inválido");
        }

        if (!isValidAge(p.getAge())) {
            errors.add("Idade inválida");
        }

        if (p.getEmails().isEmpty()) {
            errors.add("Pelo menos um email deve ser associado");
        }

        return errors;
    }

    private boolean isValidName(String name) {
        String[] parts = name.split(" ");
        if (parts.length < 2) return false;
        for (String part : parts) {
            if (!part.matches("[a-zA-Z]+")) return false;
        }
        return true;
    }

    private boolean isValidAge(int age) {
        return age >= 1 && age <= 200;
    }
}

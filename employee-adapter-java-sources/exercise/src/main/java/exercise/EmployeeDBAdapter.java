package exercise;

public class EmployeeDBAdapter implements Employee{

    private EmployeeDB instance;

    public EmployeeDBAdapter(EmployeeDB instance) {
        this.instance = instance;
    }
    @Override
    public String getId() {
        int id = instance.getId();
        return String.valueOf(id);
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

}
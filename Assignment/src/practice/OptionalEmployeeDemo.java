package practice;

import java.util.Optional;
class MissingFieldException extends Exception {
    public MissingFieldException(String message) {
        super(message);
    }
}
class TeamMember {
    private int id;
    private String name;
    private Optional<String> email;
    private Optional<String> department;

    public TeamMember(int id, String name, String email, String department) {
        this.id = id;
        this.name = name;
        this.email = Optional.ofNullable(email);
        this.department = Optional.ofNullable(department);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public Optional<String> getDepartment() {
        return department;
    }
}
public class OptionalEmployeeDemo {
    public static void main(String[] args) {

        TeamMember t1 = new TeamMember(1, "Alice", null, null);
        TeamMember t2 = new TeamMember(2, "Bob", "bob@example.com", null);
        TeamMember t3 = new TeamMember(3, "Charlie", "charlie@example.com", "HR");

        try {
            printMemberDetails(t1);
        } catch (MissingFieldException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            printMemberDetails(t2);
        } catch (MissingFieldException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            printMemberDetails(t3);
        } catch (MissingFieldException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void printMemberDetails(TeamMember member) throws MissingFieldException {
        System.out.println("ID: " + member.getId());
        System.out.println("Name: " + member.getName());

        String email = member.getEmail().orElse("No Email Provided");
        System.out.println("Email: " + email);
        String dept = member.getDepartment()
            .orElseThrow(() -> new MissingFieldException("Department is missing for member: " + member.getName()));
        System.out.println("Department: " + dept);
    }
}




/*
ID: 1
Name: Alice
Email: No Email Provided
Error: Department is missing for member: Alice
ID: 2
Name: Bob
Email: bob@example.com
Error: Department is missing for member: Bob
ID: 3
Name: Charlie
Email: charlie@example.com
Department: HR
*/
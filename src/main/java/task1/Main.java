package task1;

import task1.entity.Employee;
import task1.exception.FieldLengthLimitException;
import task1.exception.IncorrectSalaryException;

/** Class demonstration for task 1 */
public class Main {

    public static void main(String[] args) throws FieldLengthLimitException, IncorrectSalaryException {
        try {
            Employee correctEmployee = new Employee("First", "First Surname", 1234.0);
            correctEmployee.setName("dfdfhdfhsghdfghfghdfghfdhfghdghdghghghg");
        } catch (FieldLengthLimitException | IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        }

        try {
            Employee incorrectNameEmployee = new Employee("Secondincorrectnameithinksowillbeexception",
                    "First Surname", 1234.0);
        } catch (FieldLengthLimitException | IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        }

        try {
            Employee incorrectSurnameEmployee = new Employee("Second",
                    "Secondincorrectnameithinksowillbeexception", 1234.0);
        } catch (FieldLengthLimitException | IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        }

        try {
            Employee incorrectSalaryEmployee = new Employee("Third",
                    "Third Surname", -1000.0);
        } catch (FieldLengthLimitException | IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        }

        try {
            Employee incorrectSalaryEmployee = new Employee("Third",
                    "Third Surname", -1000.0);
        } catch (FieldLengthLimitException | IncorrectSalaryException e) {
            throw new RuntimeException(e);
        }
    }
}

package africa.semicolon.chapterThreeExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EmployeeTest {

    private Employee employee;
    @BeforeEach
    void init(){
        employee = new Employee("Umar", "Chukwuma", 50000.00);
    }

    @Test
    void testThatEmployeeDoesNotInitializeNegativeSalary(){
        Employee dummyEmployee = new Employee("Omosetan", "Omorele", -67000.00);
        assertNotEquals(-67000.00, dummyEmployee.getMonthlySalary());
    }

    @Test
    void testThatEmployeeCanSetMonthlySalary(){
        employee.setMonthlySalary(34000.00);
        assertEquals(34000.00, employee.getMonthlySalary());
    }

    @Test
    void testThatEmployeeDoesNotSetNegativeSalary(){
        employee.setMonthlySalary(-67000.00);
        assertNotEquals(-67000.00, employee.getMonthlySalary());
    }

    @Test
    void testThatEmployeeCanSetFirstName(){
        employee.setFirstName("Omosetan");
        assertEquals("Omosetan", employee.getFirstName());
    }

    @Test
    void testThatEmployeeCanSetLastName(){
        employee.setLastName("Omorele");
        assertEquals("Omorele", employee.getLastName());
    }

    @Test
    void testThatEmployeeCanDetermineYearlySalary(){
        double yearlySalary = employee.getYearlySalary();
        assertEquals(600000, yearlySalary, 0.0);
    }

    @Test
    void testThatEmployeeCanGetARaise(){
        employee.salaryRaise(10.0);
        assertEquals(55000.00, employee.getMonthlySalary(), 0.00001);
        assertEquals(660000.00, employee.getYearlySalary(), 0.00001);
    }
}

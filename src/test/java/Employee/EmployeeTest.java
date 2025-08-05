package Employee;

import employee_management.Department;
import employee_management.Employee;
import employee_management.FullTimeEmployee;
import employee_management.PartTimeEmployee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    FullTimeEmployee koto;
    PartTimeEmployee lita;
    Department department;
    ArrayList<Employee> listfulltime = new ArrayList<>();
    ArrayList<Employee> listPartTime = new ArrayList<>();
    Department freelance ;
    Department rh;
    @BeforeEach
    void setUp(){
        koto = new FullTimeEmployee(1,"Koto", "koto@gmail.com", "123456789", "Tana", 6_000_000);
        lita = new PartTimeEmployee(1,"Lita", "lita@gmail.com", "987654321", "Tana", 72, 1000);

        listPartTime.add(lita);
        rh = new Department("Ressources Humaines",listfulltime);
        freelance = new Department("Freelance",listPartTime);

    }

    @Test
    void showInformationTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        try{
            lita.showInformation();
            String output = outContent.toString().trim();
            String litaInfo ="Details about Lita employeeId=1, fullname='Lita', email='lita@gmail.com', phoneNumber='987654321', adresse='Tana',hoursWorked=1000.0";
            assertEquals(litaInfo,output);
        } finally {
            System.setOut(originalOut);
        }
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        try {
            koto.showInformation();
            String kotoOutPut = outContent.toString().trim();
            String kotoInfo = "Details about Koto employeeId=1, fullname='Koto', email='koto@gmail.com', phoneNumber='123456789', adresse='Tana'";
            assertEquals(kotoInfo,kotoOutPut);
        }finally {
            System.setOut(originalOut);
        }
    }

    @Test
    void calculatePayTest(){
        assertEquals(72000.0,lita.calculatePay());
        assertEquals(6_000_000,koto.calculatePay());
    }
    @Test
    void addEmployeeTest(){
        RuntimeException exceptionAddExistingEmployee = Assertions.assertThrows(RuntimeException.class, () -> {
            freelance.addEmployee(lita);
        });
        assertEquals("This employee has existed",exceptionAddExistingEmployee.getMessage());
        rh.addEmployee(koto);
        assertEquals(1,rh.getListOfEmployee().size());
    }
}

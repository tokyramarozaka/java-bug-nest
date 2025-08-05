package employee_management;
public class Employee {
    private int employeeId;
    private String fullname;
    private String email;
    private String phoneNumber;
    private String adresse;

    public Employee(int employeeId, String fullname, String email, String phoneNumber, String adresse) {
        this.employeeId = employeeId;
        this.fullname = fullname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.adresse = adresse;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {

        this.adresse = adresse;
    }
    /* TODO : fix the string format of both full time and part time employees
        // NOTE : do not show sensitive data such as hourlyRate or monthlySalary here !
            System.out.println("Details about Koto " + koto);
            System.out.println("Details about Lita " + lita);
    } */
    @Override
    public String toString() {
        return
                "employeeId=" + employeeId +
                        ", fullname='" + fullname + '\'' +
                        ", email='" + email + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", adresse='" + adresse + '\'' ;
    }

    public void showInformation(){
        System.out.println("Details about "+this.getFullname()+" "+ toString());
    }

    public static void main(String[] args) {
        FullTimeEmployee koto = new FullTimeEmployee(1,"Koto", "koto@gmail.com", "123456789", "Tana", 6_000_000);
        PartTimeEmployee lita = new PartTimeEmployee(1,"Lita", "lita@gmail.com", "987654321", "Tana", 72, 1000);
        koto.showInformation();
        lita.showInformation();

        System.out.println(lita.calculatePay());
    }
}

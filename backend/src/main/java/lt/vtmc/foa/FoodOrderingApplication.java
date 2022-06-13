package lt.vtmc.foa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import model.Employee;
import repository.EmployeeRepository;

@SpringBootApplication
public class FoodOrderingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FoodOrderingApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Ernestas");
		employee.setLastName("Urbonas");
		employee.setEmailId("aaa@aaa.com");
		employeeRepository.save(employee);
		
		Employee employee1 = new Employee();
		employee1.setFirstName("Jonas");
		employee1.setLastName("Jonaitis");
		employee1.setEmailId("Jonas@gmail.com");
		employeeRepository.save(employee1);
	}

}

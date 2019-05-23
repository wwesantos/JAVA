package repo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import domain.Employee;

public class EmplyeeDAO {
	private static List<Employee> clients = Arrays.asList(
			new Employee("Erick", "Santos"), 
			new Employee("Jonh", "Silva"),
			new Employee("Alex", "Pereira"),
			new Employee("Peter", "Park"));
	
	public static List<Employee> getBy(String filterBy){
		return clients.stream()
				.filter(c -> c.getFirstName().contains(filterBy) || c.getLastName().contains(filterBy))
				.collect(Collectors.toList());
	}
}

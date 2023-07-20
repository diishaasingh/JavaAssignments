import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class FileReader {
	public static void main(String[] args) {
		
		Set<Person> uniquePersons = new HashSet<>();
		Map<String, Person> map = new HashMap<>();
		
		Map<String,String> map2 = new HashMap<>();
		String properties="src\\folderResources\\Application2.properties";
		try(BufferedReader br = new BufferedReader(new java.io.FileReader(properties))){
			String line;
			while((line=br.readLine())!=null) {
				String[] keyValues=line.split("=");
				map2.put(keyValues[0], keyValues[1]);
			}
		}catch (IOException e) {
            e.printStackTrace();
        }
		
		String filepath = map2.get("fileName");
		try (BufferedReader br = new BufferedReader(new java.io.FileReader(filepath))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");

				if (data.length >= 5) {
					String firstName = data[0];
					String lastName = data[1];
					String[] dateValues = data[2].split("/");
					String email = data[3];
					String lastValue = data[4];

					int year = Integer.parseInt(dateValues[2]);
					int month = Integer.parseInt(dateValues[1]);
					int dayOfMonth = Integer.parseInt(dateValues[0]);
					LocalDate d = LocalDate.of(year, month, dayOfMonth);

					Person person = new Person(firstName, lastName, d, email);
					person.addPhone(lastValue);

					uniquePersons.add(person);
					if (!map.containsKey(email)) {
						map.put(email, person);
					} else {
						Person p = map.get(email);
						p.addPhone(lastValue);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Printing the contents of the map
		System.out.println("Printing the contents of the hashmap:");
		System.out.println();

		for (Person person : map.values()) {
			System.out.println(person);
		}

		List<Person> sortedList = new ArrayList<>(map.values());
		Collections.sort(sortedList, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				int firstNameComparison = p1.getFirstName().compareTo(p2.getFirstName());
				if (firstNameComparison != 0) {
					return firstNameComparison;
				} else {

					int lastNameComparison = p1.getLastName().compareTo(p2.getLastName());
					if (lastNameComparison != 0) {
						return lastNameComparison;
					}
					return p1.birthDate.compareTo(p2.birthDate);
				}
			}
		});

		// Printing the contents of the sorted list
		System.out.println();
		System.out.println("Printing the contents of the sorted list (ascending order of firstName and lastName):");
		System.out.println();

		for (Person person : sortedList) {
			System.out.println(person);
		}
	}
}

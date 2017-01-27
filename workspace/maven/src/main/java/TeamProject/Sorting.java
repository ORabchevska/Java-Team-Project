package TeamProject;

import java.util.Comparator;

public class Sorting implements Comparator<Worker> {

	public int compare(Worker o1, Worker o2) {
		int unique;
		String strA = (String) o1.getName();
		String strB = (String) o2.getName();

		unique = strA.compareTo(strB);
		if (unique == 0) {
			unique = 1;
			Integer nmbA = o1.getSalary();
			Integer nmbB = o2.getSalary();
			unique = nmbA.compareTo(nmbB);
			return nmbA.compareTo(nmbB);
		}

		return strA.compareTo(strB);
	}
}

// Use the following command to run PowerAPI, and run the project once PowerAPI starts monitoring
// Eclipse
// start bin\powerapi modules sigar-cpu-simple monitor –-frequency 1000 -–apps eclipse -–chart


public class Main {

	public static void main(String[] args) {
		// Uncomment the depth of the inheritance tree you wish to measure
		
		// ClassA testSubject = new ClassA();
		// ClassA testSubject = new ClassD();
		ClassA testSubject = new ClassG();
		
		testSubject.doStuff();
		
	}

}

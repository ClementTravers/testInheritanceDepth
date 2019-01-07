
public class ClassA {

	public void doStuff() {
		int i;
		int count = 0;
		for (i = 0; i < 10000000; i++) {
			count++;
		}
		System.out.println(count);
	}
	
}

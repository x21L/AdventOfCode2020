package days;

public class Day1 extends Day{
	private static final  String PATH = "input.txt"; 
	
	public Day1() {
		super(PATH);
	}
	public void read() {
		if (scanner != null) {
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		}
	}
}

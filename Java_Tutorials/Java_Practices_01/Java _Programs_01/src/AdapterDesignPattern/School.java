package AdapterDesignPattern;

public class School {

	public static void main(String[] args) {

		Pen p = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("Im bit tired to write an assignment");
	}

}

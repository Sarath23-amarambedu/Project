package RestAssuredAPITrainingBeginner;

public class Child extends Parent {

	static void show() {
		System.out.println("Child class implemented");
	}

	public static void main(String[] args) {
		Parent parent = new Parent();
		// parent.show();

		Child child = new Child();
		child.show();

		Parent parent1 = new Child();
		// parent1.show();


	}
}


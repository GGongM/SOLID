interface GreeterInterface {
	public String greet();
}

class formalGreet implements GreeterInterface {

	@Override
	public String greet() {
		return "Good evening, sir.";
	}
}

class casualGreet implements GreeterInterface {

	@Override
	public String greet() {
		return "Sup bro?";
	}
}

class intimateGreet implements GreeterInterface {

	@Override
	public String greet() {
		return "Hello Darling!";
	}
}

class mzGreet implements GreeterInterface {

	@Override
	public String greet() {
		return "....";
	}
}

class normalGreet implements GreeterInterface {

	@Override
	public String greet() {
		return "Hello.";
	}
}

public class Greeter {
	String formality;
	GreeterInterface greeter;


	public String greet() {
		return greeter.greet();
	}

	public void setFormality(String formality) {
		this.formality = formality;

		if (this.formality.equals("formal")) {
			greeter = new formalGreet();
		} else if (this.formality.equals("casual")) {
			greeter = new casualGreet();
		} else if (this.formality.equals("intimate")) {
			greeter = new intimateGreet();
		} else if (this.formality.equals("mx")) {
			greeter = new mzGreet();
		} else {
			greeter = new normalGreet();
		}
	}
}
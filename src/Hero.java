interface Walkable {
	public void walk();
	public void run();
}

interface Flyable {
	public void fly();
}

class BatMan implements Walkable {

	@Override
	public void walk() {

	}

	@Override
	public void run() {

	}
}

class SuperMan implements Walkable, Flyable {

	@Override
	public void walk() {

	}

	@Override
	public void run() {

	}

	@Override
	public void fly() {

	}
}

public class Hero {

	void goWalk(Walkable walkable) {
		walkable.walk();
	}

}

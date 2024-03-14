interface Socket {
	public void connect();

	public void disconnect();
}

class SingleVolt implements Socket {

	@Override
	public void connect() {

	}

	@Override
	public void disconnect() {

	}
}

class MultipleVolt implements Socket {

	@Override
	public void connect() {

	}

	@Override
	public void disconnect() {

	}
}

class SunVolt implements Socket {

	@Override
	public void connect() {

	}

	@Override
	public void disconnect() {

	}
}

public class Home {
	Socket socket;

	void setSingleVolt() {
		socket = new SingleVolt();
	}

	void useElect() {
		socket.connect();
	}
}

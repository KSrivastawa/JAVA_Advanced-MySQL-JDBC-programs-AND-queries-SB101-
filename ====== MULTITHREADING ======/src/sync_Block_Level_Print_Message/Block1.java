package sync_Block_Level_Print_Message;

public class Block1 extends Thread {

	Message message;
	String name;
	
	public Block1(Message message, String name) {
		
		this.message = message;
		this.name = name;
	}
	
	@Override
	public void run() {
		message.name(name);
	}
	
	
}

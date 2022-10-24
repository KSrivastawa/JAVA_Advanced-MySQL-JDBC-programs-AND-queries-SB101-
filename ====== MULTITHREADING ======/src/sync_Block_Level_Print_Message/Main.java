package sync_Block_Level_Print_Message;

public class Main {

	public static void main(String[] args) {
		
		Message message = new Message();
		
		Block1 block1 = new Block1(message, "Ketan");
		Block1 block12 = new Block1(message, "Prashant");
		Block1 block13 = new Block1(message, "Riku");
		
		block1.start();
		block12.start();
		block13.start();
		

	}

}

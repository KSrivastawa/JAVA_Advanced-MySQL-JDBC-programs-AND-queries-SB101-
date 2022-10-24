package sync_Block_Level_Print_Message;

public class Message {
	
	public void name(String name) {
	
		synchronized (this) {
			
			for(int i=0; i<3; i++) {
				
				System.out.println("How are you "+name);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		
	}
	
}

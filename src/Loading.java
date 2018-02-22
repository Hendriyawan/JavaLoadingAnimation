/* 22 Februari 2018
* by Hendriyawan
* Loading class 
*/
public class Loading extends Thread {
	
	private boolean running;
	private String message;
	private String[] type;
	
	public Loading(boolean running, String message, String[] type){
		this.running = running;
		this.message = message;
		this.type = type;
	}
	@Override
	public void run(){
		while(running == true){
			for(int i = 0; i < type.length; i++){
				System.out.print("\r"+message+" "+type[i]);
				try {
					sleep(200);
				}
				catch (InterruptedException e){
				}
			}
		}
	}
}

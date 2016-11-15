
public class testMain extends Thread{
	public static BankAccount account = new BankAccount();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread depositMan = new Thread(){
			public void run(){
				for(int i = 0; i <10; i++)
				{
					try{
		                  		account.add(100);
		                  		Thread.sleep(250);
		               		}catch(InterruptedException e){
		                  		e.printStackTrace();
		               		}	
				}
			}
		};
		
		Thread withdrawMan = new Thread() {
			public void run(){
				for(int j = 0; j < 10 ; j++)
				{
					try{
		                  		account.delete(100);
		                  		Thread.sleep(250);
		               		}catch(InterruptedException e){
		                  		e.printStackTrace();
		               		}
				}
			}
		};
		depositMan.start();
		withdrawMan.start();
	}

}

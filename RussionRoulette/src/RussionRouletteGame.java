public class RussionRouletteGame
{
	public static void main(String[] args)
	{
		new RussionRouletteGame().go();
	}
	
	public void go() 
	{
		for(int x = 1; x < 7 ;x ++)
		{
			int reduce = 6 - x;
			int randNum = (int)(Math.random() * reduce);
			int chamber = randNum;
			
			System.out.println("Revolver is being loaded");
			
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException ex) 
			{
				
				ex.printStackTrace();
			}
			System.out.println("");
			System.out.println("Bullet " + x + " shoots");
			
			if(chamber == 1 )
			{
				System.out.println("Player " + x + " was Shot");
				System.out.println("Player " + x + " is dead");
				break;
			}
			else
			{
				System.out.println("Player " + x + " Survived");
			}
		}
	}
}

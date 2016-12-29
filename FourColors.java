import java.applet.*;
import java.awt.*;
public class FourColors extends Applet
{
	private boolean drawCount = true;

	public void paint (Graphics page)
	{
		if (!drawCount)
			return;
		int length = 100;
		int width = 100;

		page.setColor(Color.blue);
		page.fillRect(0, 0, length, width);
		page.setColor(Color.red);
		page.fillRect(100, 0, length, width);
		page.setColor(Color.cyan);
		page.fillRect(0, 100, length, width);
		page.setColor(Color.green);
		page.fillRect(100, 100, length, width);


		int randomNumber;
		randomNumber = (int)(Math.random() * 4 + 1);
		randomNumber = 1;//test



		if (randomNumber == 1)
		{
			long timeCheck = System.currentTimeMillis();
			//TODO fix dark blue repeat
			while(timeCheck + 3000 > System.currentTimeMillis())
			{
				page.setColor(Color.blue.darker());
				page.fillRect(0, 0, length, width);
			}
			System.out.println("2");
			page.setColor(Color.blue);
			page.fillRect(0, 0, length, width);
		}

		if (randomNumber == 2)
		{
			while(System.currentTimeMillis() < System.currentTimeMillis()+3000)
			{
				page.setColor(Color.red.darker());
				page.fillRect(100, 0, length, width);
			}
		}

		if (randomNumber == 3)
		{
			while(System.currentTimeMillis() < System.currentTimeMillis()+3000)
			{
				page.setColor(Color.green.darker());
				page.fillRect(0, 100, length, width);
			}
		}
		if (randomNumber == 4)
		{
			while(System.currentTimeMillis() < System.currentTimeMillis()+3000)
			{
				page.setColor(Color.cyan.darker());
				page.fillRect(100, 100, length, width);
			}
		}
		drawCount = false;
	}
}

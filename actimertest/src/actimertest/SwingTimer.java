package actimertest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



	

	
	import javax.swing.Timer;
	import java.awt.event.ActionListener;

	public class SwingTimer implements ActionListener  {

		private Timer t = null;
		private int sec=60, min=10, hrs=8;
		
		public SwingTimer() {
			
			t.start();
		}
		
		
		
		
		
		
		
		public void actionPerformed(ActionEvent e)
        {
            t = new Timer(1000, new ActionListener() {
                public void actionPerformed(ActionEvent ev)
                {
                    sec++;
                    if (sec == 60)
                    {
                        min++;
                        sec = 0;
                    }
                    if (min == 60)
                    {
                        hrs++;
                        min = 0;
                    }
                    System.out.println("" + hrs + " : " + min + " : " + sec);
                    

                }
            });
           // t.start();
		
		
		
		
		
        }
		
		
		
	}
		
		
		
		
		
		


	

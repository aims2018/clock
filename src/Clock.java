import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Clock extends JFrame implements Runnable {

	public Clock(String title) {
		super(title);
	}
	
	private void pause(double seconds) {
		try {
			Thread.sleep((int)(1000*seconds));
		} catch (InterruptedException ie) {
			System.out.println(ie);
		}
	}
	
	public String[] timeZones() {
		return(TimeZone.getAvailableIDs());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clock clock = new Clock("Clock");
		
		clock.setSize(500,500);
		clock.setLocationRelativeTo(null);
		clock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		clock.setVisible(true);
	}

}

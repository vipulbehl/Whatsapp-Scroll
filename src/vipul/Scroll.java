package vipul;

import java.awt.AWTException;
import java.awt.Robot;

public class Scroll extends Thread{
	
	public void run(){
		try {
			Robot robot = new Robot();
			while(true){
				robot.delay(100);
				robot.mouseWheel(-100);
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
}
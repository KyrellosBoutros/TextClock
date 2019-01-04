/**
 * Show the formal and informal clock in German every minute
 * 
 * @author Kyrellos Boutros
 *
 */
package org.eclipse.textclock.internal;

import java.util.Calendar;
import java.util.HashMap;



public class TextClock {

	public static void main(String[] args) {
		Clock clock = new Clock();
		Clock fClock = new FormalTime();
		InformalTime iClock = new InformalTime();

		ConsoleDisplay formalTimeDisplay = new ConsoleDisplay();
		ConsoleDisplay informalTimeDisplay = new ConsoleDisplay();

			while (true) {
				updateFormalClock(fClock, formalTimeDisplay);
				updateInformalClock(iClock, informalTimeDisplay);
				try {
					Thread.sleep(getTimeToWait(60000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}

	private static void updateClock(Clock clock, ConsoleDisplay display) {
		clock.refresh();
		display.show(clock.getTimeSentence());
	}

	private static void updateFormalClock(Clock clock, ConsoleDisplay display) {
		clock.refresh();
		display.createFormalString(clock.getTimeSentence());
	}

	private static void updateInformalClock(Clock clock, ConsoleDisplay display) {
		clock.refresh();
		display.createinFormalString(clock.getTimeSentence());
	}

	private static long getTimeToWait(long intervalTime) {
		long milliSecond = Calendar.getInstance().getTimeInMillis(); 
		// get elapsed time in milliseconds since last full interval
		long elapsedTime = milliSecond % intervalTime; 
		// get the remaining time until next full interval
		long timeToWait = intervalTime - elapsedTime; 
		return timeToWait;
	}
}


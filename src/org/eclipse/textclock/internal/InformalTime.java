package org.eclipse.textclock.internal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Get and convert time to informal way
 * 
 * @author Kyrellos Boutros
 *
 */

public class InformalTime extends Clock {

	public InformalTime() {
		new SimpleDateFormat("hh:mm a");
	}

	public String getTimeSentence() {

		Date time = getTime();
		int hour = getHour(time);
		int minute = getMinute(time);
		String timeAsSentence = "Es ist " + convertMinuteToString(minute) + " " + convertHourToString(hour);
		return timeAsSentence;
	}

	/**
	 * Overrides getHour() from the class Clock to show the 12-format-hour
	 */
	public int getHour() {
		return getCalendar().get(Calendar.HOUR);
	}

	protected int getHour(Date time) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(time);
		return cal.get(Calendar.HOUR);
	}

	/**
	 * convert HOUR into string as spoken word == getHour().toString()
	 * 
	 * @return hour
	 */
	private String convertHourToString(int hour) {

		if (hour == 0) {
			if (getMinute() <= 20) {
				return "zwölf";
			} else
				return "eins";
		}
		if (hour == 1) {
			if (getMinute() <= 20) {
				return "eins";
			} else
				return "zwei";
		}
		if (hour <= 12) {
			if (getMinute() >= 21) {
				return units[hour + 1];
			} else
				return units[hour];
		}
		return "error";
	}

	/**
	 * convert MINUTE into string as spoken word
	 * 
	 * @param minute
	 * @return minute
	 */
	private String convertMinuteToString(int minute) {

		if (minute == 0) {
			return "genau";
		}
		if (minute < 5) {
			return "kurz nach";
		}
		if (minute == 5) {
			return "fünf nach";
		}
		if (minute < 10) {
			return "kurz vor zehn nach";
		}
		if (minute == 10) {
			return "zehn nach";
		}
		if (minute < 15) {
			return "kurz vor viertel nach";
		}
		if (minute == 15) {
			return "viertel nach";
		}
		if (minute < 20) {
			return "kurz vor zwanzig nach";
		}
		if (minute == 20) {
			return "zwanzig nach";
		}
		if (minute < 25) {
			return "kurz vor fünf vor halb";
		}
		if (minute == 25) {
			return "fünf vor halb";
		}
		if (minute < 30) {
			return "kurz vor halb";
		}
		if (minute == 30) {
			return "halb";
		}
		if (minute < 35) {
			return "kurz nach halb";
		}
		if (minute == 35) {
			return "fünf nach halb";
		}
		if (minute < 40) {
			return "kurz vor zwanzig vor";
		}
		if (minute == 40) {
			return "zwanzig vor";
		}
		if (minute < 45) {
			return "kurz vor viertel vor";
		}
		if (minute == 45) {
			return "viertel vor";
		}
		if (minute < 50) {
			return "kurz vor zehn vor";
		}
		if (minute == 50) {
			return "zehn vor";
		}
		if (minute < 55) {
			return "kurz vor fünf vor";
		}
		if (minute == 55) {
			return "fünf vor";
		}
		if (minute < 59) {
			return "kurz vor";
		}
		if (minute == 59) {
			return "gleich";
		} else
			return "error";
	}
}

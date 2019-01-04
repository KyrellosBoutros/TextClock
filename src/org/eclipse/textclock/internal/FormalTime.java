package org.eclipse.textclock.internal;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Get and convert time to formal way
 * 
 * @author Kyrellos Boutros
 *
 */

public class FormalTime extends Clock {

	public FormalTime() {
		new SimpleDateFormat("HH:mm");
	}

	/**
	 * Returns the time in text form, e.g. "Es ist Fünfzehn Uhr fünf"
	 * 
	 * @return Time in text form
	 */
	public String getTimeSentence() {
		Date time = getTime();
		int hour = getHour(time);
		int minute = getMinute(time);
		String timeAsSentence = "";

		if (minute == 0) {
			timeAsSentence = "Es ist " + convertMinuteToString(minute) + " " + convertHourToString(hour) + " Uhr";

		} else {
			timeAsSentence = "Es ist " + convertHourToString(hour) + " Uhr " + convertMinuteToString(minute);
		}
		return timeAsSentence;

	}

	/**
	 * convert HOUR into string as spoken word
	 * 
	 * @param hour
	 * 
	 * @return hour
	 */
	private String convertHourToString(int hour) {
		return units[hour];
	}

	/**
	 * convert MINUTE into string as spoken word
	 * 
	 * @param minute
	 * 
	 * @return minute
	 */
	private String convertMinuteToString(int minute) {

		if (minute == 0) {
			return "genau";
		}
		if (minute == 1) {
			return "eins";
		}
		if (minute <= 20) {
			if (minute % 10 == 0) {
				return tenner[minute / 10];
			} else
				return units[minute];
		}
		if (minute == 30) {
			return tenner[minute / 10];
		}
		if (minute <= 59) {
			if (minute % 10 == 0) {
				return tenner[minute / 10];
			} else
				return units[minute % 10] + "und" + tenner[minute / 10];
		} else
			return "error";
	}
}

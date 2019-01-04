package org.eclipse.textclock.internal;

import java.util.Calendar;
import java.util.Date;

/**
 * Keeps track of the current time
 * 
 * @author Kyrellos Boutros Date 21.11.2018
 */
public class Clock {

	private Calendar calendar;

	protected final String[] tenner = { "", "zehn", "zwanzig", "dreißig", "vierzig", "fünfzig" };

	protected final String[] units = { "null", "ein", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun",
			"zehn", "elf", "zwölf", "dreizehn", "vierzehn", "fünfzehn", "sechzehn", "siebzehn", "achtzehn", "neunzehn",
			"zwanzig", "einundzwanzig", "zweiundzwanzig", "dreiundzwanzig" };

	public Clock() {
		calendar = Calendar.getInstance();
	}

	/**
	 * Returns GregorianCalendar
	 * 
	 * @return Calendar
	 */
	protected Calendar getCalendar() {
		return calendar;
	}

	/**
	 * Returns the hour of the day in a 24-format
	 * 
	 * @return
	 */
	protected int getHour() {
		// return getHour(getTime());
		return getCalendar().get(Calendar.HOUR_OF_DAY);
	}

	protected int getHour(Date time) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(time);
		return cal.get(Calendar.HOUR_OF_DAY);
	}

	protected int getMinute() {
		return getCalendar().get(Calendar.MINUTE);
	}

	protected int getMinute(Date time) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(time);
		return cal.get(Calendar.MINUTE);
	}

	protected int getSecond() {
		return getCalendar().get(Calendar.SECOND);
	}

	protected int getMilliSecond() {
		return getCalendar().get(Calendar.MILLISECOND);
	}

	/**
	 * Returns the actual time
	 * 
	 * @return Time
	 */
	protected Date getTime() {
		return calendar.getTime();
	}

	/**
	 * Returns the complete date and time as one sentence
	 * 
	 * @return Time like "Thu Dec 06 11:35:01 CET 2018"
	 */
	public String getTimeSentence() {
		return getTime().toString();
	}

	/**
	 * Refreshes the calendar
	 */
	public void refresh() {
		calendar = Calendar.getInstance();
	}

	/**
	 * Setter of the object calendar
	 * 
	 * @param calendar
	 */
	protected void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

}

package org.eclipse.textclock.internal;

public abstract class Display {

	String[] data = {};

	Display() {
		
	}
	abstract void show(String timeSentence);
}

package net.sf.briar.api.event;

/** An interface for receiving notifications when events occur. */
public interface EventListener {

	void eventOccurred(Event e);
}

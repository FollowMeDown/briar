package net.sf.briar.api.protocol;

import java.io.IOException;
import java.util.Map;

/** An interface for creating a transports update. */
public interface TransportWriter {

	/** Sets the contents of the update. */
	void setTransports(Map<String, String> transports) throws IOException;
}

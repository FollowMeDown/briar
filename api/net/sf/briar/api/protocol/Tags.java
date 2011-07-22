package net.sf.briar.api.protocol;

/**
 * User-defined tags for encoding and decoding protocol objects. An object
 * should have a user-defined tag if it appears in a list or a map, or if
 * objects of different types may be encountered in a given protocol state.
 */
public interface Tags {

	static final int ACK = 0;
	static final int AUTHOR_ID = 1;
	static final int BATCH = 2;
	static final int BATCH_ID = 3;
	static final int GROUP_ID = 4;
	static final int MESSAGE = 5;
	static final int MESSAGE_ID = 6;
	static final int SUBSCRIPTIONS = 7;
	static final int TRANSPORTS = 8;
}

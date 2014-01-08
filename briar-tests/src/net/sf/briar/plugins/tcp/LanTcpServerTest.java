package net.sf.briar.plugins.tcp;

import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import net.sf.briar.api.TransportConfig;
import net.sf.briar.api.TransportProperties;
import net.sf.briar.api.system.Clock;
import net.sf.briar.api.system.SystemClock;
import net.sf.briar.plugins.DuplexServerTest;

// This is not a JUnit test - it has to be run manually while the client test
// is running on another machine
public class LanTcpServerTest extends DuplexServerTest {

	private LanTcpServerTest(Executor executor) {
		callback = new ServerCallback(new TransportConfig(),
				new TransportProperties(),
				Collections.singletonMap(contactId, new TransportProperties()));
		Clock clock = new SystemClock();
		plugin = new LanTcpPlugin(executor, clock, callback, 0, 0, 0);
	}

	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newCachedThreadPool();
		try {
			new LanTcpServerTest(executor).run();
		} finally {
			executor.shutdown();
		}
	}
}

package net.sf.briar.reliability;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import net.sf.briar.api.reliability.ReliabilityExecutor;
import net.sf.briar.api.reliability.ReliabilityLayer;
import net.sf.briar.api.reliability.ReliabilityLayerFactory;
import net.sf.briar.api.reliability.WriteHandler;
import net.sf.briar.api.system.Clock;
import net.sf.briar.api.system.SystemClock;

class ReliabilityLayerFactoryImpl implements ReliabilityLayerFactory {

	private final Executor executor;
	private final Clock clock;

	@Inject
	ReliabilityLayerFactoryImpl(@ReliabilityExecutor Executor executor) {
		this.executor = executor;
		clock = new SystemClock();
	}

	public ReliabilityLayer createReliabilityLayer(WriteHandler writeHandler) {
		return new ReliabilityLayerImpl(executor, clock, writeHandler);
	}
}

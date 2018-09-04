package com.ctrip.xpipe.redis.console.healthcheck.ping;

import com.ctrip.xpipe.api.lifecycle.Lifecycle;
import com.ctrip.xpipe.api.lifecycle.Startable;
import com.ctrip.xpipe.api.lifecycle.Stoppable;

/**
 * @author chen.zhu
 * <p>
 * Aug 24, 2018
 */
public interface PingContext extends Lifecycle {

    long lastPingTimeMilli();

    long lastPongTimeMilli();

    boolean isHealthy();

    PingStatus getPingStatus();
}

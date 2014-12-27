package org.elasticsearch.plugin.direct;

import org.elasticsearch.common.inject.AbstractModule;

public class DirectRoutingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DirectRoutingHash.class).asEagerSingleton();
    }
}

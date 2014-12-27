package org.elasticsearch.plugin.direct;

import java.util.Collection;
import org.elasticsearch.common.collect.Lists;
import org.elasticsearch.common.inject.Module;
import org.elasticsearch.plugins.AbstractPlugin;

public class DirectRoutingPlugin extends AbstractPlugin {

    @Override
    public String name() {
        return "elasticsearch-direct-routing-plugin";
    }

    @Override
    public String description() {
        return "Elasticsearch Direct Routing Plugin";
    }

    @Override
    public Collection<Class<? extends Module>> modules() {
        Collection<Class<? extends Module>> modules = Lists.newArrayList();
        modules.add(DirectRoutingModule.class);
        return modules;
    }
}

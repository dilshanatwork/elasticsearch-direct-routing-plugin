package org.elasticsearch.plugin.direct;

import org.elasticsearch.cluster.routing.operation.hash.HashFunction;

public class DirectRoutingHash implements HashFunction {

    @Override
    public int hash(String routing) {
        int hash;
        try {
            hash = Integer.parseInt(routing);
        } catch (NumberFormatException exception) {
            hash = routing.hashCode();
        }

        return hash;
    }

    @Override
    public int hash(String type, String id) {
        int hash;
        try {
            hash = Integer.parseInt(id);
        } catch (NumberFormatException exception) {
            hash = type.hashCode() + 31 * id.hashCode();
        }

        return hash;
    }
}

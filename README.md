Elasticsearch Direct Routing Plugin
===================================

This plugin enables documents to be routed to shards according to the following formula.

```sh
selected_shard = routing_key % number_of_shards
```

For an example, consider a Elasticsearch index with 5 shards.
The table below shows how the documents will be routed to shards, for various routing keys .

| routing_key | selected_shard |
|-------------|----------------|
|      0      |        0       |
|      1      |        1       |
|      2      |        2       |
|      3      |        3       |
|      4      |        4       |
|      5      |        0       |
|      6      |        1       |
|      7      |        2       |

In order to install the plugin, simply run: 

```sh
bin/plugin --url https://github.com/dilshanatwork/elasticsearch-direct-routing-plugin/releases/download/1.0/elasticsearch-direct-routing-plugin-1.0.jar --install elasticsearch-direct-routing-plugin
```

Then add the following setting in the elasticsearch.yml file.

```sh
cluster.routing.operation.hash.type: org.elasticsearch.plugin.direct.DirectRoutingHash
```
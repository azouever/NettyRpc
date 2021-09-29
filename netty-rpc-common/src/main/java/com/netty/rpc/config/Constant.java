package com.netty.rpc.config;

/**
 * ZooKeeper constant
 *
 * @author luxiaoxun
 */
public interface Constant {
    int ZK_SESSION_TIMEOUT = 5000;
    int ZK_CONNECTION_TIMEOUT = 5000;

    String ZK_ADDRESS = "127.0.0.1:2181";

    String ZK_REGISTRY_PATH = "/registry";
    String ZK_DATA_PATH = ZK_REGISTRY_PATH + "/data";

    String ZK_NAMESPACE = "netty-rpc";
}

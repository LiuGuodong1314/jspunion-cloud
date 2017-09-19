package com.jspunion.server.loadbalancer;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

public class ConsumerRule extends AbstractLoadBalancerRule {


    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {

        System.out.println(clientConfig.getClientName());

    }

    @Override
    public Server choose(Object key) {
        ILoadBalancer loadBalancer = getLoadBalancer();
        List<Server> allServers = loadBalancer.getAllServers();
        if (null == allServers || allServers.size() == 0) {
            return null;
        }
        for (Server s : allServers) {
            if (s.isAlive() && s.isReadyToServe()) {
                return s;
            }
        }
        return null;
    }
}

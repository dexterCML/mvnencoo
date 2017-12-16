package com.encoo.zk;

import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA
 * User:Administrator
 * Date:2017/12/16
 * Time:15:55
 */


public class ConnectZookeeperTest {
    @Test
    public void getZkValue() {
        String connPara = "192.168.188.130:2180,192.168.188.130:2181,192.168.188.130:2182";
        try {
            ZooKeeper zk = new ZooKeeper(connPara,2000,null);
            Stat stat = new Stat();
            byte[] bytes = zk.getData("/root",null,stat);
            System.out.println(new String(bytes));
        } catch (Exception e) {
            e.printStackTrace();
        }
}
}

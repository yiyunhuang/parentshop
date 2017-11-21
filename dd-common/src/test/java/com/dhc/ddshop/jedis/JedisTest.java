package com.dhc.ddshop.jedis;

import org.junit.Test;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import java.util.HashSet;
import java.util.Set;

public class JedisTest {

    /*@Test
    public void testJedis01(){
        Jedis jedis=new Jedis("10.31.161.110",6379);
        jedis.set("name","hyf");
        System.out.println(jedis.get("name"));
        jedis.close();
    }

    @Test
    public void testJedis02(){
        JedisPool pool=new JedisPool("10.31.161.110",6379);
        Jedis jedis = pool.getResource();
        jedis.set("key1","value1");
        System.out.println(jedis.get("key1"));
        jedis.close();
        pool.close();
    }

    @Test
    public void testJedis03(){
        //创建存放节点的集合
        Set<HostAndPort> nodes =new HashSet<HostAndPort>();
        nodes.add(new HostAndPort("10.31.161.110",9001));
        nodes.add(new HostAndPort("10.31.161.110",9002));
        nodes.add(new HostAndPort("10.31.161.110",9003));
        nodes.add(new HostAndPort("10.31.161.110",9004));
        nodes.add(new HostAndPort("10.31.161.110",9005));
        nodes.add(new HostAndPort("10.31.161.110",9006));
        //创建jedis集群对象进行使用
        JedisCluster jedisCluster=new JedisCluster(nodes);
        jedisCluster.set("name","uuuuu");
        jedisCluster.hset("content_list","123456","dhc");
        System.out.println(jedisCluster.get("name"));
        jedisCluster.close();
    }
    */
}

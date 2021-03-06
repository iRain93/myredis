package com.iRain93.myredis.jedis;

import redis.clients.jedis.Jedis;

/**
 * 用一句话描述次类
 * @author lu
 * @version 1.0
 */
public class Demo1 {

    public static void main(String[] args) {
        // 连接本地的Redis服务
        Jedis jedis = new Jedis("192.168.0.93",6379);
        // 查看服务是否运行
        System.out.println(jedis.ping());
        jedis.set("hello", "hello world ");
        System.out.println(jedis.get("hello"));
    }
}

/*
 * @(#) HashMapDebug.java 2019-03-01
 *
 * Copyright 2019 NetEase.com, Inc. All rights reserved.
 */

package com.nc.study;

import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.Message;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author haoshijing
 * @version 2019-03-01
 */
public class HashMapDebug {
    public static void main(String[] args) throws Exception {
        Vertx vertx = Vertx.vertx();

        vertx.eventBus().consumer("/test", new Handler() {

            @Override
            public void handle(Object event) {
                Message<String> message = (Message<String>) event;

                System.out.println("event = [" + ((Message<String>) event).body() + "]" + Thread.currentThread().getName());
            }
        });


        vertx.eventBus().publish("/test", "hello,world");
        System.out.println("args = [" + Thread.currentThread().getName() + "]");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        countDownLatch.await(100, TimeUnit.SECONDS);


    }
}

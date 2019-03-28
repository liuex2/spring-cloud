package com.spring.cloud.server.excutor;

import java.util.concurrent.*;

/**
 * @author liuxincai
 * <p>
 * 线程池
 */
public class ThreadPoolDemo {


    /**
     * 1
     * corePoolSize
     * int
     * 核心线程池大小
     * <p>
     * <p>
     * 2
     * maximumPoolSize
     * int
     * 最大线程池大小
     * <p>
     * <p>
     * 3
     * keepAliveTime
     * long
     * 线程最大空闲时间
     * <p>
     * <p>
     * 4
     * unit
     * TimeUnit
     * 时间单位
     * <p>
     * <p>
     * 5
     * workQueue
     * BlockingQueue<Runnable>
     * 线程等待队列
     * <p>
     * <p>
     * 6
     * threadFactory
     * ThreadFactory
     * 线程创建工厂
     * <p>
     * <p>
     * 7
     * handler
     * RejectedExecutionHandler
     * 拒绝策略
     */
//    public ThreadPoolExecutor(int corePoolSize, // 1
//                              int maximumPoolSize,  // 2
//                              long keepAliveTime,  // 3
//                              TimeUnit unit,  // 4
//                              BlockingQueue<Runnable> workQueue, // 5
//                              ThreadFactory threadFactory,  // 6
//                              RejectedExecutionHandler handler ) { //7
//        if (corePoolSize < 0 ||
//                maximumPoolSize <= 0 ||
//                maximumPoolSize < corePoolSize ||
//                keepAliveTime < 0)
//            throw new IllegalArgumentException();
//        if (workQueue == null || threadFactory == null || handler == null)
//            throw new NullPointerException();
//        this.corePoolSize = corePoolSize;
//        this.maximumPoolSize = maximumPoolSize;
//        this.workQueue = workQueue;
//        this.keepAliveTime = unit.toNanos(keepAliveTime);
//        this.threadFactory = threadFactory;
//        this.handler = handler;
//    }




    public static ExecutorService newFixedThreadPool(int nThreads) {
        return new ThreadPoolExecutor(nThreads, nThreads,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
    }




   /**
    * @author liuxincai
    * @date 2019/3/15
      * @param null
    * @return
    */
    public static ExecutorService newCachedThreadPool() {
        return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());
    }

    /**
     * FinalizableDelegatedExecutorService包装类保证线程是单例的
     *
     * @return
     */
//    public static ExecutorService newSingleThreadExecutor() {
//        return new FinalizableDelegatedExecutorService
//                (new ThreadPoolExecutor(1, 1,
//                        0L, TimeUnit.MILLISECONDS,
//                        new LinkedBlockingQueue<Runnable>()));
//    }


    public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize) {
        return new ScheduledThreadPoolExecutor(corePoolSize);
    }


}

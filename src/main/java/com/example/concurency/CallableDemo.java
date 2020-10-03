package com.example.concurency;

import java.util.Collection;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CallableDemo {

    public static void main(String[] args) throws InterruptedException {
        CallableDemo demo = new CallableDemo();
        demo.run(100, 30000);
    }

    public void run(int count, int timeOut) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Collection<Future<String>> futures = IntStream.range(0, count)
                .mapToObj(i -> executor.submit(new StringCallable(timeOut)))
                .collect(Collectors.toList());

       executor.awaitTermination(10, TimeUnit.MINUTES);
    }

    public void pushNotify() {
        ExecutorService scheduledExecutor = Executors.newSingleThreadScheduledExecutor();

        while (true) {
            try {
                System.out.println("START Submit to the scheduledExecutor");
                scheduledExecutor.submit(new ThreadNotifier()).get();
                System.out.println("END Submit to the scheduledExecutor");
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static class StringCallable implements Callable<String> {
        private final int timeOut;

        public StringCallable(int timeOut) {
            this.timeOut = timeOut;
        }

        @Override
        public String call() throws Exception {
            System.out.println(String.format("%s: Going to sleep", Thread.currentThread().getName()));
            Thread.sleep(timeOut);
            System.out.println(String.format("%s: After sleep", Thread.currentThread().getName()));

            return Thread.currentThread().getName();
        }
    }

    public static class ThreadNotifier implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            notify();
        }
    }
}

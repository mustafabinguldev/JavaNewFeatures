package tech.bingulhan.jdk21;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThreadsExamples {
    public static void main(String[] args) throws InterruptedException {


        Thread thread = Thread.startVirtualThread(() -> {

            System.out.println("Hello World 1");

        });

        Thread thread2 = Thread.ofVirtual().start(() -> {
            System.out.println("Hello World 2");
        });

        Thread.Builder builder = Thread.ofPlatform().name("Thread-Platform");
        builder.start(() -> {
            System.out.println("Hello World 3");
        });


        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 10_000).forEach(i -> {
                executor.submit(() -> {
                    Thread.sleep(Duration.ofSeconds(1));
                    return i;
                });
            });
        }


        Thread.sleep(1000);
    }




}
package ch13_concurrency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ex22();
    }

    public static void ex22() {
        try {
            new BedTime().countSheep();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ex21() {
        var data = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6)
        );

        data.parallelStream()
                .flatMap(Collection::stream)
                .findFirst()
                .ifPresent(System.out::print);
    }
    public static void ex15() {
        var cats = Stream.of("leopard", "lynx", "ocelot", "puma").parallel();
        var bears = Stream.of("panda", "grizzly", "polar").parallel();
        var data = Stream.of(cats, bears).flatMap(s -> s).collect(Collectors.groupingByConcurrent(s -> !s.startsWith("p")));

        System.out.println(data.get(false).size() + " " + data.get(true).size());
    }

    public static void ex13() {
        System.out.println(
                List.of("duck", "flamingo", "pelican")
                        .parallelStream().parallel() //compiles, but redundant
                        .reduce(0,
                                (c1, c2) -> c1 + c2.length(),
                                (s1, s2) -> s1 + s2
                        )
        );
    }

    private static void takeNap() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void ex12() {
        ExecutorService service = Executors.newFixedThreadPool(4);
        try {
            service.execute(() -> {
                try {
                    takeNap();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            service.execute(() -> {
                try {
                    takeNap();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            service.execute(() -> {
                try {
                    takeNap();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        } finally {
            service.shutdown();
        }

        try {
            service.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Done!");
    }

    public static void ex11() {
        Integer i1 = List.of(1, 2, 3, 4, 5).stream().findAny().get();

        synchronized (i1) {
            Integer i2 = List.of(6, 7, 8, 9, 10)
                    .parallelStream()
                    .sorted()
                    .findAny().get();

            System.out.println(i1 + " " + i2);
        }
    }

    public static void ex10() {
        List<Integer> lions = new ArrayList<>(List.of(1,2,3));
        List<Integer> tigers = new CopyOnWriteArrayList<>(lions);
        Set<Integer> bears = new ConcurrentSkipListSet<>();
        bears.addAll(lions);

        for(Integer item : tigers) tigers.add(4);
        for(Integer item : bears) bears.add(5);

        System.out.println(lions.size() + " " + tigers.size() + " " + bears.size());
    }

    public static void ex5() {
        var value1 = new AtomicLong(0);
        final long[] value2 = {0};

        IntStream.iterate(1, i -> 1).limit(100).parallel().forEach(i -> value1.incrementAndGet());
        IntStream.iterate(1, i -> 1).limit(100).parallel().forEach(i -> ++value2[0]);

        System.out.println(value1 + " " + value2[0]);
    }

    public static void ex4() {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        service.scheduleWithFixedDelay(() -> {
            System.out.println("open zoo");
        }, 0, 1, TimeUnit.MINUTES);

        var result = service.submit(() -> System.out.println("wake staff"));

        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ex2() {
        var bank = new Bank();
        IntStream.range(1, 1000).parallel()
                .forEach(s -> bank.deposit(s));

        System.out.println(bank.getTotal());
    }
}

class CountZooAnimals {
    public static void performCount(int animal) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printResults(Future<?> f) {
        try {
            System.out.println(f.get(1, TimeUnit.SECONDS));
        } catch (Exception e) {
            System.out.println("class = " + e.getClass());
            System.out.println("Exception!");
        }
    }

    public static void main(String[] args) {
        final var r  = new ArrayList<Future<?>>();
        ExecutorService s = Executors.newSingleThreadExecutor();

        try {
            for(int i = 0; i < 10; i++) {
                final int animal = i;
                r.add(s.submit(() -> performCount(animal)));
            }
            r.forEach(f -> printResults(f));
        } finally {
            s.shutdown();
        }
    }
}


class BedTime {
    private AtomicInteger s1 = new AtomicInteger(0);
    private int s2 = 0;

    public void countSheep() throws InterruptedException {
        Consumer<Integer> c = (Integer x) -> {
            System.out.println(x);
            s2++;
        };
        var service = Executors.newSingleThreadExecutor();
        try {
            for(int i = 0; i < 100; i++) {
                service.execute(() -> {
                    s1.incrementAndGet();
                    s2++;
                });
            }
            Thread.sleep(6 * 1000);
        } finally {
            service.shutdown();
        }

        System.out.println(s1 + " " + s2);
    }
}


class Bank {
    private Lock vault = new ReentrantLock();
    private int total = 0;

    public void deposit(int value) {
        if(vault.tryLock()) {
            try {
                total += value;
            } finally {
                vault.unlock();
            }
        }
    }

    public int getTotal() {
        return total;
    }
}

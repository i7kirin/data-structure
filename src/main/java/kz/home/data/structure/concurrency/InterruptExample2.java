package kz.home.data.structure.concurrency;

import java.math.BigInteger;

/**
 * @author duman
 * @createdAt 27/04/2023 22:42
 * @project data-structure
 */

// The second approach to interrupt a thread is setting the thread as a daemon. They are used for background tasks, which result is unimportant
public class InterruptExample2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new LongComputationTask2(new BigInteger("2000"), new BigInteger("100000")));
        thread.setDaemon(true);
        thread.start();
        thread.interrupt();
    }

    private static class LongComputationTask2 implements Runnable{

        private BigInteger base;
        private BigInteger power;

        public LongComputationTask2(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            System.out.println(base + "^" + power + " = " + pow());
        }

        private BigInteger pow() {
            BigInteger result = BigInteger.ONE;
            for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0 ; i = i.add(BigInteger.ONE)) {
                result = result.multiply(base);
            }
            return result;
        }
    }
}

package kz.home.data.structure.concurrency;

import java.math.BigInteger;

/**
 * @author duman
 * @createdAt 27/04/2023 22:27
 * @project data-structure
 */
public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new LongComputationTask(new BigInteger("2000"), new BigInteger("100000")));
        thread.start();
        thread.interrupt();
    }

    private static class LongComputationTask implements Runnable{

        private BigInteger base;
        private BigInteger power;

        public LongComputationTask(BigInteger base, BigInteger power) {
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
                if (Thread.interrupted())
                    return BigInteger.ZERO; // We need check if current thread is interrupted, otherwise it would not interrupt
                result = result.multiply(base);
            }
            return result;
        }
    }
}

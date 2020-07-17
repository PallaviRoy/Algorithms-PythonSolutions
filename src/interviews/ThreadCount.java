package interviews;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

// 1. given an input integer array
// 2. for each element, create a new thread:
//      a. in each thread:
//          i. sleep this thread for the value of the integer being iterated over
//          ii. after the sleep, append this integer to some common output list
// 3. after all threads are finished executing, return this common output list

// Example:
// arr length = 5
// 5 threads
// [1,2,3,4,5] ; [5,2,4,1]
// thread.sleep(5)
// list -> 1,2,4,5
// O(length(arr) + max(arr))
// [10, 1]; [10000, 1]

public class ThreadCount {

    public List<Integer> foo(int[] arr) throws InterruptedException {
        List<Integer> res = new ArrayList<>();
        if (arr == null || arr.length == 0)
            return res;

        CountDownLatch latch = new CountDownLatch(arr.length);

        for(int i: arr) {
            Thread t = new NewThread(i, res, latch);
            t.start();
        }
        latch.await();
        return res;
    }

    public static void main(String[] args) throws InterruptedException {
        List<Integer> res = new ThreadCount().foo(new int[]{1, 5, 2, 10}); // result: 1,2,5,10
        System.out.println(res);
    }


    class NewThread extends Thread {

        int sleepTime = 0;
        List<Integer> res;
        CountDownLatch latch;

        public NewThread(int time, List<Integer> res, CountDownLatch latch) {
            this.sleepTime = time;
            this.res = res;
            this.latch = latch;
        }

        public void run() {
            try {
                this.sleep(this.sleepTime);
                this.res.add(sleepTime);
            }
            catch (InterruptedException intEx) {
                intEx.printStackTrace();
            } finally {
                this.latch.countDown();
            }

        }

    }

}
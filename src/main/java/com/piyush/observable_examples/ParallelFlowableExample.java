package com.piyush.observable_examples;

import com.google.common.collect.ImmutableList;
import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;
import java.util.logging.Logger;

/**
 * @author Piyush Nagar on 5/6/17.
 */
class FirstExample {
  private FirstExample() {
  }
  public static void main(String[] args) {
    Logger logger = Logger.getLogger("FirstExample"); //Test Example
    Flowable.fromIterable(ImmutableList.of("abc", "def"))
        .parallel()
        .runOn(Schedulers.computation())
        .doOnNext(x -> logger.info("Thread is" + Thread.currentThread().getName()))
        .sequential()
        .subscribe();
  }
}

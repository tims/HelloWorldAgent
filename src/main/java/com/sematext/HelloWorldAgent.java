package com.sematext;

import java.lang.instrument.Instrumentation;

public class HelloWorldAgent {

  public static void premain(String agentArgs, Instrumentation inst) {
    Thread thread = new Thread(new Runnable() {
      public void run() {
        while (true) {
          System.out.println("Hello world");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            System.out.println("interrupted.. breaking loop");
            break;
          }
        }
      }
    });
    thread.start();
  }
}

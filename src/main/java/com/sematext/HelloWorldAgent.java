/*
 *    Copyright (c) Sematext International
 *    All Rights Reserved
 *
 *    THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF Sematext International
 *    The copyright notice above does not evidence any
 *    actual or intended publication of such source code.
 */
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

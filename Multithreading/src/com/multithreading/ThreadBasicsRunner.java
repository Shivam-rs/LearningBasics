// extend Thread class
// implements Runnable
package com.multithreading;

class Task1 extends Thread {
	@Override
	public void run() {
		System.out.println("\n Task 1 has Started");

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		System.out.println("Task 1 has ended");
	}
}


class Task2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task 2 has Started");

		for (int i = 5; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println("Task 2 has ended");

	}

}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Task1 task1 = new Task1();
		task1.setPriority(10);
		task1.start();


		// Task2 task2 = new Task2();
		Thread task2Thread = new Thread(new Task2());

		task2Thread.setPriority(1);
		task2Thread.start();

		task1.join();

		System.out.println("Task 3 has Started");

		for (int i = 10; i < 15; i++) {
			System.out.println(i);
		}

		System.out.println("Task 3 has ended");

	}

}

package com.eway.myapplication;

/**
 * 作者：zwk
 * 时间：on 2019/4/4 13:43
 * 功能：线程A
 */
public class ThreadA extends Thread {
	private Service mService;

	public ThreadA(Service mService) {
		this.mService = mService;
	}

	@Override
	public void run() {
		super.run();
		mService.print("AA");
	}
}

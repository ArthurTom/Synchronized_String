package com.eway.myapplication;

/**
 * 作者:zwk
 * 联系方式：497981239@qq.com
 * 时间：on 2019/4/4 13:50
 * 功能：
 */
public class ThreadB extends Thread {
	private Service mService;

	public ThreadB(Service mService) {
		this.mService = mService;
	}

	@Override
	public void run() {
		super.run();
		mService.print("AA");
	}
}

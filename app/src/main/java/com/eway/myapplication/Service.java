package com.eway.myapplication;

import android.util.Log;

/**
 * 作者：zwk
 * 时间：on 2019/4/4 13:34
 * 功能：线程中执行的方法
 */
public class Service {

	public static void print(String pritString) {
		synchronized (pritString) {
			while (true) {
				Log.d("zwk", "hascode"+pritString.hashCode()+"当前运行的Thread的名称" + Thread.currentThread().getName());
			}
		}

	}
}

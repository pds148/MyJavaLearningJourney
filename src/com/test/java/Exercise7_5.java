package com.test.java;

class MyTv5 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	int getChannel() {
		return channel;
	}
	
	int getVolume() {
		return volume;
	}
	
	void setChannel(int channel) {
		if(channel < 1 || channel > 100)
			return;
		prevChannel = this.channel;
		this.channel = channel;
	}
	
	void setVolume(int volume) {
		if(volume < 0 || volume > 100)
			return;
		this.volume = volume;
	}
	
	void gotoPrevChannel() {
		setChannel(prevChannel);
	}
}

public class Exercise7_5 {
	public static void main(String args[]) {
		MyTv5 t = new MyTv5();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}
}
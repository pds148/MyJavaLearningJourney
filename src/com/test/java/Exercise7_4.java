package com.test.java;

class MyTv4 {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int Max_CHANNEL = 100;
	final int MiN_CHANNEL = 0;
	
	int getChannel() {
		return channel;
	}

	int getVolume() {
		return volume;
	}

	void setChannel(int channel) {
		if(channel < 0 || channel > 100)
			return;
		this.channel = channel;
	}
	
	void setVolume(int volume) {
		if(volume < 0 || volume > 100)
			return;
		this.volume = volume;
	}
}

public class Exercise7_4 {
	public static void main(String args[]) {
		MyTv4 t = new MyTv4();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}
}

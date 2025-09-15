package org.tnsif.sf.interfacedemo;

public interface Camera {
	void takePhoto();
}

interface MusicPlayer
{
	void playMusic();
}

class SmartPhone implements Camera, MusicPlayer
{

	@Override
	public void playMusic() {
		
		System.out.println("Taking a Photo with the smartPhone camera");
	}

	@Override
	public void takePhoto() {
		
		System.out.println("Playing Music on the smartPhone");
	}
	
}


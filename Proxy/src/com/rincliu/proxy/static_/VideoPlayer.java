package com.rincliu.proxy.static_;

public class VideoPlayer {
	private VideoPlayerInternal vpi;
	
	public VideoPlayer()
	{
		vpi = new VideoPlayerInternal();
	}

	public void play(String uri) {
		vpi.play(uri);
	}
}

class VideoPlayerInternal {
	public void play(String uri) {
		System.out.println("Playing '" + uri + "' ...");
	}
}
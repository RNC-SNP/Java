package com.rincliu.proxy.dynamic;

public class VideoPlayerImpl implements IVideoPlayer {

	@Override
	public void play(String uri) {
		System.out.println("Playing '" + uri + "' ...");
	}

}

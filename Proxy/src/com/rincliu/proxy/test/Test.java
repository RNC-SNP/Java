package com.rincliu.proxy.test;

import java.lang.reflect.Proxy;

import com.rincliu.proxy.dynamic.IVideoPlayer;
import com.rincliu.proxy.dynamic.VideoPlayerImpl;
import com.rincliu.proxy.dynamic.VideoPlayerInvocationHandler;
import com.rincliu.proxy.static_.VideoPlayer;

public class Test {
	public static void main(String[] args)
	{
		String uri = "/sdcard/demo.mp4";
		new VideoPlayer().play(uri);
		
		ClassLoader loader = IVideoPlayer.class.getClassLoader();
		Class<?>[] interfaces = new Class[] {IVideoPlayer.class};
		VideoPlayerInvocationHandler handler = new VideoPlayerInvocationHandler(new VideoPlayerImpl());
		IVideoPlayer player = (IVideoPlayer) Proxy.newProxyInstance(loader, interfaces, handler);
		player.play(uri);
	}
}

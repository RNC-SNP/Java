package com.rincliu.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class VideoPlayerInvocationHandler implements InvocationHandler {
	
	private Object target;

    public VideoPlayerInvocationHandler(Object target) {
        this.target = target;
    }

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(target, args);
	}

}

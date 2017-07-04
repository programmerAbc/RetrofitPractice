package com.practice.retrofit.cache;


public interface Cache {

	public Entry get(String key);

	public void put(String key, Entry entry);

	public void initialize();

	public void invalidate(String key);

	public void remove(String key);

	public void clear();
	
	public void releaseCache();
	
	public long getCacheSize();
}

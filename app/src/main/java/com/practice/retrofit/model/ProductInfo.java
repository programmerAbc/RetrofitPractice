package com.practice.retrofit.model;


import com.practice.retrofit.db.tables.UserInfo;

public class ProductInfo extends BaseInfo {
	/**
	 * 审核中
	 */
	public static final int STATUS_CHECK = 2;
	
	private String id;
	private String title;
	private String videoPath;
	private String imgPath;
	private String danceType;
	private String location;
	private double latitude;
	private double longitude;
	private long videoTime;
	private long createTime;
	private long uploadTime;
	private long size;
	private int onclicks;
	private UserInfo user;
	private int status;
	
	public int errno;
	public String error;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getVideoPath() {
		return videoPath;
	}
	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public String getDanceType() {
		return danceType;
	}
	public void setDanceType(String danceType) {
		this.danceType = danceType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public long getVideoTime() {
		return videoTime;
	}
	public void setVideoTime(long videoTime) {
		this.videoTime = videoTime;
	}
	public long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	public long getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(long uploadTime) {
		this.uploadTime = uploadTime;
	}
	public UserInfo getUser() {
		return user;
	}
	public void setUser(UserInfo user) {
		this.user = user;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public int getOnclicks() {
		return onclicks;
	}
	public void setOnclicks(int onclicks) {
		this.onclicks = onclicks;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}

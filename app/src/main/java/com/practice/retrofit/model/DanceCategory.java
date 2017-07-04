package com.practice.retrofit.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "danceCategory")
public class DanceCategory implements Parcelable{
	public static DanceCategory ALL = new DanceCategory();
	static {
		ALL.key = "-1";
		ALL.value = "综合";
		ALL.isChecked = 1;
		ALL.hit = Integer.MIN_VALUE;
	}
	@DatabaseField(generatedId = true)
	public int id;
	@DatabaseField
	public String key;
	@DatabaseField
	public String value;
	@DatabaseField
	public int hit;
	@DatabaseField
	public int isChecked;
	
	public DanceCategory() {
	}
	
	public DanceCategory(Parcel in) {
		key = in.readString();
		value = in.readString();
	}
	
	public DanceCategory(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DanceCategory other = (DanceCategory) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel out, int flags) {
		out.writeString(key);
		out.writeString(value);
	}

	public static final Creator<DanceCategory> CREATOR = new Creator<DanceCategory>() {
		@Override
		public DanceCategory createFromParcel(Parcel in) {
			return new DanceCategory(in);
		}

		@Override
		public DanceCategory[] newArray(int size) {
			return new DanceCategory[size];
		}
	};
}

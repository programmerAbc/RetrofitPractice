package com.practice.retrofit.util;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.location.LocationManager;
import android.media.MediaRecorder;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Binder;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.provider.Settings.SettingNotFoundException;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeviceUtils {
	private static final String TAG = DeviceUtils.class.getSimpleName();

	public static boolean isNetworkAvailable(Context context) {
		ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		if (cm == null) {
			return false;
		}
		NetworkInfo mNetworkInfo = cm.getActiveNetworkInfo();
		if (mNetworkInfo != null) {
			return mNetworkInfo.isAvailable();
		}
		return false;
	}

	public static boolean hasOpenedGPS(Context context) {
		LocationManager locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
		return (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER));
	}

	public static File getAvailableStorageDirectory(Context context) {
		File directory = null;
		if (isSDcardAvailable()) {
			directory = Environment.getExternalStorageDirectory();
		} else {
			directory = context.getFilesDir();
		}
		return directory;
	}

	public static boolean isSDcardAvailable() {
		try {
			return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static String getLocalMacAddress(Context context) {
		WifiManager wifi = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
		WifiInfo info = wifi.getConnectionInfo();
		return info.getMacAddress();
	}

	public static String getLocalIpAddress() {
		try {
			for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements();) {
				NetworkInterface intf = en.nextElement();
				for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements();) {
					InetAddress inetAddress = enumIpAddr.nextElement();
					if (!inetAddress.isLoopbackAddress()) {
						return inetAddress.getHostAddress();
					}
				}
			}
		} catch (SocketException ex) {
			Log.e(TAG, ex.toString());
		}
		return null;
	}

	public static String getIMeiString(Context context) {
		TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
		String imei = tm.getDeviceId();
		return imei;
	}

	public static String getNativePhoneNumber(Context context) {
		TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
		return telephonyManager.getLine1Number();

	}

	public static void showSoftInput(View v) {
		v.setFocusable(true);
		v.setFocusableInTouchMode(true);
		v.requestFocus();
		InputMethodManager inputManager = (InputMethodManager) v.getContext()
				.getSystemService(Context.INPUT_METHOD_SERVICE);
		inputManager.showSoftInput(v, 0);
	}

	public static void hideSoftInput(View v) {
		InputMethodManager imm = (InputMethodManager) v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
		imm.showSoftInput(v, InputMethodManager.SHOW_FORCED);
		imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
	}

	public static void setScreenRotation(ContentResolver cr, boolean rotation) {
		Settings.System.putInt(cr, Settings.System.ACCELEROMETER_ROTATION, rotation ? 1 : 0);
	}

	public static boolean isScreenRotation(ContentResolver cr) throws SettingNotFoundException {
		return Settings.System.getInt(cr, Settings.System.ACCELEROMETER_ROTATION) == 1;
	}

	/**
	 * 检验手机号码
	 * 
	 * @param phone
	 * @return
	 */
	public static boolean checkPhone(String phone) {
		String check = "^[1][3-8]+\\d{9}";
		Pattern p = Pattern.compile(check);
		Matcher m = p.matcher(phone);
		return m.matches();
	}

	/**
	 * 检验邮箱
	 * 
	 * @param email
	 * @return
	 */
	public static boolean checkEmail(String email) {
		String check = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		Pattern p = Pattern.compile(check);
		Matcher m = p.matcher(email);
		return m.matches();
	}

	/**
	 * 检验号码
	 * 
	 * @param num
	 * @return
	 */
	public static boolean checkNumber(String num) {
		String check = "[0-9]";
		Pattern p = Pattern.compile(check);
		Matcher m = p.matcher(num);
		return m.matches();
	}

	/**
	 * 检测用户名
	 * 
	 * @param text
	 * @return
	 */
	public static boolean checkUserName(String text) {
		String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(text);
		if (m.find()) {
			return false;
		}
		return true;
	}

	public static int getStrLength(String str) {
		int length = 0;
		for (int i = 0; i < str.length(); i++) {
			if (isChinese(str.charAt(i))) {
				length += 2;
			} else {
				length += 1;
			}
		}
		return length;
	}

	private static boolean isChinese(char c) {
		Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
		if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
				|| ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
				|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
				|| ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
				|| ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
				|| ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
			return true;
		}
		return false;
	}

	public static int getStatusBarHeight(Activity activity) {
		Rect frame = new Rect();
		activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
		return frame.top;
	}
	
	/**
	 *  检测摄像头权限
	 * @param context
	 * @return
	 */
	public static boolean isCameraPermission() {
		boolean able = true;
		Camera camera = null;
		try {
			 camera = Camera.open();
		} catch (Exception e) {
			able = false;
		}
		if (null != camera) {
			camera.release();
			camera = null;
		}
		return able;
	}
	
	/**
	 * 检测录制权限
	 * @return
	 */
	public static boolean isRecorderPermission() {
		MediaRecorder recorder = new MediaRecorder();
		try {
			
			recorder.reset();
			recorder.setAudioSource(MediaRecorder.AudioSource.CAMCORDER);
			recorder.setVideoSource(MediaRecorder.VideoSource.CAMERA);
		} catch (Exception e) {
			recorder.release();
			recorder = null;
			return false;
		}
		recorder.release();
		recorder = null;
		return true;
	}

	/**
	 * 检测摄像头权限
	 * 
	 * @param context
	 * @return
	 */
	public static boolean checkCameraPermission(Context context) {
		final int OP_CAMERA = 26;
		int result = checkOp(context, OP_CAMERA);
		return result == 0;
	}

	/**
	 * 检测录制权限
	 * 
	 * @return
	 */
	public static boolean checkRecorderPermission(Context context) {
		final int OP_RECORD_AUDIO = 27;
		int result = checkOp(context, OP_RECORD_AUDIO);
		return result == 0;
	}

	/**
	 * 0： 有权限 1：无权限
	 * 
	 * @param context
	 * @param op
	 * @return
	 */
	private static int checkOp(Context context, int op) {
		final int version = Build.VERSION.SDK_INT;
		if (version >= 19) {
			AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(Context.APP_OPS_SERVICE);

			Class aomClass = appOpsManager.getClass();
			try {
				Class[] types = new Class[3];
				types[0] = Integer.TYPE;
				types[1] = Integer.TYPE;
				types[2] = String.class;
				Method checkOpMethod = aomClass.getMethod("checkOp", types);

				Object[] args = new Object[3];
				args[0] = Integer.valueOf(op);
				args[1] = Integer.valueOf(Binder.getCallingUid());
				args[2] = context.getPackageName();
				Integer result = (Integer) checkOpMethod.invoke(appOpsManager, args);
				Log.d("--wk--", "checkOp : " + op + "    result : " + result);
				return result;
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
				return AppOpsManager.MODE_ERRORED;
			}

		}
		return AppOpsManager.MODE_ALLOWED;
	}

	/**
	 * 设置权限
	 * @param context
	 * @param code
	 * @param uid
	 * @param mode
	 * @return
	 */
	public static boolean setMode(Context context, int code, int uid, int mode) {
		AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(Context.APP_OPS_SERVICE);
		Class appOpsManagerClass = appOpsManager.getClass();

		try {
			Class[] types = new Class[4];
			types[0] = Integer.TYPE;
			types[1] = Integer.TYPE;
			types[2] = String.class;
			types[3] = Integer.TYPE;
			Method setModeMethod = appOpsManagerClass.getMethod("setMode", types);

			Object[] args = new Object[4];
			args[0] = Integer.valueOf(code);
			args[1] = Integer.valueOf(uid);
			args[2] = context.getPackageName();
			args[3] = Integer.valueOf(mode);
			setModeMethod.invoke(appOpsManager, args);

			return true;
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return false;
	}
}

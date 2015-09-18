package com.mining.app.zxing;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

/**
 * R replacement for PhoneGap Build.
 *
 * ([^.\w])R\.(\w+)\.(\w+)
 * $1fakeR("$2", "$3")
 *
 * @author Maciej Nux Jaros
 */
public class FakeR {
	private Context context;
	private String packageName;

	public FakeR(Activity activity) {
		context = activity.getApplicationContext();
		packageName = context.getPackageName();
		Log.d("activity.getPackageName()", packageName);
	}

	public FakeR(Context context) {
		this.context = context;
		packageName = context.getPackageName();
		Log.d("context.getPackageName()", packageName);
	}

	public int getId(String group, String key) {
		return context.getResources().getIdentifier(key, group, packageName);
	}

	public static int getId(Context context, String group, String key) {
		return context.getResources().getIdentifier(key, group, context.getPackageName());
	}
}

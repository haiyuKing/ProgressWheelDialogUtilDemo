package com.why.project.progresswheeldialogutildemo.activity;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;

import com.why.project.progresswheeldialogutildemo.utils.progress.ProgressWheelDialogUtil;

/**
 * Created by HaiyuKing
 * Used activty基类
 */

public class BaseActivity extends AppCompatActivity{


	/*========================ProgressWheelDialogUtil相关====================================*/
	/** 自定义进度加载框 */
	public Dialog progressDialog = null;

	/**
	 * 显示进度加载对话框
	 * @param msg 显示内容
	 */
	public void showProgressDialog(String msg) {
		try {
			if (progressDialog == null || !progressDialog.isShowing()) {
				progressDialog = ProgressWheelDialogUtil.createProgressWheelDialog(this, msg);
			}
			ProgressWheelDialogUtil.setDialogMsg(msg);
			progressDialog.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 上传、下载进度加载对话框
	 * @param msg 显示内容
	 */
	public void showProgressDialogUpload(String msg) {
		try {
			if (progressDialog == null || !progressDialog.isShowing()) {
				progressDialog = ProgressWheelDialogUtil.createProgressWheelDialogUpload(this, msg);
			}
			ProgressWheelDialogUtil.setDialogMsg(msg);
			progressDialog.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 隐藏进度加载对话框
	 */
	public void dismissProgressDialog() {
		try {
			if (progressDialog != null && progressDialog.isShowing()) {
				progressDialog.dismiss();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

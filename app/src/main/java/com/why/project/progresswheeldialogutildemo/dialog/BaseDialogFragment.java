package com.why.project.progresswheeldialogutildemo.dialog;


import android.app.Dialog;
import android.support.v4.app.DialogFragment;

import com.why.project.progresswheeldialogutildemo.utils.progress.ProgressWheelDialogUtil;

/**
 * @Created HaiyuKing
 * @Used  DialogFragment基类
 */
public class BaseDialogFragment extends DialogFragment{

	
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
                progressDialog = ProgressWheelDialogUtil.createProgressWheelDialog(getActivity(), msg);
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
                progressDialog = ProgressWheelDialogUtil.createProgressWheelDialogUpload(getActivity(), msg);
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

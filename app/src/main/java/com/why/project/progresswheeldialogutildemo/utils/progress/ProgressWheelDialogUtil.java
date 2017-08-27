package com.why.project.progresswheeldialogutildemo.utils.progress;


import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.why.project.progresswheeldialogutildemo.R;


/**
 * @Created HaiyuKing
 * @Used  和ProgressWheel结合生成progressDialog
 */
public class ProgressWheelDialogUtil {
	
	private static TextView tipTextView;

	/*=============进度加载对话框=====目前主要用于APP加载对话框================*/
	/**
	 * 进度加载对话框：样式一（左侧为ProgressBar【ProgressWheel】，右侧为TextView的样式）
	 * */
    public static Dialog createProgressWheelDialog(Context context, String msg) {
    	//引用进度加载对话框布局文件
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.progress_wheel_dialog, null);
        //获取布局文件根节点
		LinearLayout layout = (LinearLayout) v.findViewById(R.id.dialog_view);
        //获取进度条文本并赋值
        tipTextView = (TextView) v.findViewById(R.id.progress_text);
        tipTextView.setText(msg);
        //声明一个dialog对象并指定样式
        Dialog loadingDialog = new Dialog(context, R.style.dialogutil_loading_style);
        //设置按对话框以外的地方不起作用
        loadingDialog.setCanceledOnTouchOutside(false);
        loadingDialog.setContentView(layout, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        return loadingDialog;

    }


	/*=============进度加载对话框==========主要用于上传文件加载对话框===========*/
	/**
	 * 进度加载对话框：（外层为ProgressBar【ProgressWheel】，内层为TextView的样式）
	 * */
	public static Dialog createProgressWheelDialogUpload(Context context, String msg) {
		//引用进度加载对话框布局文件
		LayoutInflater inflater = LayoutInflater.from(context);
		View v = inflater.inflate(R.layout.progress_wheel_upload_dialog, null);
		//获取布局文件根节点
		RelativeLayout layout = (RelativeLayout) v.findViewById(R.id.dialog_view);
		//获取进度条文本并赋值
		tipTextView = (TextView) v.findViewById(R.id.progress_text);
		tipTextView.setText(msg);
		//声明一个dialog对象并指定样式
		Dialog loadingDialog = new Dialog(context, R.style.dialogutil_loading_style_upload);
		//设置按对话框以外的地方不起作用
		loadingDialog.setCanceledOnTouchOutside(false);
		loadingDialog.setContentView(layout, new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.MATCH_PARENT,
				LinearLayout.LayoutParams.MATCH_PARENT));
		return loadingDialog;

	}
    
    /**
     * 修改文字展现*/
    public static void setDialogMsg(String msg) {
		if(tipTextView != null){
			tipTextView.setText(msg);
		}
    }
}

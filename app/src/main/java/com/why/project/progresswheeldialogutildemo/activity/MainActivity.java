package com.why.project.progresswheeldialogutildemo.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.why.project.progresswheeldialogutildemo.R;

public class MainActivity extends BaseActivity {

	private Button btn_showdialog;
	private Button btn_showtextdialog;
	private Button btn_showuploaddialog;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initViews();
		initEvents();
	}

	private void initViews() {
		btn_showdialog = (Button) findViewById(R.id.btn_showdialog);
		btn_showtextdialog = (Button) findViewById(R.id.btn_showtextdialog);
		btn_showuploaddialog = (Button) findViewById(R.id.btn_showuploaddialog);
	}

	private void initEvents() {
		btn_showdialog.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				showProgressDialog("");
			}
		});

		btn_showtextdialog.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				showProgressDialog("正在登录，请稍后");
			}
		});

		btn_showuploaddialog.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				showProgressDialogUpload("20%");
			}
		});
	}
}

package com.ao.quranproject.bas;

import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Bae_Activity extends AppCompatActivity {
		 protected AppCompatActivity activity;



	public AlertDialog showMessage (String message , String posActionName) {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("ririgb1");
		builder.setPositiveButton(posActionName, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});



		return builder.show();

	}

	public AlertDialog showMessage (String message , String posActionName,DialogInterface.OnClickListener onClickListener) {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("ririgb2");
		builder.setPositiveButton(posActionName,onClickListener);



		return builder.show();

	}


	public AlertDialog showMessage (int message , int posActionName) {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("ririgb3");
		builder.setPositiveButton(posActionName, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});



		return builder.show();

	}

	public AlertDialog showMessage (int message , int posActionName,DialogInterface.OnClickListener onClickListener) {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("ririgb4");
		builder.setPositiveButton(posActionName,onClickListener);



		return builder.show();

	}



	public AlertDialog showApp (String message ,String pos ){

		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("inionr");
		builder.setPositiveButton(pos, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});

		return  builder.show();
	}

	public AlertDialog Ahmed (String Name, String pos,DialogInterface.OnClickListener onClickListener){

		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setPositiveButton(Name,onClickListener);
		builder.setMessage("ejfeofm");
		builder.setTitle("ofmorm");

		return builder.show();

	}


}

package com.example.test.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Gazzgie on 19/12/2560.
 */

public class Alert {
    AlertDialog.Builder objAlert;

    public void HaveSpace(Context context)
    {
        objAlert=new AlertDialog.Builder(context);
        objAlert.setIcon(R.drawable.ic_launcher_background);
        objAlert.setTitle("Error !!!");
        objAlert.setMessage("No something !");
        objAlert.setCancelable(false);
        objAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });objAlert.show();
    }
}

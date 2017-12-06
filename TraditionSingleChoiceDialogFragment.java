package com.example.truong.demodialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

/**
 * Created by Truong on 06/12/2017.
 */

public class TraditionSingleChoiceDialogFragment extends DialogFragment{
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final String [] colors = {"RED","GREEEN","BLUE"};
        return new AlertDialog.Builder(getContext())
                .setTitle("Color")
                .setItems(colors, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Toast.makeText(getContext(),"Bạn vừa chọn màu "+ colors[position], Toast.LENGTH_LONG).show();
                    }
                })
                .create();
    }
}

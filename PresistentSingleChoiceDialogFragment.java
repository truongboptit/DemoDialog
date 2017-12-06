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

public class PresistentSingleChoiceDialogFragment extends DialogFragment {
    private String city;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final String[] names = {"Hà Nội", "Đà Nẵng", "Hồ Chí Minh"};
        // ban đầu sẽ chọn tên đầu tiên
        city = names[0];
        return new AlertDialog.Builder(getContext())
                .setTitle("Mời bạn chọn thành phố")
                .setSingleChoiceItems(names, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position) {
                        city = names[position];
                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position) {
                        Toast.makeText(getContext(), "Bạn đã chọn " + city, Toast.LENGTH_LONG).show();
                    }
                })
                .create();
    }
}

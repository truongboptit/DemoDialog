package com.example.truong.demodialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

/**
 * Created by Truong on 06/12/2017.
 */

public class MultiChoiceDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final String[] country = {"Viet Nam", "America", "England", "China"};
        final String[] choice = {""};
        final boolean[] selectItem = {true, false, true, false};
        return new AlertDialog.Builder(getContext())
                .setMultiChoiceItems(country, selectItem, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position, boolean isCheck) {
                        if (isCheck)
                            selectItem[position] = true;
                        else
                            selectItem[position] = false;
                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position) {
                        for(int i=0;i<selectItem.length;i++){
                            if(selectItem[i] == true)
                                choice[0] += country[i]+"  ";
                        }
                        Toast.makeText(getContext(), "Bạn đã chọn "+ choice[0], Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getContext(), "Cancel", Toast.LENGTH_SHORT).show();
                    }
                })
                .create();
    }
}

package com.example.truong.demodialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.Button;

/**
 * Created by Truong on 06/12/2017.
 */

public class CustomDialog extends Dialog {
    Button btnOK, btnCancel;
    public CustomDialog(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.custom_dialog);
        btnOK = findViewById(R.id.buttonOK);
        btnCancel = findViewById(R.id.buttonCancel);

    }
}

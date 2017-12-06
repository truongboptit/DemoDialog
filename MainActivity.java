package com.example.truong.demodialog;


import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnDialog, btnCustomDialog, btnBasicDialog, btnTraditionSingleChoice, btnPresistentSingleChoice, btnMultiChoice;
    FragmentManager fm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btnCustomDialog.setOnClickListener(onClickListener);
        btnBasicDialog.setOnClickListener(onClickListener);
        btnTraditionSingleChoice.setOnClickListener(onClickListener);
        btnPresistentSingleChoice.setOnClickListener(onClickListener);
        btnMultiChoice.setOnClickListener(onClickListener);
        btnDialog.setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int id = view.getId();
            switch (id) {
                case R.id.buttonCustomDialog: {
                    CustomDialogFragment customDialogFragment = new CustomDialogFragment();
                    customDialogFragment.show(fm, "custom dialog");
                    break;

                }
                case R.id.buttonBasicDialog: {
                    BasicDialogFragment basicDialogFragment = new BasicDialogFragment();
                    basicDialogFragment.show(fm, "basic dialog");
                    break;
                }
                case R.id.buttonTraditionSingleChoice: {
                    TraditionSingleChoiceDialogFragment traditionSingleChoiceDialogFragment = new TraditionSingleChoiceDialogFragment();
                    traditionSingleChoiceDialogFragment.show(fm, "traditional single choice dialog");
                    break;

                }
                case R.id.buttonPresistentSingleChoice: {
                    PresistentSingleChoiceDialogFragment presistentSingleChoiceDialogFragment = new PresistentSingleChoiceDialogFragment();
                    presistentSingleChoiceDialogFragment.show(fm, "presistent single choice dialog");
                    break;
                }
                case R.id.buttonMultiChoice: {
                    MultiChoiceDialogFragment multiChoiceDialogFragment = new MultiChoiceDialogFragment();
                    multiChoiceDialogFragment.show(fm, "multi choice dialog");
                    break;
                }
                case R.id.buttonDialog: {
                    CustomDialog dialog = new CustomDialog(MainActivity.this);
                    dialog.show();
                    break;
                }
                default:
                    break;
            }
        }
    };

    private void initView() {
        btnCustomDialog = findViewById(R.id.buttonCustomDialog);
        btnBasicDialog = findViewById(R.id.buttonBasicDialog);
        btnTraditionSingleChoice = findViewById(R.id.buttonTraditionSingleChoice);
        btnPresistentSingleChoice = findViewById(R.id.buttonPresistentSingleChoice);
        btnMultiChoice = findViewById(R.id.buttonMultiChoice);
        btnDialog = findViewById(R.id.buttonDialog);
    }
}

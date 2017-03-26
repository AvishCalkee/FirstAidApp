package com.app.firstaid.firstaidapp;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    Button login;
    Button emergency;
    ImageView imageClose;
    TextView notMember;
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=(Button)findViewById(R.id.btnLogin);
        notMember=(TextView)findViewById(R.id.txtMember);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // custom dialog
             /* final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialog_box_layout);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                dialog.show();

                imageClose=(ImageView)dialog.findViewById(R.id.imgbtnClose);
                emergency=(Button)dialog.findViewById(R.id.btnEmergency);
                imageClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                emergency.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent startEmergency= new Intent(context,Emergency.class);
                        startActivity(startEmergency);
                    }
                });*/

                Intent startDashboard= new Intent(context,Dashboard.class);
                startActivity(startDashboard);

            }
        });


        notMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startRegistration= new Intent(context,Registeration.class);
                startActivity(startRegistration);

            }
        });
    }
}

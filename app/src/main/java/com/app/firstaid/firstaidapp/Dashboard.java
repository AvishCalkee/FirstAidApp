package com.app.firstaid.firstaidapp;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {
    Button volunteer;
    Button needy;
    Button emergency;
    Button utility;
    ImageView imageClose;
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        volunteer=(Button)findViewById(R.id.btnVolunteer);
        needy=(Button)findViewById(R.id.btnNeedy);

        volunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startMaps= new Intent(context,MapsActivity.class);
                startActivity(startMaps);
            }
        });

        needy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // custom dialog
              final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialog_box_layout);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                dialog.show();

                imageClose=(ImageView)dialog.findViewById(R.id.imgbtnClose);
                emergency=(Button)dialog.findViewById(R.id.btnEmergency);
                utility=(Button)dialog.findViewById(R.id.btnUtility);
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
                });

                utility.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent startUtility= new Intent(context,Utilities.class);
                        startActivity(startUtility);
                    }
                });


            }
        });
    }
}

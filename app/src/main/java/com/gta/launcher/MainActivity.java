
package com.gta.launcher;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showHome();
    }

    private void setupLayout() {
        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(28, 28, 28, 28);
        layout.setBackgroundColor(Color.BLACK);
        setContentView(layout);
    }

    private TextView makeText(String text, int size, int color) {
        TextView view = new TextView(this);
        view.setText(text);
        view.setTextSize(size);
        view.setTextColor(color);
        view.setGravity(Gravity.CENTER);
        view.setPadding(8, 12, 8, 12);
        return view;
    }

    private Button makeButton(String text) {
        Button button = new Button(this);
        button.setText(text);
        button.setTextColor(Color.WHITE);
        button.setBackgroundTintList(
            android.content.res.ColorStateList.valueOf(
                Color.rgb(190, 20, 35)
            )
        );
        LinearLayout.LayoutParams params =
            new LinearLayout.LayoutParams(-1, -2);
        params.setMargins(0, 10, 0, 10);
        layout.addView(button, params);
        return button;
    }

    private void showHome() {
        setupLayout();

        layout.addView(makeText("GTA", 48, Color.RED));
        layout.addView(makeText(
            "MINECRAFT LAUNCHER", 18, Color.WHITE
        ));
        layout.addView(makeText(
            "Welcome to GTA Launcher", 14, Color.LTGRAY
        ));

        Button play = makeButton("PLAY MINECRAFT");
        play.setOnClickListener(v -> launchMinecraft());

        Button settings = makeButton("SETTINGS");
        settings.setOnClickListener(v -> showSettings());
    }

    private void launchMinecraft() {
        Intent intent = getPackageManager()
            .getLaunchIntentForPackage("com.mojang.minecraftpe");

        if (intent != null) {
            startActivity(intent);
        } else {
            Toast.makeText(
                this,
                "Please install Minecraft first.",
                Toast.LENGTH_LONG
            ).show();
        }
    }

    private void showSettings() {
        setupLayout();
        layout.addView(makeText("SETTINGS", 30, Color.RED));
        layout.addView(makeText(
            "GTA Launcher settings", 16, Color.WHITE
        ));

        Button back = makeButton("BACK");
        back.setOnClickListener(v -> showHome());
    }
  }
      

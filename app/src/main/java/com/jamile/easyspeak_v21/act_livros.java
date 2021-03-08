package com.jamile.easyspeak_v21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class act_livros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_livros);

        ImageView abedog = (ImageView)findViewById(R.id.abedog);
        abedog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://cdn.shopify.com/s/files/1/2081/8163/files/004-ABE-THE-SERVICE-DOG-Free-Childrens-Book-By-Monkey-Pen.pdf?v=1589884748"));
                startActivity(intent);
            }
        });

        ImageView chores = (ImageView)findViewById(R.id.doingchores);
        chores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent();
                intent2.setAction(Intent.ACTION_VIEW);
                intent2.addCategory(Intent.CATEGORY_BROWSABLE);
                intent2.setData(Uri.parse("https://cdn.shopify.com/s/files/1/2081/8163/files/003-DOING_MY_CHORES-Free-Childrens-Book-By-Monkey-Pen.pdf?v=1589846895"));
                startActivity(intent2);
            }
        });

        ImageView homework = (ImageView)findViewById(R.id.homeyuck);
        homework.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent();
                intent3.setAction(Intent.ACTION_VIEW);
                intent3.addCategory(Intent.CATEGORY_BROWSABLE);
                intent3.setData(Uri.parse("https://cdn.shopify.com/s/files/1/2081/8163/files/009-HOMEWORK-YUCK-Free-Childrens-Book-By-Monkey-Pen.pdf?v=1589846892"));
                startActivity(intent3);
            }
        });

        ImageView missing = (ImageView)findViewById(R.id.missingsmile);
        missing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4= new Intent();
                intent4.setAction(Intent.ACTION_VIEW);
                intent4.addCategory(Intent.CATEGORY_BROWSABLE);
                intent4.setData(Uri.parse("https://cdn.shopify.com/s/files/1/2081/8163/files/008-THE-CASE-OF-THE-MISSING-SMILE.pdf?v=1589846895"));
                startActivity(intent4);
            }
        });
    }
}
package com.utsppb.ppbuts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;


public class MainActivity4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        WebView browser = (WebView) findViewById(R.id.webkit);        //Use same layout and manifest of previous example
        browser.loadData("" +
                "<html>" +
                "   <body>" +
                "  <title>Tentang Aplikasi </title>" +
                "<p>" +
                "Tentang Aplikasi<br>" +
                "Aplikasi ini aplikasi<br>" +
                "pencatatan waktu olahraga<br> <br> <br>" +
                "Aplikasi ini dibuat oleh :<br/>" +
                "1406033  - Dessy Mutiara Komara<br/>" +
                "1406062 - Hanifah Fitriyanti<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html","UTF-8");

    }
}

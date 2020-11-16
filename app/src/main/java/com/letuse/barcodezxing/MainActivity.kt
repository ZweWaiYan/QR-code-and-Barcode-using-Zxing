package com.letuse.barcodezxing

import android.R.attr
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btn_Scanner.setOnClickListener {
//
//            val scanner = IntentIntegrator(this)
//            scanner.initiateScan()
//        }
    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
//        if (result != null) {
//            if (result.contents == null) {
//                Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show()
//            } else {
//                Toast.makeText(this, "Scanned: " + result.contents, Toast.LENGTH_LONG).show()
//            }
//        } else {
//            super.onActivityResult(requestCode, resultCode, data)
//        }
//    }
}
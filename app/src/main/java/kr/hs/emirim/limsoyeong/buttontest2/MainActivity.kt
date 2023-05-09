package kr.hs.emirim.limsoyeong.buttontest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var text1 : TextView;
    lateinit var btn1 : Button;
    lateinit var btn2 : Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text1 = findViewById<TextView>(R.id.text1);
        btn1 = findViewById<Button>(R.id.btn1);
        btn2 = findViewById<Button>(R.id.btn2);
        btn1.setOnClickListener {
            text1.text = btn1.text
        }
        btn2.setOnClickListener {
            text1.text = btn2.text
        }

    }

}
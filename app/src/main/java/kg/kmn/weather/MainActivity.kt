package kg.kmn.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var mAcceptBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAcceptBtn = findViewById(R.id.btn_ok)
        mAcceptBtn.setOnClickListener{
            Toast.makeText(this, getString(R.string.greeting), Toast.LENGTH_SHORT).show()
        }

    }
}
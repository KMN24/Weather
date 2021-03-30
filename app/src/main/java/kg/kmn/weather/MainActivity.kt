package kg.kmn.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvText : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvText = findViewById(R.id.tv_text)
        tvText.text = getString(R.string.greeting)
        tvText.textSize = 30f
        tvText.setTextColor(resources.getColor(R.color.colorPrimaryDark))

    }
}
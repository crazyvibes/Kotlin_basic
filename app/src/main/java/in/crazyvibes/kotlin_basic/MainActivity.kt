package `in`.crazyvibes.kotlin_basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val circleCalc = CircleCalc()

        val introTextView = findViewById<TextView>(R.id.introTextview)
        val resultTextView = findViewById<TextView>(R.id.resultTextview)
        val radiusEditText = findViewById<EditText>(R.id.radiusEditText)
        val circumferenceButton = findViewById<Button>(R.id.circumferenceButton)
        val areaButton = findViewById<Button>(R.id.areaButton)

        circumferenceButton.setOnClickListener {

            if (radiusEditText.text.toString().isEmpty()) {
                Toast.makeText(this, "Empty radius!!", Toast.LENGTH_LONG).show()
            } else {
                val input = radiusEditText.text.toString()
                val circumference = circleCalc.getCircumFerence(input.toDouble())
                introTextView.text = getString(R.string.circumference)
                resultTextView.text = circumference.toString().plus(" cm")
            }

        }

        areaButton.setOnClickListener {
            if (radiusEditText.text.toString().isEmpty()) {
                Toast.makeText(this, "Empty radius!!", Toast.LENGTH_LONG).show()
            } else {

                val input = radiusEditText.text.toString()
                val area = circleCalc.getArea(input.toDouble())
                introTextView.text = getString(R.string.area)
                resultTextView.text = area.toString().plus(" cm\u00B2")
            }
        }
    }
}

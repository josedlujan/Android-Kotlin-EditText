package edittextkotlin.ejemplo.com.examplekotlinedittext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edittext: EditText = findViewById(R.id.edittext) as EditText
        edittext.setText("EditText with kotlin")
    }
}

package com.example.screenrecording1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

class AudienceActivity : AppCompatActivity() {


    var userRole = 0

//    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audience)

        requestPermission()

    }
    private fun requestPermission(){
        ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA,android.Manifest.permission.RECORD_AUDIO),22)

    }

    fun onSubmit(view: View){
        val ChannelName=findViewById<View>(R.id.channel) as EditText

        val userRadioButton = findViewById<View>(R.id.radioGroup) as RadioGroup

        val checked = userRadioButton.checkedRadioButtonId
        val audienceButtonId = findViewById<View>(R.id.radioAudience) as RadioButton
        val btn=findViewById<View>(R.id.btn) as Button

        userRole = if (checked == audienceButtonId.id){
            0
        } else{
            1
        }

        intent.putExtra("ChannelName", ChannelName.text.toString())
        intent.putExtra("UserRole", userRole)
        startActivity(intent)
        startActivity(Intent(this@AudienceActivity, callActivity::class.java))




    }





    }

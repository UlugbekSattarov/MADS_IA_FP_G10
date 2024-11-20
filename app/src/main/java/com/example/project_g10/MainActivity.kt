package com.example.project_g10

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project_g10.activities.EnterNameActivity
import com.example.project_g10.activities.WelcomeBackActivity
import com.example.project_g10.utils.AppPreferences

// Make sure this is imported
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Reference your layout

        val name = AppPreferences.getString(this, AppPreferences.KEY_USER_NAME)
        val intent = if (name.isNullOrEmpty()) {
            Intent(this, EnterNameActivity::class.java)
        } else {
            Intent(this, WelcomeBackActivity::class.java)
        }
        startActivity(intent)
        finish()
    }
}

package ru.tetris.demo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import ru.tetris.demo.storage.AppPreferences

class GameActivity : AppCompatActivity() {

    var tvHighScore: TextView? = null
    var tvCurrentScore: TextView? = null
    var appPreferences: AppPreferences? = null


    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        appPreferences = AppPreferences(this)

        var btnRestart = findViewById<Button>(R.id.btn_restart)
        tvHighScore = findViewById(R.string.high_score)
        tvCurrentScore = findViewById(R.string.current_score)

        updateHighScore()
        updateCurrentScore()
    }

    private fun updateCurrentScore() {
        tvCurrentScore?.text = "0"
    }

    private fun updateHighScore() {
        tvHighScore?.text = "${appPreferences?.getHighScore()}"
    }
}
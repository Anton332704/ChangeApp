package com.example.fake.presentation.activity

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.fake.R
import com.example.fake.data.BigPersonalRepository
import com.example.fake.domain.GetPersonalInfoUseCase
import kotlinx.coroutines.launch

class FakeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fake_activity)
        val useCase = GetPersonalInfoUseCase(BigPersonalRepository())
        findViewById<Button>(R.id.my_btn).setOnClickListener {
            lifecycleScope.launch {
                val first = useCase.execute(1)
                val second = useCase.execute(2)
                findViewById<TextView>(R.id.info).text = first + " " + second
            }
        }
    }
}
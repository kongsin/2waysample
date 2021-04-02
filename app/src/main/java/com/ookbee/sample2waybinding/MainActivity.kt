package com.ookbee.sample2waybinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.viewbinding.ViewBinding
import com.ookbee.sample2waybinding.databinding.ActivityMainBinding
import kotlin.properties.ObservableProperty

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding
    private val roomModel: RoomModel = RoomModel("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = DataBindingUtil.inflate(layoutInflater, R.layout.activity_main, null, false)
        setContentView(viewBinding.root)

        viewBinding.apply {
            lifecycleOwner = this@MainActivity
            roomModel = this@MainActivity.roomModel
            button.setOnClickListener {
                Toast.makeText(this@MainActivity, "${roomModel}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
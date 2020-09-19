package com.derysudrajat.androidbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.api.load
import coil.transform.CircleCropTransformation
import com.derysudrajat.androidbasic.databinding.ActivityViewBinding

class ViewActivity : AppCompatActivity() {

    private lateinit var binding : ActivityViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            ivAva.load("https://avatars3.githubusercontent.com/u/32610660?s=460&u=f2945b508ae75d9d543473286dcf788318e731e9&v=4"){
                crossfade(true)
                transformations(CircleCropTransformation())
            }

            ivComment.load("https://avatars0.githubusercontent.com/u/30403182?s=460&u=a6135373e54da07bb29467a158bdb8ad67992729&v=4")
            {
                crossfade(true)
                transformations(CircleCropTransformation())
            }

            ivPost.load("https://japanbeautiful.files.wordpress.com/2019/02/shutterstock_fuji-by-sean-pavone-rs-46203007d7e1.jpg?w=1000")
        }
    }
}
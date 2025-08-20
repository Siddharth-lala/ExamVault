package com.example.view_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.BounceInterpolator
import android.view.animation.DecelerateInterpolator
import android.view.animation.Interpolator
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView

class ExamSplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam_splash_screen)

        /// Thankfully this is similar to css and html
        /// which I do happen to know

        //val image1 = findViewById<ImageView>(R.id.iv_book)
        val ease = AccelerateDecelerateInterpolator()
        val ease2 = DecelerateInterpolator()
        /*image.animate()
            .setDuration(3000)
            .alpha(1f)
            .scaleX(1.2f)
            .scaleY(1.2f)
            .setInterpolator(interpolator)
            .withEndAction {
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }*/

        val ballgroup = findViewById<RelativeLayout>(R.id.ballgroup)
        val smallball = findViewById<ImageView>(R.id.iv_smallball)
        val bigball = findViewById<ImageView>(R.id.iv_bigball)
        val exam =  findViewById<TextView>(R.id.textView)
        val vault = findViewById<TextView>(R.id.textView2)

        exam.animate()
            .setDuration(2000)
            .setInterpolator(ease2)
            .translationY(300f)

        vault.animate()
            .setDuration(2000)
            .setInterpolator(ease2)
            .translationY(300f)



        smallball.animate()
            .setDuration(2500)
            .setInterpolator(ease)
            .translationX(550f)

        bigball.animate()
            .setDuration(2500)
            .setInterpolator(ease)
            .translationX(30f)


        ballgroup.animate()
            .setDuration(2500)
            .setInterpolator(ease)
            .rotation(-25f)
            .withEndAction {

                ballgroup.animate()
                    .setDuration(2500)
                    .setInterpolator(ease)
                    .rotation(25f)

                bigball.animate()
                    .setDuration(2500)
                    .setInterpolator(ease)
                    .translationX(-30f)

                smallball.animate()
                    .setDuration(2500)
                    .setInterpolator(ease)
                    .translationXBy(-550f)

                    .withEndAction { var i = Intent(this, MainActivity::class.java)
                        startActivity(i)
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                        finish() }
            }

    }
}
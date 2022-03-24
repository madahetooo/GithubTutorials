package com.apps.githubtutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("this is another commit") // Master branch
        print("this is experimental commit") // Experimental branch
        print("this is master commit again ") // Master branch
        print("This is another commit") // default branch
        print("this is latest master commit") // master branch
        print("this is classA commit") // ClassA Branch
        print("this line will be merged to master") // classA branch
    }
}
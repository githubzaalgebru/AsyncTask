package com.algebra.asynctask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity( ) {

    val TAG = "MainActivity"

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )
    }

    fun startInForeground( v : View ) {
        Toast
            .makeText( this, "Zadatak pokrenut", Toast.LENGTH_SHORT )
            .show( )
        for( i in 1..5 ) {
            Thread.sleep( 2000 )
            Log.i( TAG, "$i od 5 gotovo" )
        }
        Toast
            .makeText( this, "Zadatak je izvršen", Toast.LENGTH_SHORT )
            .show( )
    }

    fun startInBackground( v : View ) {
        Toast
            .makeText( this, "Zadatak pokrenut (u pozadini)", Toast.LENGTH_SHORT )
            .show( )
        BackgroundTask( this ).execute( 5 )
        Log.i( TAG, "Zadatak je pokrenut i idem dalje" )
    }

    fun testToast( v : View) {
        Toast
            .makeText( this, "TEST", Toast.LENGTH_SHORT )
            .show( )
    }
}
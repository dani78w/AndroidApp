package com.gmail.danielarribas78w.myapplication
import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.gmail.danielarribas78w.myapplication.R

class SaludoActivity : AppCompatActivity() {
    private lateinit var txtSaludo : TextView
    private lateinit var btnHome : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)
        /*Obtenemos una referencia a los controles de la interfaz
          es como los get.document.id de javascript */
            txtSaludo = findViewById(R.id.txtSaludo)
            btnHome = findViewById(R.id.button2)
        //Recuperamos la información pasada en el intent
            val saludo = intent.getStringExtra("NOMBRE")
            //Construimos el mensaje a mostrar
            txtSaludo.text = "Hola $saludo"
        /* esto es mi parte extra , simplemente te devuelve a la pantalla principal
           en el caso de que te equivocases de nombre al introducirlo
           se trata de un listener sobre el boton el cual redirecciona el visor sobre
           el nuevo intent que creo
           */
            btnHome.setOnClickListener {
                //Creamos el Intent
                val intent = Intent(this@SaludoActivity,MainActivity ::class.java)

                //Iniciamos la nueva actividad
                startActivity(intent)


            }


    }

}
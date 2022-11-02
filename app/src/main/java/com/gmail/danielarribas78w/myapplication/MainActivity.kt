package com.gmail.danielarribas78w.myapplication
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var txtNombre : EditText
    private lateinit var btnAceptar : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Obtenemos una referencia a los controles de la interfaz
        txtNombre = findViewById(R.id.txtNombre)
        btnAceptar = findViewById(R.id.btnAceptar)
        //CON LOS LISTENER ESPERAMOS A QUE UNA ACCION SUCEDA
        btnAceptar.setOnClickListener {

            /* Según wikipedia un Un Intent es un objeto que proporciona vinculación
                en tiempo de ejecución entre componentes separados, como dos actividades
                asique crearemos uno para transmitir la información de la actividad main
                a la nueva SaludoActivity
             */

            //Creamos el Intent
            val intent = Intent(this@MainActivity, SaludoActivity::class.java)
            //Añadimos al intent la información a pasar entre actividades
            intent.putExtra("NOMBRE", txtNombre.text.toString())
            //Iniciamos la nueva actividad
            startActivity(intent)


        }


    }
}
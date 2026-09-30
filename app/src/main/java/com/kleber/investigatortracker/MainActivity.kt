package com.kleber.investigatortracker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Instanciamos o motor de regras que criámos anteriormente
    private val calculadora = CalculadoraD100()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Carrega o visual XML que desenhámos

        // 1. Ligar as variáveis do Kotlin aos componentes visuais do ecrã através dos IDs
        val editPericia = findViewById<EditText>(R.id.editPericia)
        val btnRolar = findViewById<Button>(R.id.btnRolar)
        val textResultadoDado = findViewById<TextView>(R.id.textResultadoDado)
        val textStatus = findViewById<TextView>(R.id.textStatus)

        // 2. Configurar o que acontece quando o botão é pressionado
        btnRolar.setOnClickListener {
            // Capturar o que o utilizador escreveu
            val periciaTexto = editPericia.text.toString()

            // Validação de segurança (evita que a aplicação encrave se o campo estiver vazio)
            if (periciaTexto.isEmpty()) {
                Toast.makeText(this, "Por favor, introduza o valor da perícia.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener // Interrompe a execução do clique
            }

            // Converter o texto para número inteiro
            val pericia = periciaTexto.toInt()

            // Gerar a rolagem virtual do d100 (número aleatório de 1 a 100)
            val dado = (1..100).random()

            // Passar os valores para a nossa regra de negócios avaliar
            val status = calculadora.avaliarRolagem(pericia, dado)

            // 3. Atualizar os textos no ecrã com o resultado final
            textResultadoDado.text = "Dado: $dado"
            textStatus.text = status
        }
    }
}
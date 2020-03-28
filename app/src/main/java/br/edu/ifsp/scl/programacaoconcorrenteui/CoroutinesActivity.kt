package br.edu.ifsp.scl.programacaoconcorrenteui

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_programacao_concorrente.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.lang.Thread.sleep

class CoroutinesActivity : ProgramacaoConcorrenteActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Coroutines"
    }

    override fun run() {
        // Tarefa completa
        GlobalScope.launch (Dispatchers.Main) {
            sleep(Constantes.CARREGA_IMAGENS_DELAY)
            altaIv.setImageResource(R.drawable.android_preto)
            baixaIv.setImageResource(R.drawable.android_verde)
        }
    }
}

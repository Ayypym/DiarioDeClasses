package com.senai.diariodeclasse.data

import android.R

class DataSource() {
    fun loadAluno(): List<Aluno>{
        return listOf<Aluno>(
            Aluno("Beatriz", R.drawable)
        )
    }
}
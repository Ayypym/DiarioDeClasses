package com.senai.diariodeclasse.data

import com.senai.diariodeclasse.R

class DataSource() {
    fun carregarAlunos(): List<Aluno>{
        return listOf(Aluno(
            "Jinsoulsz",
            R.drawable.ineffa,
            "Boneca de Lata"
        ),
            Aluno(
                "Lauma",
                R.drawable.lauma_icon,
                "Sacerdotisa da Lua"
            ),
            Aluno(
                "Saori",
                R.drawable.aino,
                "Atriz do NemMfx"
            )


        )
    }
}
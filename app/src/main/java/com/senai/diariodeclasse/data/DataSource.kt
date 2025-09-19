package com.senai.diariodeclasse.data

import com.senai.diariodeclasse.R

class DataSource() {
    fun carregarAlunos(): List<Aluno>{
        return listOf(Aluno(
            "Joana Marta",
            R.drawable.lauma_icon,
            "Desenvolvimento de Sistemas"
        ),
            Aluno(
                "Lauma",
                R.drawable.lauma_icon,
                "Sacerdotisa da Lua"
            )

        )
    }
}
package com.academia.treino.service

import com.academia.treino.model.Treino
import com.academia.treino.repository.TreinoRepository
import org.springframework.stereotype.Service

@Service
class TreinoService(private val treinoRepository: TreinoRepository){

    fun treinos(): List<Treino> {
        return treinoRepository.findAll();
    }

    fun cadastrarTreinos(treino: Treino): Treino {
        return treinoRepository.save(treino)
    }

}
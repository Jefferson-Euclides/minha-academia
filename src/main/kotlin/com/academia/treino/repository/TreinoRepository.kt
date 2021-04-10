package com.academia.treino.repository

import com.academia.treino.model.Treino
import org.springframework.data.mongodb.repository.MongoRepository

interface TreinoRepository : MongoRepository<Treino, Long> {
}
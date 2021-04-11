package com.academia.treino.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Treino (var titulo: String, var descricao: String, var videoUrl: String, @Id var _id: Long? = null)
package com.academia.treino.controller

import com.academia.treino.model.Treino
import com.academia.treino.service.TreinoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/treino")
class TreinoController(private val treinoService: TreinoService) {

    @GetMapping()
    fun buscarTreinos(): List<Treino> {
        return treinoService.treinos()
    }

    @PostMapping
    fun cadastrarTreinos(@RequestBody treino: Treino): Treino {
        return treinoService.cadastrarTreinos(treino)
    }

}
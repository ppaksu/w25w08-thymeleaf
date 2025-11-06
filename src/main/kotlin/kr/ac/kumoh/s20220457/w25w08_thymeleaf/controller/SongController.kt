package kr.ac.kumoh.s20220457.w25w08_thymeleaf.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController {
    @GetMapping("/songs/random")
    fun getRandom() : String {
        return "random"
    }
}
package com.github.mqzry.ocaml.plugin

import com.intellij.lang.Language

class OCamlLanguage : Language("OCaml") {

    companion object {
        val INSTANCE: OCamlLanguage = OCamlLanguage()
    }
}
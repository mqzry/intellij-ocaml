package com.github.mqzry.ocaml.plugin

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class OCamlFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, OCamlLanguage.INSTANCE) {
    override fun getFileType(): FileType = OCamlFileType

    override fun toString(): String = "OCaml File"
}
package com.github.mqzry.ocaml.plugin

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile
import javax.swing.Icon

/**
 * @author mhas
 */

object OCamlFileType : LanguageFileType(OCamlLanguage.INSTANCE) {
    object DEFAULTS {
        val EXTENSION: String = "ml"
    }

    private var myIcon: Icon = OCamlIcons.ocamlIcon

    override fun getName(): String = "OCaml file"

    override fun getDescription(): String = "OCaml file"

    override fun getDefaultExtension(): String = DEFAULTS.EXTENSION

    override fun getIcon(): Icon = myIcon

    override fun getCharset(file: VirtualFile, content: ByteArray): String = "UTF-8"
}
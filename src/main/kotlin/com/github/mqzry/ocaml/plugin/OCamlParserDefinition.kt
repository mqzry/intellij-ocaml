package com.github.mqzry.ocaml.plugin

import com.intellij.lang.ASTNode
import com.intellij.lang.LanguageUtil
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class OCamlParserDefinition : ParserDefinition {
    override fun createParser(project: Project?): PsiParser = OCamlParser()

    override fun createFile(viewProvider: FileViewProvider): PsiFile = OCamlFile(viewProvider)

    override fun spaceExistanceTypeBetweenTokens(left: ASTNode?, right: ASTNode?): ParserDefinition.SpaceRequirements? =
            LanguageUtil.canStickTokensTogetherByLexer(left, right, OCamlLexer())

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun getWhitespaceTokens(): TokenSet = WHITE_SPACES

    override fun getCommentTokens(): TokenSet = COMMENTS

    override fun getFileNodeType(): IFileElementType? = FILE

    override fun createLexer(project: Project?): Lexer = OCamlLexer()

    override fun createElement(node: ASTNode?): PsiElement = OCamlLexer.Factory.createElement(node)

    companion object {
        val FILE: IFileElementType = IFileElementType(OCamlLanguage.INSTANCE)
        val WHITE_SPACES: TokenSet = TokenSet.create(TokenType.WHITE_SPACE)
        val COMMENTS: TokenSet = TokenSet.create(TomlTypes.COMMENT)
    }

}
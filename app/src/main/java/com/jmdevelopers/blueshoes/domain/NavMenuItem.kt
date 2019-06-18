package com.jmdevelopers.blueshoes.domain
// Como alguns itens não têm ícone, a constante DEFAULT_ICON_ID será utilizada em ao menos uma lógica de negócio do projeto,

class NavMenuItem(val label: String, val iconid: Int = DEFALT_ICON_ID) {
    companion object {
        const val DEFALT_ICON_ID = -1
    }
    // esse -1 é para quando não tem icone ai deixa padrao

}
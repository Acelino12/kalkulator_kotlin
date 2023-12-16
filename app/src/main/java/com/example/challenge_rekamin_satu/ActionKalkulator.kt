package com.example.challenge_rekamin_satu

sealed class ActionKalkulator {
    data class Number(val number : Int): ActionKalkulator()
    object Clear: ActionKalkulator()
    object Delete: ActionKalkulator()
    object Desimal: ActionKalkulator()
    object Kalkulator : ActionKalkulator()
    data class Operation(val )
}

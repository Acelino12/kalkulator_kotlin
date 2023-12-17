package com.example.challenge_rekamin_satu

sealed class OperationKalkulator(val symbol:String) {
    object Add: OperationKalkulator("+")
    object Subtract: OperationKalkulator("-")
    object Multiply: OperationKalkulator("x")
    object Divide: OperationKalkulator("/")
}

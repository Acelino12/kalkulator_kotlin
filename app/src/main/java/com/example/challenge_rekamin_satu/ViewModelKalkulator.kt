package com.example.challenge_rekamin_satu

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ViewModelKalkulator: ViewModel() {
    var state by mutableStateOf(StateKalkulator())
        private set
}
package com.example.challenge_rekamin_satu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.example.challenge_rekamin_satu.ui.theme.Challenge_rekamin_satuTheme
import com.example.challenge_rekamin_satu.ui.theme.MediumGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Challenge_rekamin_satuTheme {
                val viewModel = viewModels<ViewModelKalkulator>()
                val state = viewModel.state
                val buttonSpacing = 8.dp
                Kalkulator(
                    state = state,
                    onAction = viewModel::onAction,
                    buttonSpacing = buttonSpacing,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MediumGray)
                        .padding(16.dp)
                )
                }
            }
        }
    }


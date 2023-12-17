package com.example.challenge_rekamin_satu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.challenge_rekamin_satu.ui.theme.Orange

@Composable
fun Kalkulator(
     state: StateKalkulator,
     buttonSpacing: Dp= 8.dp,
     modifier: Modifier = Modifier,
     onAction: (ActionKalkulator) -> Unit
) {
    Box(modifier = modifier){
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operation?.symbol?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            )
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                ButtonKalkulator (
                    symbol = "AC",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(ActionKalkulator.Clear)
                    }
                )
                ButtonKalkulator (
                    symbol = "Del",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(ActionKalkulator.Delete)
                    }
                )
                ButtonKalkulator (
                    symbol = "/",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(ActionKalkulator.Operation(OperationKalkulator.Divide))
                    }
                )
            }

            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                ButtonKalkulator (
                    symbol = "7",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(ActionKalkulator.Number(7))
                    }
                )
                ButtonKalkulator (
                    symbol = "8",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(ActionKalkulator.Number(8))
                    }
                )
                ButtonKalkulator (
                    symbol = "9",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(ActionKalkulator.Number(9))
                    }
                )
                ButtonKalkulator (
                    symbol = "x",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(ActionKalkulator.Operation(OperationKalkulator.Multiply))
                    }
                )
            }

            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                ButtonKalkulator (
                    symbol = "4",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(ActionKalkulator.Number(4))
                    }
                )
                ButtonKalkulator (
                    symbol = "5",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(ActionKalkulator.Number(5))
                    }
                )
                ButtonKalkulator (
                    symbol = "6",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(ActionKalkulator.Number(6))
                    }
                )
                ButtonKalkulator (
                    symbol = "-",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(ActionKalkulator.Operation(OperationKalkulator.Subtract))
                    }
                )
            }

            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                ButtonKalkulator (
                    symbol = "1",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(ActionKalkulator.Number(1))
                    }
                )
                ButtonKalkulator (
                    symbol = "2",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(ActionKalkulator.Number(2))
                    }
                )
                ButtonKalkulator (
                    symbol = "3",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(ActionKalkulator.Number(3))
                    }
                )
                ButtonKalkulator (
                    symbol = "+",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(ActionKalkulator.Operation(OperationKalkulator.Add))
                    }
                )
            }

            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                ButtonKalkulator (
                    symbol = "0",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(ActionKalkulator.Number(0))
                    }
                )
                ButtonKalkulator (
                    symbol = ".",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(ActionKalkulator.Desimal)
                    }
                )
                ButtonKalkulator (
                    symbol = "=",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(ActionKalkulator.Kalkulator)
                    }
                )
            }
        }
    }
}
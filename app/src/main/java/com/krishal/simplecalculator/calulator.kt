package com.krishal.simplecalculator

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val buttons = listOf(
    "AC", "⌫", "%", "÷",
    "7", "8", "9", "×",
    "4", "5", "6", "-",
    "1", "2", "3", "+",
    "0", ".", "="
)








@Composable
fun calculator(modifier: Modifier=Modifier) {
    Box(modifier = modifier)
    {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.End


        ) {

            Text(text = "123 +123", fontSize = 40.sp, style = TextStyle(textAlign = TextAlign.End)
            ,
                overflow= TextOverflow.Ellipsis,
                maxLines = 5)
            Spacer(modifier=Modifier.height(5.dp))
            Text(text = "246", fontSize = 80.sp, style = TextStyle(textAlign = TextAlign.End)
                ,
                overflow= TextOverflow.Ellipsis,
                maxLines = 1)

            Spacer(modifier=Modifier.height(5.dp))
          LazyVerticalGrid(
              columns =GridCells.Fixed(4)) {
              items(buttons ) {
                  calculatorbutton(btn=it)


              }
          }
        }
    }
}
@Composable
fun calculatorbutton(btn:String)
{

    Box(modifier=Modifier.padding(20.dp))
    {
        FloatingActionButton(onClick = { },
            shape = CircleShape,
            modifier=Modifier.size(80.dp),
            contentColor = Color.White,
            containerColor = getColor(btn)




        ) {
        Text(text=btn, fontSize = 20.sp, fontWeight = FontWeight.Bold)

    }
}}
fun getColor(btn:String): Color {
    if (btn == "AC" || btn == "⌫") {
        return Color.Red // Red for AC and Backspace
    } else if (btn == "%" || btn == "=") {
        return Color.Green // Green for percentage and equals
    } else if (btn == "÷" || btn == "×" || btn == "-" || btn == "+") {
        return Color.Gray // Gray for operators (+, -, ×, ÷)
    } else {
        return Color.Black // Black for numbers or other buttons
    }
}
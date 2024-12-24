package com.littlelemon.emf5.ui.theme.userInterface

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.littlelemon.emf5.ui.theme.Emf5Theme

@Composable
fun DisplayScreen(modifier: Modifier = Modifier) {
    Text("hello jii", color = Color.Black)
    Text("fixit Jii", color = Color.Blue)
}

@Composable
fun Theme() {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {
        Box(modifier = Modifier.background(Color.Magenta).size(100.dp))
        Box(modifier = Modifier.background(Color.Cyan).size(100.dp))
        Box(modifier = Modifier.background(Color.DarkGray).size(100.dp))
    }
//    Column {
//        Text("Hello", fontSize = 30.sp)
//        Text("Hi", fontSize = 25.sp)
//        Text("Kame Cho", fontSize = 20.sp)
//        Text("Kya hua", fontSize = 15.sp)
//    }
//    Row(
//        modifier = Modifier.fillMaxSize(),
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.Absolute.spacedBy(20.dp)
//    ) {
//        Text("Hello", fontSize = 40.sp, modifier = Modifier.alignByBaseline())
//        Text("DOJO", fontSize = 20.sp, modifier = Modifier.alignByBaseline())
//        Box (
//            modifier = Modifier
//                .size(100.dp)
//                .background(color = Color.Red)
//        )
//        Box (
//            modifier = Modifier.size(100.dp)
//                .background(color = Color.Cyan)
//                .align(Alignment.Top)
//        )
//        Box (
//            modifier = Modifier.size(100.dp).
//            background(
//                color = Color.Blue
//            )
//        )
    //}
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFFFFFFF
)
@Composable
fun GreetingPreview() {
    Emf5Theme {
        Theme()
    }
}
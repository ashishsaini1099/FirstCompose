package com.example.demo.firstcompose.samples

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demo.firstcompose.R

class ExamplesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

//            Text(text = "Hello Jetpack Compose")
//            TextInput()
//            PreviewItem()
            NotificationScreen()
        }
    }
}


@Preview(showBackground = true, name = "Hello Msg", widthDp = 200, heightDp = 200)
@Composable
private fun PreviewFunction(name: String = "Test") {
//    SayCheezy(name = "ChheezeCode")
//    SayImage()
//    SayButton()
//    SayTextInput()

//    Column(
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//
//        Text(text = "A", fontSize = 24.sp)
//        Text(text = "B", fontSize = 24.sp)
//    }
//
//    Row(
//        horizontalArrangement = Arrangement.SpaceEvenly,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Text(text = "A", fontSize = 24.sp)
//        Text(text = "B", fontSize = 24.sp)
//    }
//
//    Box(
//        contentAlignment = Alignment.BottomEnd
//    ){
//        // TODO BOX  COMPOSABLE SIMILAR TO FRAME LAYOUT
////        Text(text = "A", fontSize = 24.sp)
////        Text(text = "B", fontSize = 24.sp)
//
//        Image(painter = painterResource(id = R.drawable.heart), contentDescription = "")
//        Image(painter = painterResource(id = R.drawable.arrow), contentDescription = "")
//
//
//    }

//    // TODO CREATE LIST ITEM
//    Column {
//        listViewItem(R.drawable.wallpaper, "John Doe", "Software Developer")
//        listViewItem(R.drawable.wallpaper, "Amie Shaw", "Technical Lead")
//        listViewItem(R.drawable.wallpaper, "James Lee", "Lead Engineer")
//        listViewItem(R.drawable.wallpaper, "Brad Shane", "Software Developer")
//    }

//    // TODO MODIFIERS DEMO
//    Text(text = "HELLO",
//        color = Color.White,
//        modifier = Modifier
//            .clickable { }
//            .background(Color.Blue)
//            .size(200.dp)
////            .padding(36.dp)
//            .border(4.dp, Color.Red)
//            .clip(CircleShape)
//            .background(Color.Yellow)
//    )


//    CircularImage()


}

@Composable
fun SayCheezy(name: String) {
    Text(
        text = "Hello $name",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        color = Color.Red,
        fontSize = 20.sp,
        textAlign = TextAlign.Right
    )
}

@Composable
fun SayImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Dummy Image",
        colorFilter = ColorFilter.tint(Color.Blue),
        contentScale = ContentScale.Inside

    )
}

@Composable
fun SayButton() {
    Button(
        onClick = { }, colors = ButtonDefaults.buttonColors(
            contentColor = Color.Yellow,
            containerColor = Color.Blue
        ),
        enabled = true
    ) {
        Text(
            text = "Hello"
        )
        Image(
            painter = painterResource(id = R.drawable.arrow),
            contentDescription = "Dummy"
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SayTextInput() {

    TextField(
        value = "Hello CheezyCode",
        onValueChange = {},
        label = { Text(text = "Enter Message") },
        placeholder = {}
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextInput() {


    val state = remember { mutableStateOf("") }
    TextField(
        value = state.value,
        onValueChange = {
            state.value = it

        },
        label = { Text(text = "Enter Message") }
    )
}

//@Preview(showBackground = true, name = "Hello Msg 2")
//@Composable
//fun SayCheezy2(name:String = "Compose"){
//    Text(text = "Hello $name")
//}


@Composable
fun listViewItem(imgId: Int, name: String, occupation: String, modifier: Modifier) {

    Row(modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = imgId),
            contentDescription = "",
            Modifier.size(48.dp)
        )
        Column {
            Text(
                text = name,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = occupation,
                fontWeight = FontWeight.Thin,
                fontSize = 12.sp
            )
        }

    }

}

@Composable
fun CircularImage() {
    Image(
        painter = painterResource(id = R.drawable.img),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .border(2.dp, Color.LightGray, CircleShape),
        contentDescription = ""
    )
}

@Composable
fun ReComposable(){

    val state = remember { mutableStateOf(0.0) }
    Log.d("TAGGED", "Logged during initial Composition")

    Button(onClick = {
        state.value = Math.random()
    }) {

        Log.d("TAGGED", "Logged during both Composition & Recomposition")
        Text(text = state.value.toString())
    }

}

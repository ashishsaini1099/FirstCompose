package com.example.demo.firstcompose.samples

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.demo.firstcompose.R

@Preview(heightDp = 500)
@Composable
fun PreviewItem(){
//    BlogCategory(img = R.drawable.img, title = "Programming", subTitle = "Learn Different Language" )

    // Todo Working fine but view is not recycling
//    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        getCategoryList().map { item ->
//             BlogCategory(img = item.img, title = item.title, subTitle = item.subTitle)
//        }
//    }

    LazyColumn(content = {
        items(getCategoryList()){item ->
            BlogCategory(img = item.img, title = item.title, subTitle = item.subTitle)

        }
    })

}

@Composable
fun BlogCategory(img:Int, title:String, subTitle:String){
    Card(elevation  = CardDefaults.cardElevation(8.dp), modifier = Modifier.padding(8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)) {

            Image(painter = painterResource(id =  img),
                contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f))

            ItemDescription(title, subTitle, Modifier.weight(.8f))
        }
    }
}

@Composable
private fun ItemDescription(title: String, subTitle: String, modifier: Modifier) {
    Column(modifier = modifier) {

        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge
        )

        Text(
            text = subTitle,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Thin
        )
    }
}

data class Category(val img:Int, val title:String, val subTitle: String)

fun getCategoryList(): MutableList<Category> {
    val  list = mutableListOf<Category>()
    list.add(Category(R.drawable.img,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.img,"Technology","News about new Tech"))
    list.add(Category(R.drawable.img,"Full Stack Development ","From Backend to Frontend"))
    list.add(Category(R.drawable.img,"DevOps","Deployment, CI, CD etc."))
    list.add(Category(R.drawable.img,"AI & ML ","Basic Artificial Intelligence"))

    list.add(Category(R.drawable.img,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.img,"Technology","News about new Tech"))
    list.add(Category(R.drawable.img,"Full Stack Development ","From Backend to Frontend"))
    list.add(Category(R.drawable.img,"DevOps","Deployment, CI, CD etc."))
    list.add(Category(R.drawable.img,"AI & ML ","Basic Artificial Intelligence"))

    list.add(Category(R.drawable.img,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.img,"Technology","News about new Tech"))
    list.add(Category(R.drawable.img,"Full Stack Development ","From Backend to Frontend"))
    list.add(Category(R.drawable.img,"DevOps","Deployment, CI, CD etc."))
    list.add(Category(R.drawable.img,"AI & ML ","Basic Artificial Intelligence"))

    list.add(Category(R.drawable.img,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.img,"Technology","News about new Tech"))
    list.add(Category(R.drawable.img,"Full Stack Development ","From Backend to Frontend"))
    list.add(Category(R.drawable.img,"DevOps","Deployment, CI, CD etc."))
    list.add(Category(R.drawable.img,"AI & ML ","Basic Artificial Intelligence"))

    return list
}


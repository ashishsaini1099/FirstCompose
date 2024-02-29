package com.example.demo.firstcompose.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.demo.firstcompose.models.Quote

@Composable
fun QuoteList(data: Array<Quote>, onClick: (quote :Quote)-> Unit) {
    LazyColumn(content = {
        items(data){
            QuotaListItem(quote = it, onClick)
        }
    })

}
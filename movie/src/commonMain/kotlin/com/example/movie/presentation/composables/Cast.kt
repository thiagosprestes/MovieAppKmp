package com.example.movie.presentation.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.core.presentation.theme.primaryWhite
import com.example.movie.data.remote.model.MovieCast

@Composable
fun Cast(cast: List<MovieCast>) {
    Text(
        "Elenco",
        color = primaryWhite,
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold,
        modifier = Modifier.padding(start = 16.dp, bottom = 16.dp)
    )
    LazyRow(contentPadding = PaddingValues(start = 16.dp, bottom = 30.dp)) {
        items(cast, key = { it.id }) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(end = 23.dp)
            ) {
                AsyncImage(
                    model = it.profilePath,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                        .size(90.dp)
                        .clip(RoundedCornerShape(50.dp)),
                    contentDescription = null,
                )
                Text(
                    it.name,
                    color = primaryWhite,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                )
                Text(
                    it.name,
                    color = primaryWhite,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light,
                )
            }
        }
    }
}
package br.senai.sp.jandira.mytrips.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TelaLogin  (modifier: Modifier = Modifier){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Card (
            modifier = Modifier
                .width(100.dp)
                .height(40.dp)
                .align(alignment = Alignment.TopEnd),
            shape = RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 0.dp,
                bottomStart = 20.dp,
                bottomEnd = 0.dp

            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.Red
            )
        ){

        }
        Card(
            modifier = Modifier
                .width(100.dp)
                .height(40.dp)
                .align(alignment = Alignment.BottomStart),
            shape = RoundedCornerShape(
                topStart = 0.dp,
                topEnd = 20.dp,
                bottomStart = 0.dp,
                bottomEnd = 0.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.Red
            )
        ) {

        }

        Column(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .padding(top = 250.dp)
                .padding(horizontal = 15.dp)

        )
        {

            Text(
                text = stringResource(br.senai.sp.jandira.mytrips.R.string.login),
                fontSize = 40.sp,
                color = Color(color = 0xFFE80303),
                fontWeight =  FontWeight.Bold
            )
            Text(
                text = stringResource(br.senai.sp.jandira.mytrips.R.string.sub_login),
                fontSize = 15.sp,
                color = Color(color = 0xFF818181)
            )
        }

        Column (
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .padding(top = 380.dp)

        ){
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text (text = stringResource(br.senai.sp.jandira.mytrips.R.string.email)) },
                modifier = Modifier
                    .width(380.dp)
                    .padding(top = 8.dp),
                shape = RoundedCornerShape(15.dp),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "",
                        tint = Color.Red
                    )
                }
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text (text = stringResource(br.senai.sp.jandira.mytrips.R.string.password)) },
                modifier = Modifier
                    .width(380.dp)
                    .padding(top = 8.dp),
                shape = RoundedCornerShape(15.dp),
                leadingIcon = {

                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "",
                        tint = Color.Red
                    )
                }
            )
        }

        Row (
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .padding(top = 300.dp)
                .padding(end = 10.dp)
        ){
            Button(
                modifier = Modifier
                    .height(40.dp)
                    .width(120.dp)
                ,
                onClick = {},
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(Color.Red)
            ) {
                Text(
                    text = stringResource(br.senai.sp.jandira.mytrips.R.string.sing_in),
                    fontSize = 15.sp
                )
                Icon(
                    modifier = Modifier
                        .padding(start = 5.dp),
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "",
                    tint = Color.White
                )
            }
        }
        Row (
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .padding(top = 420.dp)
                .padding(end = 10.dp)
        ){
            Text(
                text = stringResource(br.senai.sp.jandira.mytrips.R.string.have_an_account),
                fontSize = 15.sp,
                color = Color.Gray
            )
            Text(
                text = stringResource(br.senai.sp.jandira.mytrips.R.string.sing_up),
                fontSize = 15.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold
            )
        }
    }



}


@Preview(showSystemUi = true)
@Composable
private fun TelaLoginPreview() {
    TelaLogin()
}
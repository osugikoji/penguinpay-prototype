package com.playground.transaction.compose.presentation.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.playground.core.extensions.hasMoney
import com.playground.core.extensions.toCurrencyFormat
import com.playground.domain.model.CurrencyCode
import com.playground.transaction.compose.ui.components.button.StandardButton
import com.playground.transaction.compose.ui.components.textfield.StandardTextField
import com.playground.transaction.compose.ui.theme.PlaygroundColor
import com.playground.transaction.compose.ui.theme.PlaygroundTypography
import com.playground.transaction.compose.utils.safeRequestFocus

@Composable
internal fun InsertTransferValueScreen(
    transferValueState: MutableState<String>,
    currencyCode: String = CurrencyCode.UNITED_STATES,
    modifier: Modifier = Modifier,
    onNextAction: () -> Unit = {},
) {
    val focusRequester = remember { FocusRequester() }
    val buttonEnabled = transferValueState.value.hasMoney()
    focusRequester.safeRequestFocus()
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .verticalScroll(rememberScrollState())
    ) {
        TitleSectionScreen()
        TextFieldSection(transferValueState, currencyCode)
        Spacer(modifier = Modifier.weight(1f))
        StandardButton(
            text = "Next",
            enabled = buttonEnabled,
            onClick = { onNextAction() },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp),
        )
    }
}

@Composable
internal fun TitleSectionScreen() {
    Text(
        modifier = Modifier.padding(bottom = 8.dp),
        text = "What is the transfer value",
        style = PlaygroundTypography.Title
    )
    Text(
        modifier = Modifier.padding(bottom = 24.dp),
        text = "Enter a real value that you want to send.",
        style = PlaygroundTypography.Subtitle,
        color = PlaygroundColor.GrayMedium
    )
}

@Composable
internal fun TextFieldSection(
    transferValueState: MutableState<String>,
    currencyCode: String = CurrencyCode.UNITED_STATES,
) {
    val focusRequester = remember { FocusRequester() }
    val transferMoney = transferValueState.value.toCurrencyFormat(currencyCode)
    focusRequester.safeRequestFocus()
    StandardTextField(
        value = transferMoney,
        selectAt = transferMoney.length,
        placeholder = "R$ 0.00",
        hint = "Value",
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
        onTextChanged = { transferValueState.value = it.toCurrencyFormat(currencyCode) },
        modifier = Modifier
            .fillMaxWidth()
            .focusRequester(focusRequester),
    )
}

@Preview(showBackground = true)
@Composable
private fun InsertTransferValuePreview() {
    val transferValue = mutableStateOf("100")
    InsertTransferValueScreen(transferValueState = transferValue)
}
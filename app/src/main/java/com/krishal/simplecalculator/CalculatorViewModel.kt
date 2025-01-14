package com.krishal.simplecalculator

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel: ViewModel() {

    private val _equationText = MutableLiveData<String>("")
    val equationText: LiveData<String> = _equationText
    private val _resultText = MutableLiveData<String>("0")
    val resultText: LiveData<String> = _resultText


    fun onclickedbtn(btn: String) {
        _equationText.value?.let {
            if (btn == "AC") {
                _equationText.value = " "
                _resultText.value = " "
                return
            }

            if(btn=="X"&& it.isNotEmpty())
            {
                _equationText.value=it.substring(0,it.length-1)
            }
            if(btn=="=")
            {
                _equationText.value=_resultText.value
                return
            }
            _equationText.value=it+btn


            //calculate result
            Log.i("equation",_equationText.value.toString())


        }

    }

}
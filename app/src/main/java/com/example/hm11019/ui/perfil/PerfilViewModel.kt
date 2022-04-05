package com.example.hm11019.ui.perfil

import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hm11019.R
import com.example.hm11019.databinding.ActivityMainBinding

class PerfilViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    val message = MutableLiveData<String>()

    fun setMessage (text: String){
        message.value = text
    }

    private val _isOn = MutableLiveData<Boolean>().apply {
        value = true
    }
    val isOn: LiveData<Boolean> = _isOn
    fun toggle(value: Boolean) {
        _isOn.value = value
    }
}


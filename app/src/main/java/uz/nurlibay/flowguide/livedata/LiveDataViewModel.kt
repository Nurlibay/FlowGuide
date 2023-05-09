package uz.nurlibay.flowguide.livedata

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay

class LiveDataViewModel : ViewModel() {

    private val repository = Repository()

    private val _liveData = MutableLiveData<Int>()
    val liveData: LiveData<Int> = _liveData

    init {
        getData()
    }

    private fun getData() {
        viewModelScope.async {

            repeat(10) {
                delay(1000)
                _liveData.postValue(it)
            }
        }
//        viewModelScope.launch(Dispatchers.IO) {
//            repeat(10) {
//                delay(1000)
//                _liveData.postValue(it)
//            }
//        }
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("TTT", "onCleared method invoked")
    }
}
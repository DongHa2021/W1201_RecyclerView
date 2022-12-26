package kr.ac.kumoh.s20180134.w1201_recyclerview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListViewModel : ViewModel() {
    private val songs = ArrayList<String>()
    private val _list = MutableLiveData<ArrayList<String>>()
    val list :LiveData<ArrayList<String>>
        get() = _list

    init {
        _list.value = songs
    }


    fun add(song:String){
        songs.add(song)
        _list.value = songs
    }

    //fun getSong(i:Int) = songs[i]
    //fun getSize() = songs.size
}
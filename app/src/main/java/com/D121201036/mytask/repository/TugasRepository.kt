package com.D121201036.mytask.repository

import androidx.lifecycle.LiveData
import com.D121201036.mytask.data.TugasDao
import com.D121201036.mytask.model.Tugas

class TugasRepository(private val tugasDao:TugasDao) {
    val readAllData: LiveData<List<Tugas>> = tugasDao.readAllDataHome()
    val readAllDataHistory: LiveData<List<Tugas>> = tugasDao.readAllDataRiwayat()
    suspend fun addTugas(tugas: Tugas){
        tugasDao.addTugas(tugas)
    }
    suspend fun updateTugas(tugas: Tugas){
        tugasDao.updateTugas(tugas)
    }
    suspend fun deleteTugas(tugas: Tugas){
        tugasDao.deleteTugas(tugas)
    }
}
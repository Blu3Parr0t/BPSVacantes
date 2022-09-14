package com.bps.bpsvacademo.data.repo

import androidx.room.*
import com.bps.bpsvacademo.data.model.HenchmanEntity

@Dao
interface HenchmanDao {
    //Create (C)
    @Insert
    fun createHenchman(candidate: HenchmanEntity)

    //READ get a single henchman (R)
    @Query("SELECT * FROM HenchmanTable WHERE uId =:id")
    fun getHenchman(id: Int): HenchmanEntity

    //READ get all the henchman (R)
    @Query("SELECT * FROM HenchmanTable")
    fun getAllHenchmen(): List<HenchmanEntity>

    //Update a henchman (U)
    @Update
    fun updateHenchman(henchmanEntity: HenchmanEntity)

    //Delete henchman (D)
    @Delete
    fun deleteHenchman(henchmanEntity: HenchmanEntity)

//    //Delete henchman (D) TODO on your own
//    @Delete("White delete sql")
//    fun deleteHenchmanByID(henchmanEntity: HenchmanEntity)
}

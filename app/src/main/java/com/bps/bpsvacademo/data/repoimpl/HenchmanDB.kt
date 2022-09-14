package com.bps.bpsvacademo.data.repoimpl

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bps.bpsvacademo.data.model.HenchmanEntity
import com.bps.bpsvacademo.data.repo.HenchmanDao

@Database(entities = [HenchmanEntity::class], version = 1)
abstract class HenchmanDB: RoomDatabase() {
    abstract fun henchmanDao(): HenchmanDao
}

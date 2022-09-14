package com.bps.bpsvacademo.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "HenchmanTable")
data class HenchmanEntity(
    @PrimaryKey
    val uId: Int?,
    @ColumnInfo
    val name: String?,
    @ColumnInfo
    val weapon: String?
)

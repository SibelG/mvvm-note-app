package com.bersyte.noteapp.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "notes")
@Parcelize
data class Note(
    @PrimaryKey(autoGenerate = true)
    val noteId: Int,
    val noteTitle: String,
    val noteBody: String,
    val noteDate: String
) : Parcelable

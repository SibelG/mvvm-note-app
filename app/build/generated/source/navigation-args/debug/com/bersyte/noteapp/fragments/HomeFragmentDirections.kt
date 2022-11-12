package com.bersyte.noteapp.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.bersyte.noteapp.R
import com.bersyte.noteapp.model.Note
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToUpdateNoteFragment(
    public val note: Note?
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_updateNoteFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Note::class.java)) {
          result.putParcelable("note", this.note as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Note::class.java)) {
          result.putSerializable("note", this.note as Serializable?)
        } else {
          throw UnsupportedOperationException(Note::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionHomeFragmentToNewNoteFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_newNoteFragment)

    public fun actionHomeFragmentToUpdateNoteFragment(note: Note?): NavDirections =
        ActionHomeFragmentToUpdateNoteFragment(note)
  }
}

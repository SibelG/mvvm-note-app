package com.bersyte.noteapp.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.bersyte.noteapp.R

public class NewNoteFragmentDirections private constructor() {
  public companion object {
    public fun actionNewNoteFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_newNoteFragment_to_homeFragment)
  }
}

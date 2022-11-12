package com.bersyte.noteapp.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.bersyte.noteapp.R

public class UpdateNoteFragmentDirections private constructor() {
  public companion object {
    public fun actionUpdateNoteFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_updateNoteFragment_to_homeFragment)
  }
}

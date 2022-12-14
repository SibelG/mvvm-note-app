// Generated by view binder compiler. Do not edit!
package com.bersyte.noteapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bersyte.noteapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final FloatingActionButton fabDone;

  @NonNull
  public final ConstraintLayout homeFrag;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final SearchView searchView;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView tvNoNoteAvailable;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardView,
      @NonNull FloatingActionButton fabDone, @NonNull ConstraintLayout homeFrag,
      @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView,
      @NonNull SearchView searchView, @NonNull TextView textView3,
      @NonNull TextView tvNoNoteAvailable) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.fabDone = fabDone;
    this.homeFrag = homeFrag;
    this.linearLayout2 = linearLayout2;
    this.recyclerView = recyclerView;
    this.searchView = searchView;
    this.textView3 = textView3;
    this.tvNoNoteAvailable = tvNoNoteAvailable;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.fabDone;
      FloatingActionButton fabDone = ViewBindings.findChildViewById(rootView, id);
      if (fabDone == null) {
        break missingId;
      }

      ConstraintLayout homeFrag = (ConstraintLayout) rootView;

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.search_view;
      SearchView searchView = ViewBindings.findChildViewById(rootView, id);
      if (searchView == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.tv_no_note_available;
      TextView tvNoNoteAvailable = ViewBindings.findChildViewById(rootView, id);
      if (tvNoNoteAvailable == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, cardView, fabDone, homeFrag,
          linearLayout2, recyclerView, searchView, textView3, tvNoNoteAvailable);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

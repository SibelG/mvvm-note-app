// Generated by view binder compiler. Do not edit!
package com.bersyte.noteapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bersyte.noteapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNewNoteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton backHome;

  @NonNull
  public final Button btnCancel;

  @NonNull
  public final Button btnOk;

  @NonNull
  public final View colorView;

  @NonNull
  public final EditText etNoteDesc;

  @NonNull
  public final EditText etNoteTitle;

  @NonNull
  public final EditText etWebLink;

  @NonNull
  public final FloatingActionButton fabButton;

  @NonNull
  public final ConstraintLayout fcnLayout;

  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final ImageView imgDelete;

  @NonNull
  public final ImageView imgMore;

  @NonNull
  public final ImageView imgNote;

  @NonNull
  public final ImageView imgUrlDelete;

  @NonNull
  public final RelativeLayout layoutImage;

  @NonNull
  public final LinearLayout layoutWebUrl;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView tvDateTime;

  @NonNull
  public final TextView tvWebLink;

  private FragmentNewNoteBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton backHome,
      @NonNull Button btnCancel, @NonNull Button btnOk, @NonNull View colorView,
      @NonNull EditText etNoteDesc, @NonNull EditText etNoteTitle, @NonNull EditText etWebLink,
      @NonNull FloatingActionButton fabButton, @NonNull ConstraintLayout fcnLayout,
      @NonNull FrameLayout frameLayout, @NonNull ImageView imgDelete, @NonNull ImageView imgMore,
      @NonNull ImageView imgNote, @NonNull ImageView imgUrlDelete,
      @NonNull RelativeLayout layoutImage, @NonNull LinearLayout layoutWebUrl,
      @NonNull LinearLayout linearLayout, @NonNull TextView tvDateTime,
      @NonNull TextView tvWebLink) {
    this.rootView = rootView;
    this.backHome = backHome;
    this.btnCancel = btnCancel;
    this.btnOk = btnOk;
    this.colorView = colorView;
    this.etNoteDesc = etNoteDesc;
    this.etNoteTitle = etNoteTitle;
    this.etWebLink = etWebLink;
    this.fabButton = fabButton;
    this.fcnLayout = fcnLayout;
    this.frameLayout = frameLayout;
    this.imgDelete = imgDelete;
    this.imgMore = imgMore;
    this.imgNote = imgNote;
    this.imgUrlDelete = imgUrlDelete;
    this.layoutImage = layoutImage;
    this.layoutWebUrl = layoutWebUrl;
    this.linearLayout = linearLayout;
    this.tvDateTime = tvDateTime;
    this.tvWebLink = tvWebLink;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNewNoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNewNoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_new_note, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNewNoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backHome;
      ImageButton backHome = ViewBindings.findChildViewById(rootView, id);
      if (backHome == null) {
        break missingId;
      }

      id = R.id.btnCancel;
      Button btnCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.btnOk;
      Button btnOk = ViewBindings.findChildViewById(rootView, id);
      if (btnOk == null) {
        break missingId;
      }

      id = R.id.colorView;
      View colorView = ViewBindings.findChildViewById(rootView, id);
      if (colorView == null) {
        break missingId;
      }

      id = R.id.etNoteDesc;
      EditText etNoteDesc = ViewBindings.findChildViewById(rootView, id);
      if (etNoteDesc == null) {
        break missingId;
      }

      id = R.id.etNoteTitle;
      EditText etNoteTitle = ViewBindings.findChildViewById(rootView, id);
      if (etNoteTitle == null) {
        break missingId;
      }

      id = R.id.etWebLink;
      EditText etWebLink = ViewBindings.findChildViewById(rootView, id);
      if (etWebLink == null) {
        break missingId;
      }

      id = R.id.fabButton;
      FloatingActionButton fabButton = ViewBindings.findChildViewById(rootView, id);
      if (fabButton == null) {
        break missingId;
      }

      ConstraintLayout fcnLayout = (ConstraintLayout) rootView;

      id = R.id.frameLayout;
      FrameLayout frameLayout = ViewBindings.findChildViewById(rootView, id);
      if (frameLayout == null) {
        break missingId;
      }

      id = R.id.imgDelete;
      ImageView imgDelete = ViewBindings.findChildViewById(rootView, id);
      if (imgDelete == null) {
        break missingId;
      }

      id = R.id.imgMore;
      ImageView imgMore = ViewBindings.findChildViewById(rootView, id);
      if (imgMore == null) {
        break missingId;
      }

      id = R.id.imgNote;
      ImageView imgNote = ViewBindings.findChildViewById(rootView, id);
      if (imgNote == null) {
        break missingId;
      }

      id = R.id.imgUrlDelete;
      ImageView imgUrlDelete = ViewBindings.findChildViewById(rootView, id);
      if (imgUrlDelete == null) {
        break missingId;
      }

      id = R.id.layoutImage;
      RelativeLayout layoutImage = ViewBindings.findChildViewById(rootView, id);
      if (layoutImage == null) {
        break missingId;
      }

      id = R.id.layoutWebUrl;
      LinearLayout layoutWebUrl = ViewBindings.findChildViewById(rootView, id);
      if (layoutWebUrl == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.tvDateTime;
      TextView tvDateTime = ViewBindings.findChildViewById(rootView, id);
      if (tvDateTime == null) {
        break missingId;
      }

      id = R.id.tvWebLink;
      TextView tvWebLink = ViewBindings.findChildViewById(rootView, id);
      if (tvWebLink == null) {
        break missingId;
      }

      return new FragmentNewNoteBinding((ConstraintLayout) rootView, backHome, btnCancel, btnOk,
          colorView, etNoteDesc, etNoteTitle, etWebLink, fabButton, fcnLayout, frameLayout,
          imgDelete, imgMore, imgNote, imgUrlDelete, layoutImage, layoutWebUrl, linearLayout,
          tvDateTime, tvWebLink);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
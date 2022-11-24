package com.bersyte.noteapp.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/bersyte/noteapp/viewmodel/NoteViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "noteRepository", "Lcom/bersyte/noteapp/repository/NoteRepository;", "(Landroid/app/Application;Lcom/bersyte/noteapp/repository/NoteRepository;)V", "addNote", "Lkotlinx/coroutines/Job;", "note", "Lcom/bersyte/noteapp/model/Note;", "deleteNote", "getAllNote", "Landroidx/lifecycle/LiveData;", "", "searchNote", "query", "", "updateNote", "app_release"})
public final class NoteViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.bersyte.noteapp.repository.NoteRepository noteRepository = null;
    
    public NoteViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.bersyte.noteapp.repository.NoteRepository noteRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addNote(@org.jetbrains.annotations.NotNull()
    com.bersyte.noteapp.model.Note note) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteNote(@org.jetbrains.annotations.NotNull()
    com.bersyte.noteapp.model.Note note) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateNote(@org.jetbrains.annotations.NotNull()
    com.bersyte.noteapp.model.Note note) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.bersyte.noteapp.model.Note>> getAllNote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.bersyte.noteapp.model.Note>> searchNote(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return null;
    }
}
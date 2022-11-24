package com.bersyte.noteapp.db;

import java.lang.System;

@androidx.room.Database(entities = {com.bersyte.noteapp.model.Note.class}, version = 1)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/bersyte/noteapp/db/NoteDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getNoteDao", "Lcom/bersyte/noteapp/db/NoteDao;", "Companion", "app_release"})
public abstract class NoteDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.bersyte.noteapp.db.NoteDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.bersyte.noteapp.db.NoteDatabase instance;
    private static final java.lang.Object LOCK = null;
    
    public NoteDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.bersyte.noteapp.db.NoteDao getNoteDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/bersyte/noteapp/db/NoteDatabase$Companion;", "", "()V", "LOCK", "instance", "Lcom/bersyte/noteapp/db/NoteDatabase;", "createDatabase", "context", "Landroid/content/Context;", "invoke", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.bersyte.noteapp.db.NoteDatabase invoke(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.bersyte.noteapp.db.NoteDatabase createDatabase(android.content.Context context) {
            return null;
        }
    }
}
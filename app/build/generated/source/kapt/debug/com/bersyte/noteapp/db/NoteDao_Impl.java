package com.bersyte.noteapp.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bersyte.noteapp.model.Note;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class NoteDao_Impl implements NoteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Note> __insertionAdapterOfNote;

  private final EntityDeletionOrUpdateAdapter<Note> __deletionAdapterOfNote;

  private final EntityDeletionOrUpdateAdapter<Note> __updateAdapterOfNote;

  public NoteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNote = new EntityInsertionAdapter<Note>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `notes` (`noteId`,`noteTitle`,`noteBody`,`noteDate`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Note value) {
        stmt.bindLong(1, value.getNoteId());
        if (value.getNoteTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNoteTitle());
        }
        if (value.getNoteBody() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNoteBody());
        }
        if (value.getNoteDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getNoteDate());
        }
      }
    };
    this.__deletionAdapterOfNote = new EntityDeletionOrUpdateAdapter<Note>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `notes` WHERE `noteId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Note value) {
        stmt.bindLong(1, value.getNoteId());
      }
    };
    this.__updateAdapterOfNote = new EntityDeletionOrUpdateAdapter<Note>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `notes` SET `noteId` = ?,`noteTitle` = ?,`noteBody` = ?,`noteDate` = ? WHERE `noteId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Note value) {
        stmt.bindLong(1, value.getNoteId());
        if (value.getNoteTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNoteTitle());
        }
        if (value.getNoteBody() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNoteBody());
        }
        if (value.getNoteDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getNoteDate());
        }
        stmt.bindLong(5, value.getNoteId());
      }
    };
  }

  @Override
  public Object insertNote(final Note note, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNote.insert(note);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteNote(final Note note, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfNote.handle(note);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateNote(final Note note, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfNote.handle(note);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<Note>> getAllNotes() {
    final String _sql = "SELECT * FROM NOTES ORDER BY noteId DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"NOTES"}, false, new Callable<List<Note>>() {
      @Override
      public List<Note> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfNoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "noteId");
          final int _cursorIndexOfNoteTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "noteTitle");
          final int _cursorIndexOfNoteBody = CursorUtil.getColumnIndexOrThrow(_cursor, "noteBody");
          final int _cursorIndexOfNoteDate = CursorUtil.getColumnIndexOrThrow(_cursor, "noteDate");
          final List<Note> _result = new ArrayList<Note>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Note _item;
            final int _tmpNoteId;
            _tmpNoteId = _cursor.getInt(_cursorIndexOfNoteId);
            final String _tmpNoteTitle;
            if (_cursor.isNull(_cursorIndexOfNoteTitle)) {
              _tmpNoteTitle = null;
            } else {
              _tmpNoteTitle = _cursor.getString(_cursorIndexOfNoteTitle);
            }
            final String _tmpNoteBody;
            if (_cursor.isNull(_cursorIndexOfNoteBody)) {
              _tmpNoteBody = null;
            } else {
              _tmpNoteBody = _cursor.getString(_cursorIndexOfNoteBody);
            }
            final String _tmpNoteDate;
            if (_cursor.isNull(_cursorIndexOfNoteDate)) {
              _tmpNoteDate = null;
            } else {
              _tmpNoteDate = _cursor.getString(_cursorIndexOfNoteDate);
            }
            _item = new Note(_tmpNoteId,_tmpNoteTitle,_tmpNoteBody,_tmpNoteDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Note>> searchNote(final String query) {
    final String _sql = "SELECT * FROM NOTES WHERE noteTitle LIKE ? OR noteBody LIKE?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"NOTES"}, false, new Callable<List<Note>>() {
      @Override
      public List<Note> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfNoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "noteId");
          final int _cursorIndexOfNoteTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "noteTitle");
          final int _cursorIndexOfNoteBody = CursorUtil.getColumnIndexOrThrow(_cursor, "noteBody");
          final int _cursorIndexOfNoteDate = CursorUtil.getColumnIndexOrThrow(_cursor, "noteDate");
          final List<Note> _result = new ArrayList<Note>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Note _item;
            final int _tmpNoteId;
            _tmpNoteId = _cursor.getInt(_cursorIndexOfNoteId);
            final String _tmpNoteTitle;
            if (_cursor.isNull(_cursorIndexOfNoteTitle)) {
              _tmpNoteTitle = null;
            } else {
              _tmpNoteTitle = _cursor.getString(_cursorIndexOfNoteTitle);
            }
            final String _tmpNoteBody;
            if (_cursor.isNull(_cursorIndexOfNoteBody)) {
              _tmpNoteBody = null;
            } else {
              _tmpNoteBody = _cursor.getString(_cursorIndexOfNoteBody);
            }
            final String _tmpNoteDate;
            if (_cursor.isNull(_cursorIndexOfNoteDate)) {
              _tmpNoteDate = null;
            } else {
              _tmpNoteDate = _cursor.getString(_cursorIndexOfNoteDate);
            }
            _item = new Note(_tmpNoteId,_tmpNoteTitle,_tmpNoteBody,_tmpNoteDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

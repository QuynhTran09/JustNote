package com.thongph.justnote.Database;

/**
 * Created by thong on 9/25/2015.
 */
public interface NameDefault {
    final String DB_NAME = "JustNote-DB";
    final int DB_VERSION = 1;

    final String TB_NOTE = "Note";
    final String NOTE_ID = "NoteId";
    final String NOTE_TITLE = "Title";
    final String NOTE_CONTENT = "Content";
    final String NOTE_IMAGE = "Image";
    final String NOTE_FONT = "Font";
    final String NOTE_FONTSIZE = "FontSize";
    final String NOTE_BGCOLOR = "BGColor";
    final String NOTE_TIME_CREATE = "TimeCreate";
    final String NOTE_TAG_ID = "TagId";

    final String TB_TAG = "Tag";
    final String TAG_ID = "TagId";
    final String TAG_NAME = "Name";

    final String SQL_CREATE_TB_NOTE = "CREATE TABLE " + TB_NOTE + " "
            + NOTE_ID + " INTEGER PRIMARY KEY, "
            + NOTE_TITLE + " TEXT, "
            + NOTE_CONTENT + " TEXT, "
            + NOTE_IMAGE + " TEXT, "
            + NOTE_FONT + " TEXT, "
            + NOTE_FONTSIZE + " INTEGER, "
            + NOTE_BGCOLOR + " TEXT, "
            + NOTE_TIME_CREATE + " TEXT, "
            + NOTE_TAG_ID + " INTEGER REFERENCES " + TB_TAG + " (" + TAG_ID + ") )";

    final String SQL_CREATE_TB_TAG = "CREATE TABLE " + TB_TAG + " "
            + TAG_ID + " INTEGER PRIMARY KEY, "
            + TAG_NAME + " TEXT) )";

    final String SQL_DELETE_TB_NOTE = "DROP TABLE " + TB_NOTE + " IF EXISTS";
    final String SQL_DELETE_TB_TAG = "DROP TABLE " + TB_TAG + " IF EXISTS";

}

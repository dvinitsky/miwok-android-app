package com.example.android.miwok;

import android.content.Context;
import android.graphics.drawable.Drawable;

/**
 * Created by danielvinitsky on 9/27/16.
 */
/*This class creates a word with two states: the default translation, and the
    Miwok translation.
    Methods can get either translation.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudioID = NO_IMAGE_PROVIDED;
    private int mIconID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String defaultTranslation, String miwokTranslation, int AudioID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioID = AudioID;

    }

    public Word(String defaultTranslation, String miwokTranslation, int iconID, int AudioID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mIconID = iconID;
        mAudioID = AudioID;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getIconID(){
        return mIconID;
    }
    public boolean hasImage(){
        return mIconID != NO_IMAGE_PROVIDED;
    }

    public int getAudioID() {return mAudioID; }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioID=" + mAudioID +
                ", mIconID=" + mIconID +
                '}';
    }

}

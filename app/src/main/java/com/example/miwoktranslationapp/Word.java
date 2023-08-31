package com.example.miwoktranslationapp;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioId;

    public Word(String defaultTranslation, String miwokTranslation, int mAudioId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        this.mAudioId = mAudioId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int mAudioId){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioId = mAudioId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioId(){
        return mAudioId;
    }
}

package com.example.android.miwok;

/**
 * Created by pedro on 12/17/16.
 */

public class Word {
    private Integer mImageResourceId;
    private Integer mAudioResourceId;
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word(String miwokTranslation, String defaultTranslation) {
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
    }

    public Word(String miwokTranslation, String defaultTranslation, Integer audioResourceId) {
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mAudioResourceId = audioResourceId;
    }

    public Word(String miwokTranslation, String defaultTranslation, Integer imageResourceId,
                Integer audioResourceId) {
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public Integer getImageResourceId() {
        return mImageResourceId;
    }

    public Integer getAudioResourceId() {
        return mAudioResourceId;
    }
}

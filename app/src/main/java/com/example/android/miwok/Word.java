package com.example.android.miwok;

import android.widget.ImageView;

/**
 * Created by karin on 26/07/2017.
 */

public class Word {

    private String wordEnglish;
    private String wordMiwok;
    private ImageView image;


    //adicionar imagem ao construtor
    public Word (String wordEnglish, String wordMiwok){
        this.wordEnglish = wordEnglish;
        this.wordMiwok = wordMiwok;
    }
    String getEnglishTranslation(){
        return wordEnglish;
    }

    String getMiwokTranslation(){
        return wordMiwok;
    }

    ImageView getImage(){
        return image;
    }


}

package com.example.android.translator;

/**
 * Created by harsh on 05/03/2018.
 */

public class Word {

    private String mdefault_word;
    private String mfrench_word;
    private int mimage;

    public Word(String mdefault_word, String mfrench_word,int mimage){
        this.mdefault_word = mdefault_word;
        this.mfrench_word = mfrench_word;
        this.mimage = mimage;
    }

    public Word(String mdefault_word, String mfrench_word){
        this.mdefault_word = mdefault_word;
        this.mfrench_word = mfrench_word;
    }

//    public void setDefault_word(String s){
//        this.mdefault_word =s;
//    }
//    public void setFrench_word(String s){
//        this.mfrench_word=s;
//    }
    public String getDefault_word(){
        return this.mdefault_word;
    }
    public String getFrench_word(){
        return this.mfrench_word;
    }
    public int getMimageId(){return this.mimage;}

}

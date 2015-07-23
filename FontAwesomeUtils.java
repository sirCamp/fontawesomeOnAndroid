package com.your.package;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @autor SirCamp
 * @version v0.1
 * @description class that allow you to set the awesome font to your widget
 */
public class FontAwesometUtils {

  public static void setAwesome(View piece, AssetManager assetPath,String fileName) throws IllegalArgumentException{

    Typeface font = Typeface.createFromAsset(assetPath,fileName);
    if(piece instanceof Button){
        Button button = (Button) piece;
        button.setTypeface(font);
    }
    else if(piece instanceof TextView){
        TextView textview = (TextView) piece;
        textview.setTypeface(font);
    }
    else if(piece instanceof EditText){
        EditText editext = (EditText) piece;
        editext.setTypeface(font);
    }
    else{
        throw new IllegalArgumentException("You must pass an instace of Button, TextView or EditText");
    }
  }
}

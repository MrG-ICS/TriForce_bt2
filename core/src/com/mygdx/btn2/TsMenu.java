package com.mygdx.btn2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.BitmapFontCache;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

/**
 * tsMenu: for Text Skin for the Menu
 * Created by Scott on 2015-11-10.
 */
public class TsMenu extends Skin {

    //Skin skin;
    //Stage stage;
    //TextButton newGameButton, instruction;
    ImageButton imgBtn;
    BitmapFontCache creators, begin;

    TsMenu() {
        BitmapFont font = new BitmapFont();
        creators = new BitmapFontCache(font);
        add("default", font);
        Pixmap pixmap = new Pixmap(Gdx.graphics.getWidth() / 4, Gdx.graphics.getHeight() / 10, Pixmap.Format.RGB888);
        pixmap.setColor(Color.WHITE);
        pixmap.fill();
        add("background", new Texture(pixmap));
        TextButton.TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();
        textButtonStyle.up = newDrawable("background", Color.BLACK);
        textButtonStyle.down = newDrawable("background", Color.WHITE);
        textButtonStyle.checked = newDrawable("background", Color.WHITE);
        textButtonStyle.over = newDrawable("background", Color.WHITE);
        textButtonStyle.font = getFont("default");
        add("default", textButtonStyle);

    }


}

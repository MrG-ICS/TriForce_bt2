package com.mygdx.btn2;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

/**
 * Created by Scott on 2015-11-10.
 */
public class TbMenu extends TextButton {
    String sText;
    Skin skin;

    TbMenu(String _sText, Skin _skin) {
        super(_sText, _skin);
        sText = _sText;
        //skin = _skin;
        this.addListener(new ClickListener() {
            public void clicked(InputEvent e, float x, float y) {
                System.out.println(sText);
            }
        });
    }

    String getWumbo() {
        return "Wumbo";
    }


}

package com.judai.test_app;

import android.graphics.Bitmap;

public class Aus {
    private String _star;
    private String _name;
    private String _class;
    private String _ele1;
    private String _ele2;
    private Bitmap _img;
    private String _sk1;
    private String _sk2;
    private String _sk3;
    private Bitmap _img1;
    private Bitmap _img2;
    private Bitmap _img3;
    private String _info;

    public Aus(String _star, String _name, String _class, String _ele1, String _ele2, Bitmap _img, String _sk1, String _sk2, String _sk3, Bitmap _img1, Bitmap _img2, Bitmap _img3, String _info) {
        this._star = _star;
        this._name = _name;
        this._class = _class;
        this._ele1 = _ele1;
        this._ele2 = _ele2;
        this._img = _img;
        this._sk1 = _sk1;
        this._sk2 = _sk2;
        this._sk3 = _sk3;
        this._img1 = _img1;
        this._img2 = _img2;
        this._img3 = _img3;
        this._info = _info;
    }

    public String get_star() {
        return _star;
    }

    public void set_star(String _star) {
        this._star = _star;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public String get_ele1() {
        return _ele1;
    }

    public void set_ele1(String _ele1) {
        this._ele1 = _ele1;
    }

    public String get_ele2() {
        return _ele2;
    }

    public void set_ele2(String _ele2) {
        this._ele2 = _ele2;
    }

    public Bitmap get_img() {
        return _img;
    }

    public void set_img(Bitmap _img) {
        this._img = _img;
    }

    public String get_sk1() {
        return _sk1;
    }

    public void set_sk1(String _sk1) {
        this._sk1 = _sk1;
    }

    public String get_sk2() {
        return _sk2;
    }

    public void set_sk2(String _sk2) {
        this._sk2 = _sk2;
    }

    public String get_sk3() {
        return _sk3;
    }

    public void set_sk3(String _sk3) {
        this._sk3 = _sk3;
    }

    public Bitmap get_img1() {
        return _img1;
    }

    public void set_img1(Bitmap _img1) {
        this._img1 = _img1;
    }

    public Bitmap get_img2() {
        return _img2;
    }

    public void set_img2(Bitmap _img2) {
        this._img2 = _img2;
    }

    public Bitmap get_img3() {
        return _img3;
    }

    public void set_img3(Bitmap _img3) {
        this._img3 = _img3;
    }

    public String get_info() {
        return _info;
    }

    public void set_info(String _info) {
        this._info = _info;
    }
}

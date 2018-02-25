package com.example.user.hansamustada_1202144142_modul3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2/25/2018.
 */

public class ListItem {

    String merek;
    String desc;
    int logoID;

    ListItem(String Title, String Desc, int logoID) {
        this.merek = merek;
        this.desc = desc;
        this.logoID = logoID;

    }
}
//bikin arraylist

    private List<ListItem> Items;
    private void initializeData() {
        Items = new ArrayList<>();
        Items.add(new ListItem("Aqua", "Airputih kita semua", R.drawable.ic_launcher_background));
        Items.add(new ListItem("Sling", "Airputih Manis semua", R.drawable.ic_launcher_background));
        Items.add(new ListItem("VIT", "Airputih Baru semua", R.drawable.ic_launcher_background));

    }

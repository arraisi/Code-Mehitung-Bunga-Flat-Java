package com.arraisi.main.dao;

import com.arraisi.main.model.BungaModel;

/**
 * Created by arrai on 5/13/2018.
 */
public class BungaDao {
    public static void hitungBunga(BungaModel model) {
        Integer i;
        model.setSisa(model.getPinjaman());
        for (i = 1; i <= model.getKali(); i++) {
            model.setAngsuranPokok(model.getPinjaman() / model.getKali());
            model.setSisa(model.getSisa() - model.getAngsuranPokok());
            model.setBunga(model.getSisa() * (model.getPokokBunga() / 100)/12);
            model.setTotalAngsuran(model.getAngsuranPokok() + model.getBunga());
            System.out.println("Angsuran ke : " + i + ", sisa : " + model.getSisa() + ", pokok angsuran : " + model.getAngsuranPokok() + ", bunga : " + model.getBunga() +
                    ", angsuran : " + model.getTotalAngsuran());
        }


    }
}

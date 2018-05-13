package com.arraisi.main;

import com.arraisi.main.dao.BungaDao;
import com.arraisi.main.model.BungaModel;

import java.util.Scanner;

/**
 * Created by arrai on 5/13/2018.
 */
public class MainApps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BungaModel model = new BungaModel();
        BungaDao dao = new BungaDao();
        System.out.println("Masukan jumlah pinjaman : ");
        model.setPinjaman(input.nextDouble());
        System.out.println("Masukan jumlah Angsuran : ");
        model.setKali(input.nextDouble());
        System.out.println("Masukan pokok bunga ( % ) : ");
        model.setPokokBunga(input.nextDouble());

        dao.hitungBunga(model);
    }

}

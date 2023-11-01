package br.com.pyetro.adapter;

import java.io.File;

public class Demo {
    public static void main(String[] args){
        String file = "test.txt";
        DropBox drop = new DropBox();
        PersistenceData data = new DropBoxAdapter(drop);
        data.record(new File(file));
    }
}

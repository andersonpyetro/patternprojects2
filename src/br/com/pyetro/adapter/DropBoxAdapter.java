package br.com.pyetro.adapter;

import java.io.File;

public class DropBoxAdapter implements PersistenceData {

    private DropBox dropBox;

    public DropBoxAdapter(DropBox dropBox) {
        this.dropBox = dropBox;
    }

    @Override
    public void record(File file) {
        dropBox.download(file.getAbsolutePath());

    }

    @Override
    public File read(String path) {
        DropBoxFile file = dropBox.download(path);
        return new File(file.getLocalPath());
    }
}

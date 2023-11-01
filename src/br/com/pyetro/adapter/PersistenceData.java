package br.com.pyetro.adapter;

import java.io.File;
import java.nio.file.Files;

public interface PersistenceData {

    //byte[] bytes = Files.readAllBytes(File.toPath());
    void record(File file);

    File read(String path);
}

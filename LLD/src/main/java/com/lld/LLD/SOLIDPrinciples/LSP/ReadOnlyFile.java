package com.lld.LLD.SOLIDPrinciples.LSP;

public class ReadOnlyFile implements ReadableFile{
    @Override
    public void read() {
        System.out.println("read");
    }
}

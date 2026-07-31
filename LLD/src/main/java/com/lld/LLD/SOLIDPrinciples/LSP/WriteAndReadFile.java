package com.lld.LLD.SOLIDPrinciples.LSP;

public class WriteAndReadFile extends ReadOnlyFile implements WriteableFile{
    @Override
    public void write() {
        System.out.println("write");
    }
}

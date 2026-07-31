package com.lld.LLD.SOLIDPrinciples.LSP;

public class Mail{

    public static void read(ReadableFile readableFile){
        readableFile.read();
    }
    public static void main(String[] args) {
        ReadableFile readableFile=new ReadOnlyFile();
        readableFile.read();

        WriteAndReadFile writeableFile=new WriteAndReadFile();
        writeableFile.write();
        writeableFile.read();

        read(writeableFile);
    }
}

package com.lld.LLD.SOLIDPrinciples.ISP;

public class SimplerPrinter implements Printer{
    @Override
    public void print(Document doc) {
        System.out.println("Printing the document");
    }
}

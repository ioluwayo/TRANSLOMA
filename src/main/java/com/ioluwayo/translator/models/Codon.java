package com.ioluwayo.translator.models;

import java.util.List;

public class Codon {
    Nucleotide first;
    Nucleotide second;
    Nucleotide third;

    public Codon(Nucleotide first, Nucleotide second, Nucleotide third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public Codon(List<Nucleotide> nucleotides){
        this.first = nucleotides.get(0);
        this.second = nucleotides.get(1);
        this.third = nucleotides.get(2);

    }
    public Nucleotide getFirst() {
        return first;
    }

    public Nucleotide getSecond() {
        return second;
    }

    public Nucleotide getThird() {
        return third;
    }

    @Override
    public String toString() {
        return "Codon{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}

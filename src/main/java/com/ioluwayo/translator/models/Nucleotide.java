package com.ioluwayo.translator.models;

import java.util.HashMap;

public enum Nucleotide {
    A("Adenine"),
    C("Cytosine"),
    G("Guanine"),
    T("Thymine"),
    U("Uracil"){
        @Override
        public Boolean isPresentInRNA() {
            return true;
        }
    };
    private final String name;
    /**
     * map to get molecular weights.
     */
    private static final HashMap<Nucleotide, Double> MOLAR_MASS_BY_NUCLEOTIDE_MAP;
    /**
     * map get reverse compliment.
     */
    private static final HashMap<Nucleotide, Nucleotide> COMPLIMENT_BY_NUCLEOTIDE_MAP;
    static {
        MOLAR_MASS_BY_NUCLEOTIDE_MAP = new HashMap<>();
        MOLAR_MASS_BY_NUCLEOTIDE_MAP.put(A,135.13);
        MOLAR_MASS_BY_NUCLEOTIDE_MAP.put(C,111.10);
        MOLAR_MASS_BY_NUCLEOTIDE_MAP.put(G,151.13);
        MOLAR_MASS_BY_NUCLEOTIDE_MAP.put(T,126.12);
        MOLAR_MASS_BY_NUCLEOTIDE_MAP.put(U,112.09);

        COMPLIMENT_BY_NUCLEOTIDE_MAP = new HashMap<>();
        COMPLIMENT_BY_NUCLEOTIDE_MAP.put(A,T);
        COMPLIMENT_BY_NUCLEOTIDE_MAP.put(C,G);
        COMPLIMENT_BY_NUCLEOTIDE_MAP.put(G,C);
        COMPLIMENT_BY_NUCLEOTIDE_MAP.put(T,A);
        COMPLIMENT_BY_NUCLEOTIDE_MAP.put(U,A);
    }

    Nucleotide(final String name) {
        this.name=name;
    }
    public Nucleotide getCompliment(){
        return COMPLIMENT_BY_NUCLEOTIDE_MAP.get(this);
    }
    public Double getMolarMass(){
        return MOLAR_MASS_BY_NUCLEOTIDE_MAP.get(this);
    }
    public String getName() {
        return name;
    }
    public Boolean isPresentInRNA(){
        return false;
    }

    @Override
    public String toString() {
        return "Nucleotide{" +
                "name='" + name + '\'' +
                '}';
    }
}

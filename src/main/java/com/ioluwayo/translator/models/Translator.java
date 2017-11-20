package com.ioluwayo.translator.models;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.HashMap;
import java.util.Map;

public class Translator {
    static final Map<Character,Character> complementMap = new HashMap<Character, Character>()
    {{
        put('U','A');
        put('A','U');
        put('G','C');
        put('C','G');
    }};
    static final Map<String, Character> aminoAcidByCodonMap = new HashMap<String, Character>()
    {{
        put("UUU", 'F');
        put("UUC", 'F');
        put("UUA", 'L');
        put("UUG", 'L');
        put("CUU", 'L');
        put("CUC", 'L');
        put("CUA", 'L');
        put("CUG", 'L');
        put("AUU", 'I');
        put("AUC", 'I');
        put("AUA", 'I');
        put("AUG", 'M');
        put("GUU", 'V');
        put("GUC", 'V');
        put("GUA", 'V');
        put("GUG", 'V');
        put("UCU", 'S');
        put("UCC", 'S');
        put("UCA", 'S');
        put("UCG", 'S');
        put("CCU", 'P');
        put("CCC", 'P');
        put("CCA", 'P');
        put("CCG", 'P');
        put("ACU", 'T');
        put("ACC", 'T');
        put("ACA", 'T');
        put("ACG", 'T');
        put("GCU", 'A');
        put("GCC", 'A');
        put("GCA", 'A');
        put("GCG", 'A');
        put("UAU", 'Y');
        put("UAC", 'Y');
        put("UAA", '*');
        put("UAG", '*');
        put("CAU", 'H');
        put("CAC", 'H');
        put("CAA", 'Q');
        put("CAG", 'Q');
        put("AAU", 'N');
        put("AAC", 'N');
        put("AAA", 'K');
        put("AAG", 'K');
        put("GAU", 'D');
        put("GAC", 'D');
        put("GAA", 'E');
        put("GAG", 'E');
        put("UGU", 'C');
        put("UGC", 'C');
        put("UGA", '*');
        put("UGG", 'W');
        put("CGU", 'R');
        put("CGC", 'R');
        put("CGA", 'R');
        put("CGG", 'R');
        put("AGU", 'S');
        put("AGC", 'S');
        put("AGA", 'R');
        put("AGG", 'R');
        put("GGU", 'G');
        put("GGC", 'G');
        put("GGA", 'G');
        put("GGG", 'G');

    }};
    private String translateToAminoAcid(String frame){
        StringBuilder aminoAcidBuilder = new StringBuilder();
        for (int i=0; i<frame.length()-2;i+=3){
            String codon = frame.substring(i,i+3);
            aminoAcidBuilder.append(aminoAcidByCodonMap.get(codon));
        }
        return aminoAcidBuilder.toString();
    }
    public Translation translate(String sequence){
        sequence = sequence.toUpperCase(); // ensure its in uppercase.
        Translation translation = new Translation();
        translation.setSequence(sequence);
        translation.setFrame1(translateToAminoAcid(sequence));
        translation.setFrame2(translateToAminoAcid(sequence.substring(1)));
        translation.setFrame3(translateToAminoAcid(sequence.substring(2)));

        // build complementary sequence and translate from 5'->3' end. pretty much reverse compliment
        StringBuilder reverseBuilder = new StringBuilder();
        for(Character c: sequence.toCharArray())
            reverseBuilder.append(complementMap.get(c));
        reverseBuilder.reverse();

        String reverseSequence = reverseBuilder.toString();
        translation.setReverseFrame1(translateToAminoAcid(reverseSequence));
        translation.setReverseFrame2(translateToAminoAcid(reverseSequence.substring(1)));
        translation.setReverseFrame3(translateToAminoAcid(reverseSequence.substring(2)));
        return translation;
    }
}

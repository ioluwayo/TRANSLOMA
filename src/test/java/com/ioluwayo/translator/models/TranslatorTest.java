package com.ioluwayo.translator.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class TranslatorTest {
    @Test
    public void translateToAminoAcid() throws Exception {
        String DNA = "AAGAAAUAG";
        Translator translator = new Translator();
        Translation expectedTranslation = new Translation();
        expectedTranslation.setSequence(DNA);
        expectedTranslation.setFrame1("KK*");
        expectedTranslation.setFrame2("RN");
        expectedTranslation.setFrame3("EI");
        expectedTranslation.setReverseFrame1("LFL");
        expectedTranslation.setReverseFrame2("YF");
        expectedTranslation.setReverseFrame3("IS");
        Translation translation = translator.translate(DNA);
        System.out.println(translation);
        System.out.println();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!---------!!!!!!!!!");
        System.out.println(expectedTranslation);
        assertEquals(expectedTranslation,translator.translate(DNA));
    }

}
package com.ioluwayo.translator.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class TranslatorTest {
    @Test
    public void translateTest() throws Exception {
        String DNA = "AAGAAAUAG";
        Translator translator = new Translator();
        Translation expectedTranslation = new Translation();
        expectedTranslation.setSequence(DNA);
        expectedTranslation.addFrame("KK*");
        expectedTranslation.addFrame("RN");
        expectedTranslation.addFrame("EI");
        expectedTranslation.addFrame("LFL");
        expectedTranslation.addFrame("YF");
        expectedTranslation.addFrame("IS");
        assertEquals(expectedTranslation,translator.translate(DNA));
    }

    @Test(expected = IllegalArgumentException.class)
    public void translateExceptionTest() throws Exception {
        Translator translator = new Translator();
        translator.translate("AUGD");
    }
}
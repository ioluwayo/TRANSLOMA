package com.ioluwayo.translator.models;

import javax.sound.midi.Sequence;

public class Translation {
    String sequence;
    long   length;
    String frame1;
    String frame2;
    String frame3;
    String reverseFrame1;
    String reverseFrame2;
    String reverseFrame3;

    public Translation(){

    }
    public String getSequence() {
        return sequence;
    }

    public long getLength() {
        return length;
    }

    public String getFrame1() {
        return frame1;
    }

    public String getFrame2() {
        return frame2;
    }

    public String getFrame3() {
        return frame3;
    }

    public String getReverseFrame1() {
        return reverseFrame1;
    }

    public String getReverseFrame2() {
        return reverseFrame2;
    }

    public String getReverseFrame3() {
        return reverseFrame3;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
        this.length = sequence.length();
    }

    public void setFrame1(String frame1) {
        this.frame1 = frame1;
    }

    public void setFrame2(String frame2) {
        this.frame2 = frame2;
    }

    public void setFrame3(String frame3) {
        this.frame3 = frame3;
    }

    public void setReverseFrame1(String reverseFrame1) {
        this.reverseFrame1 = reverseFrame1;
    }

    public void setReverseFrame2(String reverseFrame2) {
        this.reverseFrame2 = reverseFrame2;
    }

    public void setReverseFrame3(String reverseFrame3) {
        this.reverseFrame3 = reverseFrame3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Translation)) return false;

        Translation that = (Translation) o;

        if (length != that.length) return false;
        if (sequence != null ? !sequence.equals(that.sequence) : that.sequence != null) return false;
        if (frame1 != null ? !frame1.equals(that.frame1) : that.frame1 != null) return false;
        if (frame2 != null ? !frame2.equals(that.frame2) : that.frame2 != null) return false;
        if (frame3 != null ? !frame3.equals(that.frame3) : that.frame3 != null) return false;
        if (reverseFrame1 != null ? !reverseFrame1.equals(that.reverseFrame1) : that.reverseFrame1 != null)
            return false;
        if (reverseFrame2 != null ? !reverseFrame2.equals(that.reverseFrame2) : that.reverseFrame2 != null)
            return false;
        return reverseFrame3 != null ? reverseFrame3.equals(that.reverseFrame3) : that.reverseFrame3 == null;
    }

    @Override
    public int hashCode() {
        int result = sequence != null ? sequence.hashCode() : 0;
        result = 31 * result + (int) (length ^ (length >>> 32));
        result = 31 * result + (frame1 != null ? frame1.hashCode() : 0);
        result = 31 * result + (frame2 != null ? frame2.hashCode() : 0);
        result = 31 * result + (frame3 != null ? frame3.hashCode() : 0);
        result = 31 * result + (reverseFrame1 != null ? reverseFrame1.hashCode() : 0);
        result = 31 * result + (reverseFrame2 != null ? reverseFrame2.hashCode() : 0);
        result = 31 * result + (reverseFrame3 != null ? reverseFrame3.hashCode() : 0);
        return result;
    }
}

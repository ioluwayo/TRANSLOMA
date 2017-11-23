package com.ioluwayo.translator.models;

import javax.sound.midi.Sequence;
import java.util.ArrayList;
import java.util.List;

public class Translation {
    String sequence;
    long length;
    List<String> frames;


    public Translation() {
        frames = new ArrayList<>();
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getSequence() {
        return sequence;
    }

    public long getLength() {
        return length;
    }

    public List<String> getFrames() {
        return frames;
    }
    public void addFrame(String sequence){
        frames.add(sequence);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Translation)) return false;

        Translation that = (Translation) o;

        if (length != that.length) return false;
        if (sequence != null ? !sequence.equals(that.sequence) : that.sequence != null) return false;
        return frames != null ? frames.equals(that.frames) : that.frames == null;
    }

    @Override
    public int hashCode() {
        int result = sequence != null ? sequence.hashCode() : 0;
        result = 31 * result + (int) (length ^ (length >>> 32));
        result = 31 * result + (frames != null ? frames.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Translation{" +
                "sequence='" + sequence + '\'' +
                ", length=" + length +
                ", frames=" + frames +
                '}';
    }
}
package com.example.peter.coptic;

/**
 * Created by Peter on 31/9/2017.
 */

public class Letter {

    public static final String LETTER_NAME = "letter_name";
    public static final String LETTER_IMAGE = "letter_image";
    public static final String LETTER_DESCRIPTION = "letter_description";

    private String name;
    private int image;
//    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public class CopticWord{
        private String word; // el kelma el aslia
        private String arabic; // el ebti el mo3rab bta3ha
        private String meaning; // el ma3na el 3arabi bta3ha
        private int image;
        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public String getArabic() {
            return arabic;
        }

        public void setArabic(String arabic) {
            this.arabic = arabic;
        }

        public String getMeaning() {
            return meaning;
        }

        public void setMeaning(String meaning) {
            this.meaning = meaning;
        }

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }
    }
}

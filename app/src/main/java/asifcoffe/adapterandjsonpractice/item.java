package asifcoffe.adapterandjsonpractice;

/**
 * Created by hp on 7/14/2017.
 */

public class item {
    int image;
    String s1,s2;

    public String getS2() {
        return s2;
    }

    public item(String s2) {
        this.s2 = s2;
    }

    public int getImage() {
        return image;
    }

    public String getS1() {
        return s1;
    }

    public item(int image, String s1,String s2) {
        this.image = image;
        this.s1 = s1;
        this.s2 = s2;
    }
}


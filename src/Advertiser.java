import java.util.ArrayList;

public class Advertiser extends BaseAdvertising{
    private static int totalClicks;
    public static ArrayList<Advertiser> advertisers;
    private String name;
    private ArrayList<Ad> ads;

    public Advertiser(int id, String name) {
        super(id);
        this.name = name;
        advertisers.add(this);
    }

    public static int getTotalClicks() {
        return totalClicks;
    }
    public static String help() {
        return "Something";
    }
    public static String describeMe() {
        return "Something";
    }
    @Override
    public void incClicks() {
        super.incClicks();
        totalClicks++;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addAd(Ad ad) {
        this.ads.add(ad);
    }
}

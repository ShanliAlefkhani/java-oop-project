import java.util.ArrayList;

public class Advertiser extends BaseAdvertising{
    private static int totalClicks;
    public static ArrayList<Advertiser> list = new ArrayList<>();
    private String name;
    private ArrayList<Ad> ads = new ArrayList<>();

    public Advertiser(int id, String name) throws Exception {
        super(id);
        for(Advertiser advertiser : list) {
            if(advertiser.getId() == id) {
                throw new Exception("There is an advertiser with this id!");
            }
        }
        this.name = name;
        list.add(this);
    }

    public static int getTotalClicks() {
        return totalClicks;
    }
    public static String help() {
        return "Advertiser Class Fields:\n" +
                "• id\n" +
                "• name\n" +
                "• clicks\n" +
                "• views\n";
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

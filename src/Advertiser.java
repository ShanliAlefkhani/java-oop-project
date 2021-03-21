public class Advertiser extends BaseAdvertising{
    static int totalClicks;
    private String name;

    public Advertiser(int id, String name) {
        super(id);
        this.name = name;
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
}

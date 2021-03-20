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
    @Override
    public void incClicks() {
        super.incClicks();
        totalClicks++;
    }
    @Override
    public String describeMe() {
        return null;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String help() {
        return "Something";
    }
}

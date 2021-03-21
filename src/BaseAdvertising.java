public abstract class BaseAdvertising {
    final private int id;
    private int clicks = 0;
    private int views = 0;

    public BaseAdvertising(int id) {
        this.id = id;
    }

    public static String describeMe() {
        return "Something";
    }
    public int getId() { return this.id; }
    public int getClicks() {
        return this.clicks;
    }
    public int getViews() {
        return this.views;
    }
    public void incClicks() {
        this.clicks++;
    }
    public void incViews() {
        this.views++;
    }
}

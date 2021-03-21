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
    int getClicks() {
        return this.clicks;
    }
    int getViews() {
        return this.views;
    }
    void incClicks() {
        this.clicks++;
    }
    void incViews() {
        this.views++;
    }
}

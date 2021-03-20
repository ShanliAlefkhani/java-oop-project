public abstract class BaseAdvertising {
    private int id;
    private int clicks;
    private int views;

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
